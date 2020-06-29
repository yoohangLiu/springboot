var createExam = new Vue({
    el: '#kaosheng',
    data: {
        zj_num: '51018119971106441X',
        bm_state: -1, // 判断是否有报考权限

        // 直接从后端获取
        student_id: -1,// 传
        student_type:-1,
        bk_major_id: -1,// 传
        bk_major: '',// 用于显示
        
        // 动态选择考次、考试类型
        examList: [],
        type_name: '',//传到后端时记得转换成数字
        type_name_list:[],
        kc_code: -1,
        kc_code_list: [],
        
        bk_course_indexs: [],
        bk_course_id: [],// 根据indexs构建
        bk_course_list: [],
        courses_bk_now: 0,
        
        // 根据学生类型选择考区或主考院校
        kqu_id: '',
        kqu_name:'',
        kqu_list: [],
        kqu_name_list:[],// 跟kqu_list相对应的名字
        target_school_id: -1,
        target_school_name: '',
        target_school_list: [],
        
        isOk: 1,
        msg: '',
        bkState:-1,
    },
    created: function () {
        this.getStudentInfoLimitByZj();
        this.getExamsLimitByTime();
        //由于异步问题当前专业还没有设置
        // this.getCoursesLimitByMajorName();
    },
    methods: {
        // 页面初始化
        // 1. 初始化学生id、学生类型、报考专业：根据身份证查
        getStudentInfoLimitByZj: function () {
            var that = this;
            axios.get('/kaosheng/getStudentInfoLimitByZj/' + that.zj_num)
                .then(function (response) {
                    // flag=0表示考生未报名
                    console.log("getStudentInfoLimitByZj response flag", response.data.flag);
                    if (response.data.flag == 1) {
                        // 考生已经报名
                        var student_info = response.data.data;
                        console.log("student_info", student_info);
                        that.student_id = student_info[0].student_id;
                        that.bk_major_id = student_info[0].bk_major;
                        that.student_type = student_info[0].stu_type;
                        that.bm_state = student_info[0].bm_state;
                        

                        // 检查考生报名状态，如果未审核不予报考
                        if (that.bm_state == 0) {
                            that.isOk = -1;
                            that.msg = "当前未审核，不能报考！";
                        } else if (that.bm_state == 1) {
                            // 可报考
                            that.isOk = 1;
                        } else if (that.bm_state == 2) {
                            // 查询已经报考课程数 如果未到4门 则还可报考
                            that.getCoursesLimitByStuBk();
                        } else if (that.bm_state == 3) {
                            // 查询已经报考课程数 如果未到4门 则还可报考
                            that.getCoursesLimitByStuBk();
                        }
                        // 将专业id转换成专业名字 方便显示
                        that.getMajorNameByMajorId(that.bk_major_id);
                    } else { 
                        that.isOk = -1;
                        that.msg ='当前未报名, <a href="/kaosheng/goto-personal-regist">跳转到报名</a>.';
                    }               
                })
                .catch(function (error) {
                    console.log(error);
                });
        },

        // 获取已经报考课程信息
        getCoursesLimitByStuBk: function () {
            var that = this;
            axios.get('/kaosheng/getCoursesLimitByStuBk?student_id=' + that.student_id)
                .then(function (response) {
                    console.log("bk_course_list", response.data.data);
                    that.courses_bk_now = response.data.data.length;   
                    console.log("查询已经报考课程数:", that.courses_bk_now, response.data.data.length);
                    
                    that.isOk = -1;
                    if (that.courses_bk_now >= 4 && that.bm_state == 3) {
                        that.msg = "已缴费, 恭喜你完成报考！";
                    }else {
                        that.msg = '已报考 ' + that.courses_bk_now + ' 门课程, 上限 4 门, <a href="/kaosheng/goto-personal-pay">跳转到缴费并查看课程详情</a>.';
                    }
                })
                .catch(function (error) {
                    console.log(error);
                });
        },

        getMajorNameByMajorId: function (bk_major_id) {
            var that = this;
            var major_name;
            axios.get('/kaosheng/getAllMajors')
                .then(function (response) {
                    console.log("所有专业",response.data.data);
                    var bk_major_list = response.data.data;
                    for (i = 0; i < bk_major_list.length; i++) {
                        if (bk_major_list[i].major_id == bk_major_id) {
                            major_name = bk_major_list[i].major_name;
                        }
                    }
                    console.log("major_name:" + major_name);
                    // 设置本地变量
                    that.bk_major = major_name;
                })
                .catch(function (error) {
                    console.log(error);
                });
        },
        // 2. 初始化考试类型、考次
        getExamsLimitByTime: function () {
            var that = this;
            axios.get('/kaosheng/getExamsLimitByTime')
                .then(function (response) {
                    that.examList = response.data.data;
                    console.log("examList修改type_name为汉字：", that.examList);
                    for (i = 0; i < that.examList.length; i++){
                        that.examList[i].type_name = that.examNumToName(that.examList[i].type_name);
                        // 生成考试类型数组
                        if (that.type_name_list.indexOf(that.examList[i].type_name) == -1) {
                            that.type_name_list.push(that.examList[i].type_name);
                        }
                    }
                    // 只用考试类别的type_name
                    // that.type_name_list = that.examList;
                })
                .catch(function (error) {
                    console.log(error);
                });
        },
        // 设置合适的kc列表
        getProperKcCode: function (type_name, examList) {
            var kc_code_list = [];
            for (i = 0; i < examList.length; i++){
                if (examList[i].type_name == type_name) {
                    kc_code_list.push(examList[i].kc_code);
                }
            }
            return kc_code_list;
        },
        examNumToName: function (num) {
            var name = '';
            // 统考、省考、英语听说、毕业论文、实践性环节
            if (num == 1) {
                name = '统考';
            } else if (num == 2) {
                name = '省考';
            } else if (num == 3) {
                name = '英语听说';
            } else if (num == 4) {
                name = '毕业论文';
            } else if (num == 5) {
                name = '实践性环节';
            }
            return name;
        },
        examNameToNum: function (name) {
            var num;
            // 统考、省考、英语听说、毕业论文、实践性环节
            if (name == '统考') {
                num = 1;
            } else if (name == '省考') {
                num = 2;
            } else if (name == '英语听说') {
                num = 3;
            } else if (name == '毕业论文') {
                num = 4;
            } else if (name == '实践性环节') {
                num = 5;
            }
            return num;
        },
        // 3. 初始化报考课程列表
        getCoursesLimitByMajorName: function () { 
            var that = this;
            console.log("报考专业名:" + that.bk_major)
            axios.get('/kaosheng/getCoursesLimitByMajor?major_name=' + that.bk_major)
                .then(function (response) {
                    // console.log("符合条件课程", response.data.data);
                    that.bk_course_list = response.data.data;
                })
                .catch(function (error) {
                    console.log(error);
                });
        },
        // 4. 初始化考区
        getKaoQuLimitByExam: function () {
            var that = this;
            axios.post('/kaosheng/getKaoQuLimitByExam',
                {
                    type_name: that.examNameToNum(that.type_name),
                    kc_code: that.kc_code
                })
                .then(function (response) {
                    console.log("考区", response.data.data);
                    // 提取考区号
                    var temp = response.data.data;
                    for (i = 0; i < temp.length; i++){
                        var kqu = temp[i].kqu_id;
                        if (that.kqu_list.indexOf(kqu) == -1) {
                            that.kqu_list.push(kqu);
                        }
                    }
                    console.log("考区列表", that.kqu_list);
                    that.getKaoQuNameLimitByKquId();
                })
                .catch(function (error) {
                    console.log(error);
                });
        },
        getKaoQuNameLimitByKquId: function () {
            var that = this;
            console.log("考区列表", that.kqu_list);
            axios.get('/kaosheng/getKaoQuNameLimitByKquId?kqu_list='+that.kqu_list)
                .then(function (response) {
                    console.log("考区名字", response.data.data);
                    that.kqu_name_list = response.data.data;
                })
                .catch(function (error) {
                    console.log(error);
                });
        },
        // 5. 初始化主考院校列表
        getZhuKaoSchoolsLimitByMajor: function () {
            var that = this;
            axios.get('/kaosheng/getZhuKaoSchoolsLimitByMajor?major_name=' + that.bk_major)
                .then(function (response) {
                    console.log("主考院校", response.data.data);
                    that.target_school_list = response.data.data;
                })
                .catch(function (error) {
                    console.log(error);
                });
         },
        // 页面检查

        // 设置用户选择
        choose_exam_type(index) {
            this.type_name = this.type_name_list[index];
            // 改变考试类型，考次初始化
            this.kc_code = -1;
            // 设置考次列表
            this.kc_code_list = this.getProperKcCode(this.type_name, this.examList);
        },
        choose_kc_code(index) {
            this.kc_code = this.kc_code_list[index];
        },
        choose_bk_course(index) {
            var that = this;
            if (that.bk_course_indexs.indexOf(index) == -1) {
                if ((that.bk_course_indexs.length + that.courses_bk_now) < 4) {
                    that.bk_course_indexs.push(index);
                } else {
                    that.isOk = -1;
                    that.msg = '最多可报考 4 门课程！';
                }
            }
        },
        delete_bk_course(index) {
            var that = this;
            // 删除数组指定元素
            var pos = that.bk_course_indexs.indexOf(index);
            that.bk_course_indexs.splice(pos, 1);
        },
        choose_kqu_id(index) {
            var that = this;
            that.kqu_id = that.kqu_list[index];
            that.kqu_name = that.kqu_name_list[index];
            console.log("选择的考区id：" + that.kqu_id);
        },
        choose_target_school(index) {
            var that = this;
            that.target_school_id = that.target_school_list[index].school_id;
            that.target_school_name = that.target_school_list[index].school_name;
        },
        insertBk() {
            var that = this; 
            for (i = 0; i < that.bk_course_indexs.length; i++){
                var course_id = that.bk_course_list[that.bk_course_indexs[i]].course_id;
                axios.post('/kaosheng/insertBk', {
                    student_id: that.student_id,
                    bk_major: that.bk_major_id,
                    type_name: that.examNameToNum(that.type_name),
                    kc_code: that.kc_code,
                    bk_course_id: course_id,
                    kqu_id: that.kqu_id,
                    target_school_id: that.target_school_id,
                })
                    .then(function (response) {
                        console.log("成功报考", response.data.data);
                        alert("恭喜你，成功报考!");
                        that.bkState = 1;
                    })
                    .catch(function (error) {
                        console.log(error);
                        alert("报考失败!");
                    });
            }    
        },
    },
});