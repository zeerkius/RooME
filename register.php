<?

if($_SERVER["REQUEST_METHOD"] == "POST"){

    $username = $_POST['username'];
    $password = $_POST['password'];

    $password = password_hash($password , PASSWORD_DEFAULT);

    require_once "database.php";


        $sql= "INSERT INTO newuser(ID , password)VALUES ('$ID','$password')";

            if (mysqli_query($conn, $sql)){
                $result["success"] = "1";
                $result["message"] ="success";
     
                echo json_encode($result);
                mysqli_close($conn);
            }
            else{
                $result["success"] = "0";
                $result["message"] = "error";


                echo json_encode($result);
                mysqli_close($conn);



            }





        }




















?>