package com.company.dylan.app2;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.context.IconicsLayoutInflater2;

public class IconActivity extends AppCompatActivity {

    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LayoutInflaterCompat.setFactory2(getLayoutInflater(), new IconicsLayoutInflater2(getDelegate()));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon);
        Drawable drawable=new IconicsDrawable(this)
                .icon(CustomFont.Icon.fon_cart)
                .color(Color.BLACK)
                .sizeDp(200);
        img = ((ImageView) findViewById(R.id.new_img));
        img.setImageDrawable(drawable);
    }
}
