$(function () {
    $(".login-btn").bind("click",function(){
        var a = $("#email").val();
        var b = $("#password").val();
        dialog.waitY();
        $.post("/userAction/login",{loginId:a,pwd:b},function(resule){
            if(resule.code==1){
                window.location.href="/demo/"+resule.url;
            }
        });
    })
})
