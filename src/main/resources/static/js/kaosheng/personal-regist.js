var createExam = new Vue({
    el: '#kaosheng',
    data: {
        stu_name: '',
        sex: 0,
        sex_list: ['男', '女'],
        zj_type: 0,
        zj_type_list: ['居民省份证', '军官证', '警官证', '文职干部证', '士兵证', '港澳台人员省份证', '外籍人员护照'],
        zj_num: '',
        age: -1,
        nation: '',
        zzmm: -1,
        zzmm_list: ['党员', '团员', '其他', '未采集'],
        huji_type: 0,
        huji_type_list: ['城镇', '农村', '未采集'],
        bk_level: 0,
        bk_level_list: ['本科', '专科'],
        bk_major: '',
        bk_major_list: [],
        phone: '',
        health: 0,
        health_list: ['健康', '残疾'],
        stu_type: 0,
        stu_type_list: ['社会型', '应用型'],
        sz_num: '',
        sz_num_list: [],
        qx_num: '',
        qx_num_list: [],
        taget_school: '',
        taget_school_list: [],

        stu_img: '',
    },
    methods: {
        choose_sex: function (index) {
            this.sex = index;
        },
        choose_zj_type: function (index) {
            this.zj_type = index;
        },
        choose_zzmm: function (index) {
            this.zzmm = index + 1;
        },
        choose_huji_type: function (index) {
            this.huji_type = index;
        },
        choose_bk_level: function (index) {
            this.bk_level = index;
        },
        choose_bk_major: function (index) {
            this.bk_major = this.bk_major_list[index];
        },
        choose_stu_type_list: function (index) {
            this.stu_type_list = index;
        },
        choose_sz_num: function (index) {
            this.sz_num = index;
        },
        choose_qx_num: function (index) {
            this.qx_num = index;
        },
        choose_taget_school: function (index) {
            this.taget_school = this.taget_school_list[index];
        },
        choose_health: function (index) {
            this.health = index;
        },
        regist: function () {
            var that = this;
            axios.post('/exam/addExam', {
                exam_num: that.examNum,
                exam_type: that.examType
            })
                .then(function (response) {
                    console.log(response.data.exam_num);
                    that.examNum = response.data.exam_num;
                    alert("新建考试成功！");
                })
                .catch(function (error) {
                    console.log(error);
                    alert("新建考试失败！");
                });
        }
    },
});