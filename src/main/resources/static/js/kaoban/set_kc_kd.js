

let lyh_create = new Vue({
    el: '#set_kc_kd',
    data: {
        searchVal:'',
        list:true,
        search_result_issue:false,
        searchData:[],
        examList: [{kc_code:null,kd_id: null, kaochang_num:null, kaochang_spec:null,belong_code:null,supervisor_num:null}],
        totalPage: 1, // 统共页数，默认为1
        currentPage: 1, //当前页数 ，默认为1
        pageSize: 5, // 每页显示数量
        currentPageData: [], //当前页显示内容
        showModel:false,
        kqu_id:"0100",
        if_show:false,
        if_show2:false,
        kc_code:'',
        type_name:'1',
        kd_id:'',
        kd_type:'1',
        kaochang_num:'',
        kaochang_spec:'',
        supervisor_num: '',
        belong_code:"",
        kd_id2:'',
        kaochang_num2:'',
        kaochang_spec2:'',
    },
    methods: {
        getList:function(){
            let that = this;
            axios.post('/kaoban/find_exam3', {
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

        },alter1:function (kc_code,kqu_id,kd_id) {
            this.if_show=(this.if_show==true)?false:true;
            this.kd_id=kd_id;
            this.kqu_id=kqu_id;
            this.kc_code=kc_code;
        }
        ,alter2:function () {
            this.if_show=(this.if_show==true)?false:true;
            let that=this;
            axios.post('/kaoban/alter_certain_kqu_kd2', {
                kc_code: that.kc_code,
                kqu_id: that.kqu_id,
                kd_id:that.kd_id,
                kd_type:that.kd_type,
                kaochang_num:that.kaochang_num,
                kaochang_spec:that.kaochang_spec,
                belong_code:that.kqu_id,
            })
                .then(function (response) {
                    alert("修改成功！");
                })
                .catch(function (error) {
                    alert("修改失败！");
                });
        },alter3:function () {
            this.if_show2=(this.if_show2==true)?false:true;
        }
        ,alter4:function () {
            this.if_show2=(this.if_show2==true)?false:true;
            let that=this;
            axios.post('/kaoban/insert_certain_kqu_kd', {
                kc_code: that.kc_code,
                kqu_id: that.kqu_id,
                kd_id:that.kd_id2,
                kd_type:that.kd_type,
                kaochang_num:that.kaochang_num2,
                kaochang_spec:that.kaochang_spec2,
                belong_code:that.kqu_id,
            })
                .then(function (response) {
                    alert("新增成功！");
                })
                .catch(function (error) {
                    alert("新增失败！");
                });
        }
    }
})



let setExam = new Vue({
    el: '#set_exam_time',
    data: {
        kc_code:1,
        kqu_id:"0100",
        type_name:'',
        type_index:1,
        examTypelist:['统考'],
        bc_begin_time:'',
        bc_end_time:'',
    },
    methods: {
        chooseExamType: function (index) {
            this.type_name = this.examTypelist[index];
            this.type_index = 1;
            //console.log("考次："+this.kc_code);
            console.log("考试类型："+this.type_name);
        },
        findExam: function () {
            let that = this;
            axios.post('/kaoban/find_exam3',
                {
                    kc_code: that.kc_code,
                    type_name: that.type_index,
                    kqu_id:that.kqu_id,
                })
                .then(function (response) {
                    console.log(response.data);
                    if (response.data.kc_code) alert("该考试存在，可设置考点！");
                    else alert("该考试不存在，请重新选择！");
                })
                .catch(function (error) {
                    console.log(error);
                    alert("查询考试失败！");
                });
        },
        reset: function () {
            this.bc_begin_time = '';
            this.bc_end_time = '';
        },
        setExamTime: function () {
            let that = this;
            axios.post('/exam/set_Certain_Kc_Kd',
                {
                    kc_code: that.kc_code,
                    type_name: that.type_index,
                    bc_begin_time: that.bc_begin_time,
                    bc_end_time: that.bc_end_time,
                })
                .then(function (response) {
                    console.log(response.data);
                    alert("设置编场时间成功！");
                    window.location.href = "/exam/show";
                })
                .catch(function (error) {
                    console.log(error);
                    alert("设置失败！");
                });
        }
    }
})