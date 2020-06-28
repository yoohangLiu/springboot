let lyh_create = new Vue({
    el: '#kd_report',
    data: {
        examTypelist: ['统考', '省考', '英语听说', '毕业论文', '实践性环节'],
        searchVal:'',
        list:true,
        search_result_issue:false,
        searchData:[],
        examList: [{kd_id: null,kd_name:null,post_code:null}],
        totalPage: 1, // 统共页数，默认为1
        currentPage: 1, //当前页数 ，默认为1
        pageSize: 5, // 每页显示数量
        currentPageData: [], //当前页显示内容
        showModel:false,
        kqu_id:"0100",
        kd_id:'',
        kd_name:"",
        post_code:'',
        if_show:false,
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
            axios.post('/kaoban/find_total_kd')
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
        ,add0:function () {
            let that2=this;
            axios.post('/kaoban/findMaxKd_id')
                .then(function (response) {
                    that2.examList = response.data;
                    console.log(that2.examList.kd_id);
                    that2.fuzhi(that2.examList.kd_id);
                })
                .catch(function (error) {
                });


            this.if_show=(this.if_show===true)?false:true;
        },fuzhi:function (mydata) {
            this.kd_id=(mydata+1);
            console.log(this.kd_id);
        }
        ,add:function () {
            this.if_show=(this.if_show===true)?false:true;
            let that=this;
            that.kd_id=this.kd_id;
            that.kd_name=this.kd_name;
            that.post_code=this.post_code;
            axios.post('/kaoban/addKd_info', {
                kd_id: that.kd_id,
                kd_name: that.kd_name,
                post_code:that.post_code,
            })
                .then(function (response) {
                    alert("添加成功！");
                })
                .catch(function (error) {
                    alert("添加失败！");
                });
        },del(){
            let that=this;
            that.kd_id=this.kd_id;
            axios.post('/kaoban/delete_kd_info', {
                kd_id: that.kd_id,
            })
                .then(function (response) {
                    alert("删除成功！");
                })
                .catch(function (error) {
                    alert("删除失败！");
                });
        }
    }
})