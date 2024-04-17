package com.example.roome_connection_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.mysql.jdbc.ResultSetImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {

    ConnectionClass connectionClass;

    Connection con;

    ResultSet rs;

    String check, str;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connectionClass = new ConnectionClass();
        connect();
    }

    public void btnClick(View view) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(() ->{
            try{
                con = connectionClass.CONN();
                String query = "SELECT * FROM New_User\n" +
                        "WHERE ID = ? AND password = ?"; // To select from Users from our database for login
                PreparedStatement stmt = con.prepareStatement(query); // passing query here for execution
                ResultSet rs = stmt.executeQuery(); // the query will output a set
                StringBuilder bStr = new StringBuilder("RooME Login Credentials \n");
                while (rs.next()){
                    bStr.append(rs.getString("")).append("/n");
                }
                check = bStr.toString();


            }catch (SQLException e) {    // catching SQL errors
                throw new RuntimeException(e);
            }
            runOnUiThread(()-> {
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }


                TextView txtList = findViewById(R.id.textView);
                txtList.setText(check);
            });

        });


    }
    public void connect(){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(() ->{
            try{
                con = connectionClass.CONN();
                if (con == null){
                    str = "RooME is having issues!"; // if there is no data then it will return a error message
                }else{
                    str = "RooME has connected with MySQL successfully!"; // RooME will inform the user of success
                }

            }catch(Exception e){
                throw new RuntimeException(e);
            }
            runOnUiThread(()->{
                try{
                    Thread.sleep(1000); // it will sleep for this long between queries?
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                Toast.makeText(this,str, Toast.LENGTH_SHORT).show();

            });

        });


    }
}