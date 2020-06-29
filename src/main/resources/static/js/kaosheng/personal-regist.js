var createExam = new Vue({
    el: '#kaosheng',
    data: {
        //获取用户信息
        user: {},

        stu_name: '',
        sex: 0,
        sex_list: ['男', '女'],
        zj_type: 0,
        zj_type_list: ['居民省份证', '军官证', '警官证', '文职干部证', '士兵证', '港澳台人员省份证', '外籍人员护照'],
        zj_num: '',
        age: '等待输入证件号码',
        nation: '',
        zzmm: -1,
        zzmm_list: ['党员', '团员', '其他', '未采集'],
        huji_type: 0,
        huji_type_list: ['城镇', '农村', '未采集'],
        bk_level: 0,
        bk_level_list: ['本科', '专科'],
        bk_major_id:1,
        bk_major: '',
        bk_major_list: [],
        phone: '',
        health: 0,
        health_list: ['健康', '残疾'],
        stu_type: 0,
        stu_type_list: ['社会型', '应用型'],
        sz_num: '01',
        sz_name:'',
        sz_num_list: [],
        qx_num: '01',
        qx_name: '',
        qx_num_list: [],
        taget_school_id:1,
        taget_school: '',
        taget_school_list: [],

        stu_img: '',
        isOk: 1,
        msg: '',
        bmState: -1,
        flag: 1 // 默认不可报名
    },
    created: function () {
        this.getAllMajors();
        this.getAllCities();
        this.getAllDistricts('01');
        this.getAllZhuKaoSchools();
    },

    // 使用 mounted 方法来从 localStorage 中加载数据
    mounted() {// vue实例被挂载后调用
        if (localStorage.getItem('user')) {
            try {
                // 从本地story获取用户登录信息并设置
                var user = JSON.parse(localStorage.getItem('user'));
                this.user = user;
                this.zj_num = user.account;
                console.log("localStorage获取zj_num:", this.zj_num);

                // 证件检查并设置年龄
                this.zj_num_check();

                // 设施完信息后调用的函数
                this.getStudentInfoLimitByZj();
            } catch (e) {
                console.log("catch(e)");
                localStorage.removeItem('user');
            }
        } else {
            window.location.href = '/logout';
        }
    },

    methods: {
        // 检查是否为新考生
        getStudentInfoLimitByZj: function () {
            var that = this;
            axios.get('/kaosheng/getStudentInfoLimitByZj/' + that.zj_num)
                .then(function (response) {
                    var student_info;
                    if (response.data.flag == 1) {
                        student_info = response.data.data[0];
                    } else { 

                    }
                    console.log("student_info", response.data, student_info);
                    
                    if (response.data.flag == 0) { 
                        // 新考生,可报名
                        that.isOk = 1;
                        that.flag = 0;
                    } else {
                        // 老考生，不可报名
                        that.isOk = -2;
                        that.flag = 1;
                        // 检查考生报名状态，如果未审核不予报考
                        if (student_info.bm_state == 0) {
                            that.msg = '已报名, 当前未审核!';
                        } else if (student_info.bm_state == 1) {
                            that.msg = '已审核, <a href="/kaosheng/goto-personal-bk">跳转到报考</a>.';
                        } else if (student_info.bm_state == 2) {
                            that.msg = '已报考, <a href="/kaosheng/goto-personal-pay">跳转到缴费并查看课程信息</a>.';
                        } else if (student_info.bm_state == 3) {
                            that.msg = "已缴费, 恭喜你完成报考！";
                        }
                    }
                })
                .catch(function (error) {
                    console.log(error);
                });
        },

        // 报名页面初始化
        // TODO: 获取数据库报考专业名、市州、区县编码、报名学校
        getAllMajors: function () { 
            var that = this;
            axios.get('/kaosheng/getAllMajors')
                .then(function (response) {
                    console.log(response.data);
                    that.bk_major_list = response.data.data;
                })
                .catch(function (error) {
                    console.log(error);
                });
        },
        getAllCities: function () {
            var that = this;
            axios.get('/kaosheng/getAllCities')
                .then(function (response) {
                    console.log(response.data);
                    that.sz_num_list = response.data.data;
                })
                .catch(function (error) {
                    console.log(error);
                });
        },
        getAllDistricts: function (cityCode) {
            var that = this;
            axios.post('/kaosheng/getAllDistricts/'+cityCode)
                .then(function (response) {
                    console.log(response.data);
                    that.qx_num_list = response.data.data;
                })
                .catch(function (error) {
                    console.log(error);
                });
        },
        getAllZhuKaoSchools: function () {
            var that = this;
            axios.get('/kaosheng/getAllZhuKaoSchools')
                .then(function (response) {
                    console.log(response.data);
                    that.taget_school_list = response.data.data;
                })
                .catch(function (error) {
                    console.log(error);
                });
         },

        // 页面检查
        name_check: function () {
            if (this.stu_name == '') {
                this.isOk = 0;
                this.msg = "姓名不能为空!";
                return 0;
            } else {
                this.isOk = 1;
                return 1;
            }
        },
        phone_check: function () {
            var rexp = /^1[3|4|5|7|8]\d{9}$/;
            if (!(rexp.test(this.phone))) {
                this.msg = "电话输入出错, 请检查!";
                this.isOk = -1;
                return 0;
            } else {
                this.isOk = 1;
                return 1;
            }
        },
        zj_num_check: function () {
            var rexp = /^[1-9]\d{5}(18|19|20)\d{2}((0[1-9])|(1[0-2]))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$/;
            if (!rexp.test(this.zj_num)) {
                this.msg = "证件号码输入出错, 请检查!";
                this.isOk = -1;
                return 0;
            } else {
                this.age = this.get_age_from_zj_num();
                return 1;
            }
        },
        get_age_from_zj_num: function () {
            var zj_num = this.zj_num;
            var myDate = new Date();
            var month = myDate.getMonth() + 1;
            var day = myDate.getDate();
            var age = myDate.getFullYear() - zj_num.substring(6, 10) - 1;
            if (zj_num.substring(10, 12) < month || zj_num.substring(10, 12) == month && zj_num.substring(12, 14) <= day) {
                age++;
            }
            if (age <= 0) {
                age = 1;
            }
            return age;
        },
        choose_sex: function (index) {
            this.sex = index;
        },
        choose_zj_type: function (index) {
            this.zj_type = index;
        },
        choose_zzmm: function (index) {
            this.zzmm = index;
        },
        choose_huji_type: function (index) {
            this.huji_type = index;
        },
        choose_bk_level: function (index) {
            this.bk_level = index;
        },
        choose_bk_major: function (index) {
            this.bk_major_id = this.bk_major_list[index].major_id;
            this.bk_major = this.bk_major_list[index].major_name;
        },
        choose_stu_type: function (index) {
            this.stu_type = index;
        },
        choose_sz_num: function (index) {
            this.sz_num = this.sz_num_list[index].city_code;
            this.sz_name = this.sz_num_list[index].city_name;

            // 修改市州信息，情况qx名字
            this.qx_name = '';
            this.getAllDistricts(this.sz_num);
        },
        choose_qx_num: function (index) {
            this.qx_num = this.qx_num_list[index].district_code;
            this.qx_name = this.qx_num_list[index].district_name;
        },
        choose_taget_school: function (index) {
            this.taget_school_id = this.taget_school_list[index].school_id;
            this.taget_school = this.taget_school_list[index].school_name;
        },
        choose_health: function (index) {
            this.health = index;
        },
        regist: function () {
            // TODO:检查字段是否完整
            var that = this;

            if (that.name_check() && that.zj_num_check() && that.phone_check()) {
                that.isOk = 1;
            }

            if (that.isOk > 0) {
                axios.post('/kaosheng/personal-regist', {
                    stuName: that.stu_name,
                    sex: that.sex,
                    zjType: that.zj_type,
                    zjNum: that.zj_num,
                    age: that.age,
                    nation: that.nation,
                    zzmm: that.zzmm,
                    hujiType: that.huji_type,
                    bkLevel: that.bk_level,
                    bkMajor: that.bk_major_id,
                    phone: that.phone,
                    health: that.health,
                    stuType: that.stu_type,
                    szNum: that.sz_num,
                    qxNum: that.qx_num,
                    tagetSchoolId: that.taget_school_id,
                }).then(function (response) {
                    console.log(response);
                    alert("报名成功！");
                    that.bmState = 0;
                })
                    .catch(function (error) {
                        console.log(error);
                        alert("报名失败！");
                    });
            }
        }
    },
});