var createExam = new Vue({
    el: '#kaosheng',
    data: {
        zj_num: '51018119971106441X',
        bm_state:-1,

        // 直接从后端获取
        student_id: -1,
        bk_course_list: [],
        
        //待缴费课程总费用
        total_money: -1,
        
        isOk: 1,
        msg: '',
        payState:-1,// 0代表正在缴费 1代表缴费完成
    },
    created: function () {
        this.getStudentInfoLimitByZj();
    },
    methods: {
        // 页面初始化
        // 1. 初始化学生id、报名状态：根据身份证查
        getStudentInfoLimitByZj: function () {
            var that = this;
            axios.get('/kaosheng/getStudentInfoLimitByZj/' + that.zj_num)
                .then(function (response) {
                    var student_info = response.data.data;
                    console.log("student_info",student_info);
                    that.student_id = student_info[0].student_id;
                    that.bm_state = student_info[0].bm_state;
                    // 检查考生报名状态

                    if (that.bm_state == 0) {
                        that.isOk = -1;
                        that.msg = "当前未审核，请等待审核！";
                    } else if (that.bm_state == 1) {
                        that.isOk = -1;
                        that.msg = "已审核，请报考！";
                    } else if (that.bm_state == 2) {
                        // 正常缴费
                        that.isOk = 1;
                        that.getCoursesLimitByStuBk();
                    } else if (that.bm_state == 3) {
                        that.isOk = -1;
                        that.msg = "已缴费！";
                        that.getCoursesLimitByStuBk();
                    }
                })
                .catch(function (error) {
                    console.log(error);
                });
        },

        getCoursesLimitByStuBk: function () {
            var that = this;
            axios.get('/kaosheng/getCoursesLimitByStuBk?student_id=' + that.student_id)
                .then(function (response) {    
                    console.log("bk_course_list", response.data.data);
                    that.bk_course_list = response.data.data;
                    // 获取待缴费总费用
                    var temp = 0;
                    for (i = 0; i < that.bk_course_list.length; i++) { 
                        if (that.bk_course_list[i].pay_state == 0) { 
                            temp += that.bk_course_list[i].money;
                        }
                    }
                    that.total_money = temp;
                })
                .catch(function (error) {
                    console.log(error);
                });
        },

        gotoPay: function () {
            var that = this; 
            that.payState = 0;
        },

        pay4Courses: function () {
            var that = this;
            for (i = 0; i < that.bk_course_list.length; i++){
                if (that.bk_course_list[i].pay_state == 0) {
                    var course_id = that.bk_course_list[i].course_id;
                    axios.post('/kaosheng/updateStudentBKPayState', {
                        student_id: that.student_id,
                        bk_course_id: course_id,
                    })
                        .then(function (response) {
                            console.log("成功缴费", response.data.data);
                            that.payState = 1;
                            // 更新页面
                            that.getCoursesLimitByStuBk();
                        })
                        .catch(function (error) {
                            console.log(error);
                        });
                }
            }    
        },
    },
});