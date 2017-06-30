var dialog={
    //错误层弹出
    error:function(message){
        layer.open({
            content:message,
            icon:2,
            title:"错误提示"
        })
    },
    //成功跳转层
    success:function(message,url){
        layer.open({
            content:message,
            icon:1,
            yes:function(){
                location.href=url;
            }
        })
    },
    //确认弹出跳转层
    confirm:function(message,url){
        layer.open({
            content:message,
            icon:3,
            btn:['是','否'],
            yes:function(){
                location.href=url;
            }
        })
    },
    //开启加载层
    waitY:function(){
        var index = layer.load(1, {
            shade: [0.1,'#fff'] //0.1透明度的白色背景
        });
    },
    //关闭加载层
    waitN:function(){
        setTimeout(function(){
            layer.closeAll('loading');
        });
    },
    //无需跳转到指定页面的确认弹出层
    toconfirm : function(message) {
        layer.open({
            content : message,
            icon:3,
            btn : ['确定'],
        });
    },
}