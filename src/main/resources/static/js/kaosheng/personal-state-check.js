var createExam = new Vue({
    el: '#kaosheng',
    data: {
        zj_num: '111',
        bm_state: -1,
        states:['未报名', '已报名', '已审核', '已报考', '已缴费, 完成报考'],

        // 直接从后端获取
        student_id: -1,
        
        isOk: 1,
        msg: '',
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

                    // flag=0表示考生未报名
                    console.log("getStudentInfoLimitByZj response flag", response.data.flag);
                    if (response.data.flag == 1) {
                        // 考生已经报名
                        var student_info = response.data.data;
                        console.log("student_info", student_info);
                        that.student_id = student_info[0].student_id;
                        that.bm_state = student_info[0].bm_state;
                    } else {
                        that.isOk = -1;
                        that.bm_state = -1;
                        that.msg = '当前未报名, <a href="/kaosheng/goto-personal-regist">跳转到报名</a>.';
                    }          
                })
                .catch(function (error) {
                    console.log(error);
                });
        },
    },
});

//setTimeout(function (){createExam.msg = 'active';}, 3000);