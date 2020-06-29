var leftVue = new Vue({
    el: '#left_bar',
    data: {
        user: {},
        // 登出url
        logout_url: '/logout',
        // 查看个人详情url
        personal_details_url: '#',
        test:'../../static/dist/img/user2-160x160.jpg',


        isOk: 1,
        msg: '请登录!'
    },
    created: function () {
        this.sessionAndSecure();
    },
    methods: {
        // 页面初始化
        // 从session获取信息
        sessionAndSecure:function() {
            var that = this;
            axios.get('/sessionAndSecure')
            .then(function (response) {
                console.log("session获取", response.data);
                that.user = response.data.user[0];
                console.log("获取到的session数据", that.user);
                headVue.user = that.user;
                console.log("headVue获取到的session数据", headVue.user);

                //
                lyh_create.kqu_id=leftVue.user.kqu_id;
                console.log("编码",lyh_create.kqu_id);

                lyh_create.city_code=leftVue.user.city_code;
                lyh_create.district_code=leftVue.user.district_code;
                console.log("编码",lyh_create.city_code);
                console.log("编码",lyh_create.district_code);
            })
            .catch(function (error) {
                console.log(error);
            });
        },
    },
});

var headVue = new Vue({
    el: '#top_bar',
    data: {
        user: {},
        // 登出url
        logout_url: '/logout',
        // 查看个人详情url
        personal_details_url: '#',


        isOk: 1,
        msg: '请登录!'
    },
    created: function () {
    },
    methods: {
    },
});