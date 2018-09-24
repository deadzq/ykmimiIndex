
// The javascript to login

var loginButton = $("#loginButton");

loginButton.click(login);


function login(){
    var admin_name = $("#login-name").val();
    var admin_password = $("#login-pwd").val();

    $.ajax({
        url:"adminLogin",
        type:"POST",
        data:{"admin_name":admin_name,"admin_password":admin_password},
        dataType:"json",
        success:function(data){
            // console.log("in ajax success");
            // console.log(data.admin_id);
            if(data.admin_id>0){
                console.log("登陆成功");
                //跳转到管理员后台界面
            }else{
                console.log("用户名或密码错误");
            }
        }
    })

}