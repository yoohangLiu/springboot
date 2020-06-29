var loginSecureVue = new Vue({
    el: '#loginSecure',
    data: {
        account: '',
        password: '',
        

        isOk: 1,
        msg: '请登录!',
        login_state: -1, // -1 代表未点击登录按钮 0代表点击过 1代表登录成功
    },
    created: function () {
    },
    methods: {
        // 页面初始化
        // 账户密码核实
        findUserByAccount() { 
            var that = this;
            axios.post('/login-check', {
                account: that.account,
                password: that.password
            })
            .then(function (response) {
                console.log("登录检查", response);
                that.msg = response.data.info;
                that.login_state = response.data.flag;
                // that.account = respon

                // 登录成功
                if (response.data.flag == 1) {
                    // 停留2秒后页面跳转到首页
                    window.setTimeout("window.location.href = '/index'", 2000);
                }
            })
            .catch(function (error) {
                console.log(error);
            });
        },
    },
});