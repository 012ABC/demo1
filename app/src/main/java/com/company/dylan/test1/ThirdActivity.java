package com.company.dylan.test1;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Log.i("Dylan121new","onCreate");
        Log.i("Dylan121new","onCreate:"+getClass().getSimpleName()+"TaskId:"
                +getTaskId()+ " hasCode:" + this.hashCode());
        findViewById(R.id.btn_three).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.btn_three:
                        startActivity(new Intent(ThirdActivity.this,SecondActivity.class));
                        break;
                        default:
                            break;
                }

            }
        });
        dumpTaskAffinity();
    }
    private void dumpTaskAffinity() {
        try{
            ActivityInfo info=this.getPackageManager()
                    .getActivityInfo(getComponentName(), PackageManager.GET_META_DATA);
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

}
