var createExam = new Vue({
    el: '#kaosheng',
    data: {
        stu_name: '',
        sex: 0,
        sex_list: ['男', '女'],
        zj_type: 0,
        zj_type_list: ['居民省份证', '军官证', '警官证', '文职干部证', '士兵证', '港澳台人员省份证', '外籍人员护照'],
        zj_num: '',
        age: 1,
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
        msg: '',
        isOk:-1
    },
    methods: {
        phone_check: function () {
            var rexp = /^1[3|4|5|7|8]\d{9}$/;
            if (!(rexp.test(this.phone))) {
                this.msg = "输入出错, 请检查";
                this.isOk = -1;
            } else {
                this.msg = '';
            }
        },
        zj_num_check: function () {
            var rexp = /^[1-9]\d{5}(18|19|20)\d{2}((0[1-9])|(1[0-2]))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$/;
            if (!rexp.test(this.zj_num)) {
                this.msg = "输入出错, 请检查";
                this.isOk = -1;
            } else {
                this.msg = '';
                this.age = this.get_age_from_zj_num();
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
            this.bk_major = this.bk_major_list[index];
        },
        choose_stu_type: function (index) {
            this.stu_type = index;
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
            axios.post('/kaosheng/personal-regist', {
                stuName: that.stu_name,
                sex: that.sex,
                zjType: that.zj_type,
                zjNum: that.zj_num,
                age: that.age,
                // nation: 0,
                nation: that.nation,
                zzmm: that.zzmm,
                hujiType: that.huji_type,
                bkLevel: that.bk_level,
                bkMajor: that.bk_major,
                phone: that.phone,
                health: that.health,
                stuType: that.stu_type,
                szNum: that.sz_num,
                qxNum: that.qx_num,
                tagetSchoolId: that.taget_school,
            }).then(function (response) {
                    console.log(response);
                    alert("报名成功！");
                })
                .catch(function (error) {
                    console.log(error);
                    alert("报名失败！");
                });
        }
    },
});