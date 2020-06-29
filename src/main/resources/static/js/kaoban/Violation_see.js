let lyh_create = new Vue({
    el: '#violation_see',
    data: {
        searchVal:'',
        list:true,
        search_result_issue:false,
        searchData:[],
        vioList: [{kc_code: null,course_id:null,kd_id:null,
            kaochang_id:null,kaotang_code:null,zkao_num:null,
            jianyi_punish_id:null,memo:null}],
        totalPage: 1, // 统共页数，默认为1
        currentPage: 1, //当前页数 ，默认为1
        pageSize: 5, // 每页显示数量
        currentPageData: [], //当前页显示内容
        if_show:false,
        kqu_id:"",
        kc_code:'',
        course_id:'',
        kd_id:'',
        kaochang_id:'',
        zkao_num:"",
        kaotang_code:"",
        jianyi_punish_id:'',
        memo:"",
        city_code:"",
        district_code:"",
    },
    created:function(){

    },
    mounted:function(){
        this.getList();
    },
    methods: {
        getList:function(){
            let that = this;
            axios.post('/kaoban/getViolationList',{
                kqu_id: that.kqu_id,
            })
                .then(function(response){
                    that.vioList = response.data;
                    that.totalPage = Math.ceil(that.vioList.length / that.pageSize);
                    // 计算得0时设置为1
                    that.totalPage = this.totalPage == 0 ? 1 : that.totalPage;
                    that.setCurrentPageData();
                })
                .catch(function(error){
                    console.log(error)

                })

        },
        setCurrentPageData:function(){
            let begin = (this.currentPage - 1) * this.pageSize;
            let end = this.currentPage * this.pageSize;
            this.currentPageData = this.vioList.slice(
                begin,
                end
            );
        },
        reset:function(){
            this.list = true;
            this.search_result_issue = false;
            this.currentPage = 1;
            this.setCurrentPageData();
        },
        search: function () {
            let that = this;
            that.list = false;
            that.search_result_issue = true;
            let searchVal = that.searchVal;
            let vioList = that.vioList;
            let len = 0;
            that.searchData = [];//搜索后的数据
            if(searchVal == undefined || searchVal == '' || searchVal== null){
                alert("搜索内容不能为空！");
            }else {
                vioList.filter(function(item) {
                    if (item.kc_code===searchVal ||
                        item.course_id===searchVal  ||
                        item.kd_id===searchVal ||
                        item.kaochang_id===searchVal||
                        item.kaotang_code.indexOf(searchVal)!==-1 ||
                        item.zkao_num.indexOf(searchVal)!==-1 ||
                        item.jianyi_punish_id===searchVal ||
                        item.memo.indexOf(searchVal) !== -1 
                    ) {
                        that.searchData.push(item);
                        len++;
                    }
                });
            }

        },
        prevPage() {
            console.log(this.currentPage);
            if (this.currentPage == 1) return;

            this.currentPage--;
            this.setCurrentPageData();

        },
        // 下一页
        nextPage() {
            if (this.currentPage == this.totalPage)return ;

            this.currentPage++;
            this.setCurrentPageData();

        },alter1:function () {
            this.if_show=(this.if_show==true)?false:true;
        }
        ,alter:function () {
            this.if_show=(this.if_show==true)?false:true;
            let that=this;
            axios.post('/kaoban/addViolationList', {
                kc_code: that.kc_code,
                kqu_id: that.kqu_id,
                course_id:that.course_id,
                kd_id:that.kd_id,
                kaochang_id:that.kaochang_id,
                zkao_num:that.zkao_num,
                kaotang_code:that.kaotang_code,
                jianyi_punish_id:that.jianyi_punish_id,
                memo:that.memo,
            })
                .then(function (response) {
                    alert("上报成功！");
                })
                .catch(function (error) {
                    alert("上报失败！");
                });
        },
    }
})