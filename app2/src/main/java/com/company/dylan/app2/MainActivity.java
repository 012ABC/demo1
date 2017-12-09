package com.company.dylan.app2;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface typeface=Typeface.createFromAsset(getAssets(),"iconfont.ttf");
        TextView textView= ((TextView) findViewById(R.id.icon_id));
    }
}
