let lyh_create = new Vue({
    el: '#Lingjuan_report',
    data: {
        examTypelist: ['统考', '省考', '英语听说', '毕业论文', '实践性环节'],
        searchVal:'',
        list:true,
        search_result_issue:false,
        searchData:[],
        examList: [{kc_code: null,type_name:null,kqu_id:null,bk_student_num:null}],
        num_and_spec_list:[{kaochang_num:null,kaochang_spec:null}],
        totalPage: 1, // 统共页数，默认为1
        currentPage: 1, //当前页数 ，默认为1
        pageSize: 5, // 每页显示数量
        currentPageData: [], //当前页显示内容
        showModel:false,
        kqu_id:"",
        kc_code:'',
        type_name:'',
        bk_student_num:'',
        total_kaochang:'',
        need_kaochang:'',
        minus:'',
        if_show:false,
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
            axios.post('/kaoban/select_bk_student_num', {
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
        ,alter1:function (kc_code,type_name,kqu_id,bk_student_num) {
            this.kc_code=kc_code;
            this.type_name=type_name;
            this.kqu_id=kqu_id;
            this.bk_student_num=bk_student_num;
            let that2=this;
            axios.post('/kaoban/select_kaochang_spec_and_num',{
                kc_code: that2.kc_code,
                type_name: that2.type_name,
                kqu_id:that2.kqu_id,
            }).then(function (response) {
                console.log("已获取")
                that2.num_and_spec_list = response.data;
                if(response.data!==null){
                    that2.process(that2.num_and_spec_list);
                }else {
                    alert("该考试还没有上报考场规格和容量！")
                }
            }).catch(function (error) {
                alert("查询失败！");
            });
        }
        ,process:function (data) {
            let leave=this.bk_student_num;
            let need_num=0;
            let total_num=0;
            console.log("haha")
            if(data.length===0){
                if(leave>0){
                    alert("尚未上报考场容量！")
                    this.if_show=(this.if_show==true)?false:true;
                }
            }
            for(i=0;i<data.length;i++){
                for(j=0;j<data[i].kaochang_num;j++){
                    if(leave>=data[i].kaochang_spec){
                        need_num++;
                        leave-=data[i].kaochang_spec;
                    }else {
                        need_num++;
                        break;
                    }
                }
            }
            console.log("haha2")
            for(i=0;i<data.length;i++){
                total_num+=data[i].kaochang_num;
            }
            this.need_kaochang=need_num;
            this.total_kaochang=total_num;
            if(need_num>total_num){
                this.minus=need_num-total_num;
            }else {
                this.minus=0;
            }
            this.if_show=(this.if_show==true)?false:true;
        },alter3(){
            this.if_show=(this.if_show==true)?false:true;
        }
    }
})