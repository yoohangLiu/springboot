
let lyh_create = new Vue({
    el: '#myKdreport',
    data: {
        examTypelist: ['统考', '省考', '英语听说', '毕业论文', '实践性环节'],
        searchVal:'',
        list:true,
        search_result_issue:false,
        searchData:[],
        examList: [{kd_id: null, kd_name: null, supervisor_num:null, contactor:null,phone:null,post_code:null,memo:null}],
        totalPage: 1, // 统共页数，默认为1
        currentPage: 1, //当前页数 ，默认为1
        pageSize: 5, // 每页显示数量
        currentPageData: [], //当前页显示内容
        showModel:false,
        kqu_id:"0100",
        if_show:false,
        kc_code:'',
        type_name:1,//默认只管统考
        kd_id:'',
        supervisor_num: '',
        contactor: "",
        phone:'',
        memo:''
    },
    methods: {
        getList:function(){
            let that = this;
            axios.post('/kaoban/find_kqu_kd', {
                kc_code:that.kc_code,
                type_name:that.type_name,
                kqu_id: that.kqu_id,
            })
                .then(function(response){
                    Vue.nextTick(function(){
                        that.examList = response.data;
                        console.log(that.kqu_id)
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

        },alter1:function (kd_id,kd_name) {
            this.if_show=(this.if_show==true)?false:true;
            this.kd_id=kd_id;
            this.kd_name=kd_name;
            }
            ,alter2:function () {
            this.if_show=(this.if_show==true)?false:true;
            let that=this;
            axios.post('/kaoban/alter_certain_kqu_kd', {
                kc_code: that.kc_code,
                type_name: that.type_name,
                kqu_id: that.kqu_id,
                kd_id:that.kd_id,
                supervisor_num: that.supervisor_num,
                contactor: that.contactor,
                phone:that.phone,
                memo:that.memo
            })
                .then(function (response) {
                    alert("上报成功！");
                })
                .catch(function (error) {
                    alert("上报失败！");
                });
        }
    }
})