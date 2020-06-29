let lyh_create = new Vue({
    el: '#show_examArea',
    data: {
        examTypelist: ['统考', '省考', '英语听说', '毕业论文', '实践性环节'],
        searchVal:'',
        list:true,
        search_result_issue:false,
        searchData:[],
        examList: [{type_name: null, kc_code: null, kqu_capacity:null, xunkao_num:null}],
        totalPage: 1, // 统共页数，默认为1
        currentPage: 1, //当前页数 ，默认为1
        pageSize: 5, // 每页显示数量
        currentPageData: [], //当前页显示内容
        showModel:false,
        kqu_id:"",
        kc_code:'',
        type_name:'',
        if_show:false,
        capacity:'',
        xunkao_num: '',
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
                        console.log(response.data[0])
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

        },alter1:function (kc_code,type_name) {
            this.if_show=(this.if_show==true)?false:true;
            this.kc_code=kc_code;
            this.type_name=type_name;

        },alter2:function () {
            this.if_show=(this.if_show==true)?false:true;
            let that=this;
            axios.post('/kaoban/addCapacity', {
                kc_code: that.kc_code,
                type_name: that.type_name,
                kqu_id: that.kqu_id,
                kqu_capacity: that.capacity,
                xunkao_num:that.xunkao_num
            })
                .then(function (response) {
                    alert("上报成功！");
                })
                .catch(function (error) {
                    alert("上报失败！");
                });
        },queryKd: function () {
            let that = this;
            axios.post('/kaoban/find_kqu_kd', {
                kc_code: that.examNum,
                type_name: that.exam_type_id,
                kqu_id: that.kqu_id,
            })
                .then(function (response) {
                    console.log(that.examNum);
                    console.log(response.data[0].kqu_id);
                    alert("查询考点成功！");
                })
                .catch(function (error) {
                    alert("查询考点失败！");
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