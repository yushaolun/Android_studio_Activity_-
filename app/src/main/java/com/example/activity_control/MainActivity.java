package com.example.activity_control;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.net.URI;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bt1(View view) {  //When click 撥打手機頁面
        Uri uri= Uri.parse("tel:0999123456");
        Intent intent=new Intent(Intent.ACTION_DIAL);
        startActivity(intent);

   }

    public void bt2(View view) {   //When click 跳到Main2activity
      Intent intent=new Intent(MainActivity.this,Main2Activity.class);
      startActivity(intent);


    }

    public void bt3(View view) {  //When click 結束
        finish();



    }




    @Override
    protected void onStart() {

        Log.v("brad","onstart");
        Toast.makeText(getApplicationContext(),"onstart",Toast.LENGTH_SHORT).show();
        super.onStart();

    }

    @Override
    protected void onResume() {

        Log.v("brad","onresume");
        Toast.makeText(getApplicationContext(),"onresume",Toast.LENGTH_SHORT).show();
        super.onResume();
    }
    @Override
    protected void onRestart() {

        Log.v("brad","onrestart");
        Toast.makeText(getApplicationContext(),"onrestart",Toast.LENGTH_SHORT).show();
        super.onRestart();
    }


    @Override
    protected void onPause() {

        Log.v("brad","onpause");
        Toast.makeText(getApplicationContext(),"onpause",Toast.LENGTH_SHORT).show();
        super.onPause();
    }


    @Override
    protected void onStop() {

        Log.v("brad","onstop");
        Toast.makeText(getApplicationContext(),"onstop",Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override
    protected void onDestroy() {

        Log.v("brad","ondestroy");
        Toast.makeText(getApplicationContext(),"onDestroy",Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }



}
