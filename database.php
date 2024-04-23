<?


  $db_server = "localhost";
 
  $db_user = "root";
 
  $password = "LowjssForty911!!@";

  $db_name = "roome_db";

  
  
  try{


    $conn = mysqli_connect($db_server, $db_user , $password ,$db_name); // connection object

  }
  catch(mysqli_sql_exception){
    echo "could not connect";
  }
  

?>