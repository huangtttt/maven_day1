<%@page pageEncoding="UTF-8"  isELIgnored="false" %>
<div style="text-align: center;">
    <form action="" class="easyui-form" id="inputForm" method="post">
        <div style="margin-top: 70px;">
            用户名：<input name="name" type="text" class="easyui-textbox" data-options="required:true,iconCls:'icon-man',
                            width:200,height:28">
        </div>
        <div style="margin-top: 20px;">
            密&nbsp;&nbsp;&nbsp;&nbsp;码：<input id="pwd" name="pwd" type="text" class="easyui-passwordbox" data-options="required:true,width:200,height:28" />
        </div>
        <div style="margin-top: 20px;">
            确认密码：<input id="rpwd" name="rpwd" type="text" class="easyui-passwordbox"
                        data-options="validType:'equals[\'#pwd\']',width:185,height:28,required:true" />
        </div>
    </form>

</div>