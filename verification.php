<?php
session_start();
if(isset($_REQUEST['username']) && isset($_REQUEST['password']))
{
    	

    //Check if the login is halima and the password is passer
    if($_REQUEST['username'] == "halima" && $_REQUEST['password'] == "abaissa")
    {
        $_SESSION['username'] = $_REQUEST['username'];
        $_SESSION['password'] = $_REQUEST['password'];
        echo "Welcome ".$_SESSION['username'];
    }
    else
    {
        echo "Wrong username or password";
        //retourne status code 401
        http_response_code(401);
    }
        
    
}
else
{
   header('Location: index.html');
   exit;
}
?>
