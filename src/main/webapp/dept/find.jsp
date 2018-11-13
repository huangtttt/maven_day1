<%@page pageEncoding="UTF-8" isELIgnored="false" %>
<script>
    $(function () {

        $("#deptDg").datagrid({
           url:"${pageContext.request.contextPath}/back/dept/findAll.json",
            pagination:true,
           toolbar:[
               {
                   text:'添加用户',
                   iconCls:'icon-add',
                   handler:openDeptDialog,
               },
               {
                   text:'批量删除',
                   iconCls:'icon-remove',
                   handler:function(){
                       alert();
                   }
               }
           ],
           columns:[[
               {title:"部门id",field:'id',width:120,},
               {title:"部门编号",field:'no',width:120,},
               {title:"部门名称",field:'name',width:120,},
               {title:"部门人数",field:'numbers',width:120,},
               {title:"成立时间",field:'createDate',width:120,},
               {title:"操作",field:'options',width:220,
                 formatter:function(value,row,index){
                   return "<a>删除</a><a>修改</a>"
                 }
               }
           ]]
        });

    });

    function openDeptDialog(){
        $("#saveDeptDialog").dialog({
            href:'${pageContext.request.contextPath}/back/dept/save.jsp',
            buttons:[
                {
                    text:'保存',
                    iconCls:"icon-save",
                    handler:function(){
                        alert('保存')
                    }
                },
                {
                    text:'关闭',
                    iconCls:"icon-cancel",
                    handler:function(){
                        alert('保存')
                    }
                },
            ]
        });
    }
</script>
<table id="deptDg" class="easyui-datagrid" data-options="fit:true">


</table>

<div id="saveDeptDialog" data-options="width:600,height:400,iconCls:'icon-add',title:'添加部门'"></div>