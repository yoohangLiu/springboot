var createExam = new Vue({
    el: '#kaosheng',
    data: {
        //获取用户信息
        //user:{},

        zj_num: '51018119971106441X',
        bm_state: -1,
        states:['未报名', '已报名', '已审核', '已报考', '已缴费, 完成报考'],

        // 直接从后端获取
        student_id: -1,
        
        isOk: 1,
        msg: '',
    },

    //beforeUpdate:function(){
    //    this.user = leftVue.user;
    //    console.log("this user:", this.user);
    //},
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
                })
                .catch(function (error) {
                    console.log(error);
                });
        },
    },
});

//setTimeout(function (){createExam.msg = 'active';}, 3000);