let lyh_create = new Vue({
    el: '#shizhou_set_certain_area',
    data: {
        examTypelist: ['统考', '省考'],
        type_index:"",
        searchVal:'',
        list:true,
        search_result_issue:false,
        searchData:[],
        examList: [{kc_code: null,type_name:null,kqu_id:null}],
        totalPage: 1, // 统共页数，默认为1
        currentPage: 1, //当前页数 ，默认为1
        pageSize: 5, // 每页显示数量
        currentPageData: [], //当前页显示内容
        showModel:false,
        kc_code:'',
        kqu_id:"0100",
        type_name:'',
        city_code:"",
        district_code:"",
        kd_id:'',
        kd_name:"",
        post_code:'',
        if_show:false,
        kc_code2:'',
        type_index2:"",
        type_name2:'',
        district_code2:"",
        kqu_id2:"",
    },
    methods: {
        getList:function(){
            this.city_code=this.kqu_id.substr(0,2);
            this.district_code=this.kqu_id.substr(2,2);
            let that = this;
            axios.post('/kaoban/find_shizhou_certain_area',{
                city_code:that.city_code,
                kc_code:that.kc_code,
                type_name:that.type_name,
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

        },alter0(){
            this.if_show=(this.if_show===true)?false:true;
        }
        ,add:function () {
            this.if_show=(this.if_show===true)?false:true;
            let that=this;
            that.kc_code=this.kc_code;
            that.kd_id=this.kd_id;
            that.type_name2=this.type_name2;
            that.kqu_id2=this.city_code+this.district_code2;
            axios.post('/kaoban/insert_Certain_Kqu', {
                kc_code: that.kc_code,
                type_name: that.type_name2,
                kqu_id:that.kqu_id2,
            })
                .then(function (response) {
                    alert("添加成功！");
                })
                .catch(function (error) {
                    alert("添加失败！");
                });
        },chooseExamType: function (index) {
            this.type_index = this.examTypelist[index];
            this.type_name = index+1;
            //console.log("考次："+this.kc_code);
            console.log("考试类型："+this.type_name);
        },
        chooseExamType2: function (index) {
            this.type_index2 = this.examTypelist[index];
            this.type_name2 = index+1;
            //console.log("考次："+this.kc_code);
            console.log("考试类型："+this.type_name2);
        },
    }
})