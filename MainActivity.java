package com.example.roome_connection_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {

    ConnectionClass connectionClass;

    Connection con;

    ResultSet rs;

    String name, str;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connectionClass = new ConnectionClass();
        connect();
    }

    public void btnClick(View view) {


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