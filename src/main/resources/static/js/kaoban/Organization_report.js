let lyh_create = new Vue({
    el: '#organization_report',
    data: {
        examTypelist: ['统考', '省考', '英语听说', '毕业论文', '实践性环节'],
        searchVal:'',
        list:true,
        search_result_issue:false,
        searchData:[],
        examList: [{type_name: null, kc_code: null,kqu_id:null,secret_room_name:null
            ,fuze_name:null,fuze_phone:null,jingcha_num:null,zk_fuze_name:null,zk_fuze_phone:null,
            exam_zhiban_phone:null,technology_name:null,technology_phone:null}],
        totalPage: 1, // 统共页数，默认为1
        currentPage: 1, //当前页数 ，默认为1
        pageSize: 5, // 每页显示数量
        currentPageData: [], //当前页显示内容
        showModel:false,
        kqu_id:"",
        kc_code:'',
        type_name:'',
        secret_room_name:'',
        fuze_name:'',
        fuze_phone:'',
        jingcha_num:'',
        zk_fuze_name:'',
        zk_fuze_phone:'',
        exam_zhiban_phone:'',
        technology_name:'',
        technology_phone:'',
        if_show:false,
        msg1:'',
        msg2:'',
        msg3:'',
        msg4:'',
        city_code:"",
        district_code:"",
    },
    created:function(){
        this.getList();
    },
    mounted:function(){
        this.getList();
    },
    methods: {
        getList:function(){
            let that = this;
            axios.post('/kaoban/find_exam', {
                kqu_id: that.kqu_id,
            })
                .then(function(response){
                    Vue.nextTick(function(){
                        that.examList = response.data;
                        that.totalPage = Math.ceil(that.examList.length / that.pageSize);
                        // 计算得0时设置为1
                        that.totalPage = this.totalPage == 0 ? 1 : that.totalPage;
                        that.setCurrentPageData();
                    })
                })
                .catch(function(error){
                    console.log(error)
                })

        },
        setCurrentPageData:function(){
            let begin = (this.currentPage - 1) * this.pageSize;
            let end = this.currentPage * this.pageSize;
            this.currentPageData = this.examList.slice(
                begin,
                end
            );
        },
        prevPage() {
            console.log(this.currentPage);
            if (this.currentPage == 1) return;

            this.currentPage--;
            this.setCurrentPageData();

        },
        // 下一页
        nextPage() {
            if (this.currentPage == this.totalPage) return;

            this.currentPage++;
            this.setCurrentPageData();

        }
        ,alter1:function (kc_code,type_name,kqu_id) {
            this.kc_code=kc_code;
            this.type_name=type_name;
            this.kd_id=kqu_id;
            let that2=this;
            axios.post('/kaoban/find_exam2',{
                kc_code: that2.kc_code,
                type_name: that2.type_name,
                kqu_id: that2.kqu_id,
            }).then(function (response) {
                that2.examList = response.data;
                that2.alter2(that2.examList);
            }).catch(function (error) {
                alert("查询失败！");
            });
        },alter2:function (myexamlist) {
            this.secret_room_name=myexamlist.secret_room_name;
            this.fuze_name=myexamlist.fuze_name;
            this.fuze_phone=myexamlist.fuze_phone;
            this.jingcha_num=myexamlist.jingcha_num
            this.zk_fuze_name=myexamlist.zk_fuze_name;
            this.zk_fuze_phone=myexamlist.zk_fuze_phone;
            this.exam_zhiban_phone=myexamlist.exam_zhiban_phone;
            this.technology_name=myexamlist.technology_name;
            this.technology_phone=myexamlist.technology_phone;
            this.if_show=(this.if_show==true)?false:true;
        },alter3:function () {
            this.if_show=(this.if_show==true)?false:true;
            let that=this;
            axios.post('/kaoban/addOrganizationMemo', {
                kc_code: that.kc_code,
                type_name: that.type_name,
                kqu_id: that.kqu_id,
                secret_room_name:that.secret_room_name,
                fuze_name:that.fuze_name,
                fuze_phone:that.fuze_phone,
                jingcha_num:that.jingcha_num,
                zk_fuze_name:that.zk_fuze_name,
                zk_fuze_phone:that.zk_fuze_phone,
                exam_zhiban_phone:that.exam_zhiban_phone,
                technology_name:that.technology_name,
                technology_phone:that.technology_phone
            })
                .then(function (response) {
                    alert("上报成功！");
                })
                .catch(function (error) {
                    alert("上报失败！");
                });
        },phone_check1: function () {
            var rexp = /^1[3|4|5|7|8]\d{9}$/;
            if (!(rexp.test(this.phone))) {
                this.msg1 = "输入出错, 请检查";
                this.isOk = -1;
            } else {
                this.msg1 = '';
            }
        }, phone_check2: function () {
            var rexp = /^1[3|4|5|7|8]\d{9}$/;
            if (!(rexp.test(this.phone))) {
                this.msg2 = "输入出错, 请检查";
                this.isOk = -1;
            } else {
                this.msg2 = '';
            }
        },phone_check3: function () {
            var rexp = /^1[3|4|5|7|8]\d{9}$/;
            if (!(rexp.test(this.phone))) {
                this.msg3 = "输入出错, 请检查";
                this.isOk = -1;
            } else {
                this.msg3 = '';
            }
        },phone_check4: function () {
            var rexp = /^1[3|4|5|7|8]\d{9}$/;
            if (!(rexp.test(this.phone))) {
                this.msg4 = "输入出错, 请检查";
                this.isOk = -1;
            } else {
                this.msg4 = '';
            }
        }
        // ,
        // zj_num_check: function () {
        //     var rexp = /^[1-9]\d{5}(18|19|20)\d{2}((0[1-9])|(1[0-2]))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$/;
        //     if (!rexp.test(this.zj_num)) {
        //         this.msg5 = "输入出错, 请检查";
        //         this.isOk = -1;
        //     } else {
        //         this.msg5 = '';
        //         //this.age = this.get_age_from_zj_num();
        //     }
        // },
    }
})

// jumpToAlter: function (kc,name) {
//     this.$router.push({
//         path: '/kaoban',
//         name: 'Kqu_info_report',
//         query: {
//             kc_code: kc,
//             type_name: name,
//             kqu_id1: this.kqu_id
//         }
//     })
// }