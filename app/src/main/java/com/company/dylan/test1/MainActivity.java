package com.company.dylan.test1;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtn;
    private Button mBtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Dylan121", "*****onCreate()方法******");
        Log.i("Dylan121", "onCreate：" + getClass().getSimpleName() + " TaskId: " + getTaskId() + " hasCode:" + this.hashCode());
        dumpTaskAffinity();
        mBtn = ((Button) findViewById(R.id.btn));
        mBtn1 = ((Button) findViewById(R.id.btn1));
        mBtn.setOnClickListener(this);
        mBtn1.setOnClickListener(this);
    }

    private void dumpTaskAffinity() {
        try{
            ActivityInfo info=this.getPackageManager()
                    .getActivityInfo(getComponentName(), PackageManager.GET_META_DATA);
            Log.i("Dylan121","taskAffinity:"+info.taskAffinity);
        }catch (PackageManager.NameNotFoundException e){
            e.printStackTrace();
        }
    }


    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i("Dylan121","***************onNewIntent***************");
        Log.i("Dylan121","onNewintent："+getClass().getSimpleName()+"TaskId"
                +getTaskId()+"hasCode:"+this.hashCode());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn:
                startActivity(new Intent(MainActivity.this,MainActivity.class));
                break;
            case R.id.btn1:
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
                break;
                default:
                    break;
        }
    }
}
