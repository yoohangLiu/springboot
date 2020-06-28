let lyh_create = new Vue({
    el: '#organization_report',
    data: {
        statelist: ['已报名', '已审核'],
        searchVal:'',
        list:true,
        search_result_issue:false,
        searchData:[],
        examList: [{student_id:null,zkao_num:null,stu_name: null,bm_state:null, sz_num:null,
            qx_num:null,}],
        totalPage: 1, // 统共页数，默认为1
        currentPage: 1, //当前页数 ，默认为1
        pageSize: 5, // 每页显示数量
        currentPageData: [], //当前页显示内容
        kqu_id:"0100",
        showModel:false,
        student_id:'',
        zkao_num:"",
        stu_name:"",
        sz_num:"",
        qx_num:"",
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
            this.sz_num=this.kqu_id.substr(0,2);
            this.qx_num=this.kqu_id.substr(2,2);
            let that = this;
            axios.post('/kaoban/find_student_info', {
                sz_num: that.sz_num,
                qx_num:that.qx_num,
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
        ,alter1:function (stu_id) {
            this.student_id=stu_id;
            let that2=this;
            axios.post('/kaoban/alterOneState',{
                student_id: that2.student_id,
            }).then(function (response) {
                alert("审查成功！")
            }).catch(function (error) {
                alert("操作失败！");
            });
        },alterall:function () {
            let that2=this;
            axios.post('/kaoban/alterAllState',{
                sz_num:that2.sz_num,
                qx_num:that2.qx_num,
                }).then(function (response) {
                alert("一键审查成功！")
            }).catch(function (error) {
                alert("操作失败！");
            });
        }
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