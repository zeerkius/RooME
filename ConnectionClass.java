package com.example.roome_connection_final;

import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Objects;

public class ConnectionClass {


    protected static String ip = "172.0.0.1"; // Try "10.0.0.2" if this does not work

    // This is essentially the bypass information we will need to access our data

    protected static String database = "RooME";

    protected static String u_name = "root";

    protected static String pass = "LowjssForty911!!@";

    protected static String port = "3306";

    public Connection CONN(){
        Connection conn = null;
        try{
           Class.forName("con.mysql.jdbc.Driver");
           String connectionString = "jdbc:mysql://" + ip + ":" + port + "/" + database; // creating object for connection
           conn = DriverManager.getConnection(connectionString,u_name,pass); // creating conn variable for gate access

        }catch(Exception e){
            Log.e("DATA ERROR", Objects.requireNonNull(e.getMessage()));

        }
        return conn;






    }






}
