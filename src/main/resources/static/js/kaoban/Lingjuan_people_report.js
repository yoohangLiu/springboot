let lyh_create = new Vue({
    el: '#Lingjuan_report',
    data: {
        examTypelist: ['统考', '省考', '英语听说', '毕业论文', '实践性环节'],
        searchVal:'',
        list:true,
        search_result_issue:false,
        searchData:[],
        examList: [{kc_code: null,kqu_id:null,leader_name:null
            ,leader_address:null,leader_phone:null,leader_id:null,chepai_zuoci:null,
            lingjuan_date:null,return_paper_stime:null,return_paper_etime:null}],
        totalPage: 1, // 统共页数，默认为1
        currentPage: 1, //当前页数 ，默认为1
        pageSize: 5, // 每页显示数量
        currentPageData: [], //当前页显示内容
        showModel:false,
        kqu_id:"0100",
        kc_code:'',
        leader_name:'',
        leader_address:'',
        leader_phone:'',
        leader_id:'',
        chepai_zuoci:'',
        lingjuan_date:'',
        return_paper_stime:'',
        return_paper_etime:'',
        if_show:false,
        msg1:'',
        msg2:'',
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
            axios.post('/kaoban/find_tongkao', {
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
        ,alter1:function (kc_code,kqu_id) {
            this.kc_code=kc_code;
            this.kd_id=kqu_id;
            let that2=this;
            axios.post('/kaoban/find_Lingjuan',{
                kc_code: that2.kc_code,
                kqu_id: that2.kqu_id,
            }).then(function (response) {
                console.log("hi1")
                that2.examList = response.data;
                that2.alter2(that2.examList);
            }).catch(function (error) {
                alert("查询失败！");
            });
        },alter2:function (myexamlist) {
            console.log("hi2")
            var date = new Date();
            this.leader_name=myexamlist.leader_name;
            this.leader_address=myexamlist.leader_address;
            this.leader_phone=myexamlist.leader_phone;
            this.leader_id=myexamlist.leader_id;
            this.chepai_zuoci=myexamlist.chepai_zuoci
            this.lingjuan_date=myexamlist.lingjuan_date.substr(0,10);
            this.return_paper_stime=myexamlist.return_paper_stime.substr(0,10);
            this.return_paper_etime=myexamlist.return_paper_etime.substr(0,10);
            this.if_show=(this.if_show==true)?false:true;
            console.log("hi3")
        },alter3:function () {
            this.if_show=(this.if_show==true)?false:true;
            let that=this;
            axios.post('/kaoban/addLingjuanList', {
                kc_code: that.kc_code,
                kqu_id: that.kqu_id,
                leader_name:that.leader_name,
                leader_address:that.leader_address,
                leader_phone:that.leader_phone,
                leader_id:that.leader_id,
                chepai_zuoci:that.chepai_zuoci,
                lingjuan_date:that.lingjuan_date,
                return_paper_stime:that.return_paper_stime,
                return_paper_etime:that.return_paper_etime,
            })
                .then(function (response) {
                    alert("上报成功！");
                })
                .catch(function (error) {
                    alert("上报失败！");
                });
        },phone_check: function () {
            var rexp = /^1[3|4|5|7|8]\d{9}$/;
            if (!(rexp.test(this.phone))) {
                this.msg1 = "输入出错, 请检查";
                this.isOk = -1;
            } else {
                this.msg1 = '';
            }
        },
        zj_num_check: function () {
            var rexp = /^[1-9]\d{5}(18|19|20)\d{2}((0[1-9])|(1[0-2]))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$/;
            if (!rexp.test(this.zj_num)) {
                this.msg2 = "输入出错, 请检查";
                this.isOk = -1;
            } else {
                this.msg2 = '';
                //this.age = this.get_age_from_zj_num();
            }
        }
    }
})