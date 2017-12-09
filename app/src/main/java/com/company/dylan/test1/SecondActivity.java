package com.company.dylan.test1;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtn;
    private Button mBtnThird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.i("Dylan121new","onCreate");
        Log.i("Dylan121new","onCreate:"+getClass().getSimpleName()+"TaskId:"
                +getTaskId()+ " hasCode:" + this.hashCode());
        mBtn = ((Button) findViewById(R.id.btn_second));
        mBtn.setOnClickListener(this);
        mBtnThird = ((Button) findViewById(R.id.btn_third));
        mBtnThird.setOnClickListener(this);
        dumpTaskAffinity();
    }

    private void dumpTaskAffinity() {
        try{
            ActivityInfo info=this.getPackageManager()
                    .getActivityInfo(getComponentName(),PackageManager.GET_META_DATA);
            Log.i("Dylan121new","taskAffinity:"+info.taskAffinity);
        }catch (PackageManager.NameNotFoundException e){
            e.printStackTrace();
        }
    }


    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i("Dylan121new","onNewIntent");
        Log.i("Dylan121new","onNewintent："+getClass().getSimpleName()+"TaskId"
        +getTaskId()+"hasCode:"+this.hashCode());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_second:
                startActivity(new Intent(SecondActivity.this,SecondActivity.class));
                break;
            case R.id.btn_third:
                startActivity(new Intent(SecondActivity.this,ThirdActivity.class));
                break;
                default:
                    break;
        }
    }
}
