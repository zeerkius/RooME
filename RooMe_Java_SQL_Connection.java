package com.example.connectandroid_sql;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    
    Connection con;
    String u_name,pass,ip,port,database;

    /**
     * @return
     */
    public Connection connectionclass(){

      ip = "172.0.0.1";
      database = "RooME";
      u_name = "host";
      pass = "LowjssForty911!!@";
      port = "3306";

      StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
      StrictMode.setThreadPolicy(policy);
      Connection connection = null;
      String ConnectionURL = null;


      try
      {

       Class.foreName("net.sourceforge.jtds.jdbc.Driver");
       ConnectionURL= "jdbc.jtds:sqlserver://" + ip + ":" + port + ";" + "databasename=" + database + ";user=" + u_name + ";password=" + pass + ";";
       connection = DriverManager.getConnection(ConnectionURL);
      }
      catch(Exception ex){
      Log.e("Error", ex.getMessage());




      }




      return connection;


    }




}





