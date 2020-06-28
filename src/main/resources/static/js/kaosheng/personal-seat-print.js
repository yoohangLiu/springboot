var createExam = new Vue({
    el: '#kaosheng',
    data: {
        zj_num: '51018119971106441X',
        bm_state:-1,

        // 考生基本信息：根据zj_nu，从后端获取
        studentBasicInfo:{},
        student_id: -1,
        stu_type:-1,

        // 当前所选课程，打印预览：通过course_id匹配上座位详细信息
        bk_course_id: -1,
        bk_course_name: '',

        // 报考课程列表
        bk_course_list: [],
        print_flag_list: [],
        print_allowed_count:0,

        // 考试座位表信息
        seat_details_list:[],
        
        print_state:0,// -1表示未预览 0表示正在预览 1表示正在打印
        isOk: 1,
        msg: '',
        FF:-1
    },
    created: function () {
        this.getStudentInfoLimitByZj();
    },
    methods: {
        // 页面初始化
        // 1. 初始化学生基本信息：根据身份证查
        getStudentInfoLimitByZj: function () {
            var that = this;
            axios.get('/kaosheng/getStudentInfoLimitByZj/' + that.zj_num)
                .then(function (response) {
                    var student_info = response.data.data[0];
                    console.log("student_info", student_info);
                    that.studentBasicInfo = student_info;
                    that.student_id = student_info.student_id;
                    that.stu_type = student_info.stu_type;
                    that.bm_state = student_info.bm_state;
                    // 检查考生报名状态

                    if (that.bm_state == 0) {
                        that.isOk = -1;
                        that.msg = "无可打印座位通知单";
                    } else if (that.bm_state == 1) {
                        that.isOk = -1;
                        that.msg = "无可打印座位通知单";
                    } else if (that.bm_state == 2) {
                        that.isOk = -1;
                        that.msg = "还有未缴费课程!";
                        that.getCoursesLimitByStuBk();
                    } else if (that.bm_state == 3) {
                        that.isOk = 1;
                        that.msg = "已完成报考，可打印座位通知单！";
                        that.getCoursesLimitByStuBk();
                    }
                    // 获取考生基本信息后，获取报考课程座位信息
                    that.getSeatDetailsByStuId();
                })
                .catch(function (error) {
                    console.log(error);
                });
        },

        // 获取当前考生报考的所有课程
        getCoursesLimitByStuBk: function () {
            var that = this;
            axios.get('/kaosheng/getCoursesLimitByStuBk?student_id=' + that.student_id)
                .then(function (response) {    
                    console.log("bk_course_list", response.data.data);
                    that.bk_course_list = response.data.data;
                })
                .catch(function (error) {
                    console.log(error);
                });
        },

        // 获取所有课程座位详细信息
        getSeatDetailsByStuId() {
            var that = this;
            axios.post('/kaosheng/getSeatDetailsByStuId', {
                student_id: that.student_id,
                stu_type: that.stu_type
            }).then(function (response) {
                // alert("获取详细信息成功！", response.data.data);
                that.seat_details_list = response.data.data;
                console.log("考试座位表信息", that.seat_details_list);
                
                // 设置准考证打印标志列表
                console.log("打印准考证标志列表【清空】", that.print_flag_list);
                that.print_flag_list = [];
                for (i = 0; i < that.bk_course_list.length; i++){
                    for (j = 0; j < that.seat_details_list.length; j++){
                        if (that.seat_details_list[j].course_id == that.bk_course_list[i].course_id) {
                            that.print_flag_list.push(that.seat_details_list[j].dy_zw_allowed);
                        }
                    }
                }
                console.log("打印准考证标志列表", that.print_flag_list);

                // 计算可打印课程
                for (i = 0; i < that.print_flag_list.length; i++) { 
                    if (that.print_flag_list[i] == 1) {
                        that.print_allowed_count += 1;
                    }
                }
            })
                .catch(function (error) {
                    console.log(error);
                    alert("获取考试座位信息失败！");
                });
        },

        // 设置打印的课程信息
        set_print_course(index) { 
            var that = this;
            that.bk_course_id = that.bk_course_list[index].course_id;
            that.bk_course_name = that.bk_course_list[index].name;

            this.print_state = 0;
        },       
        
        // 设置打印状态
        set_print_state(index) {
            this.print_state = index;
            if (index == -1) {
                this.bk_course_id = -1;
            }
            if (index == 1) {
                this.print_seat_details();
            }
        },

        // 打印
        print_seat_details() {
            $("#kaosheng").jqprint({});
        },
    },
});