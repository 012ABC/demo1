package com.onepluse.app3;

import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TextView;

import com.onepluse.app3.bean.Tab;
import com.onepluse.app3.fragment.HomeFragment;
import com.onepluse.app3.fragment.MyStudyFragment;
import com.onepluse.app3.fragment.TrainningFragment;
import com.onepluse.app3.fragment.UserCenterFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Tab>list=new ArrayList<>();
    private FragmentTabHost mTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTab();
    }

    private void initTab() {
        Tab tab1=new Tab(R.drawable.tab_home_selector,"home","首页", HomeFragment.class);
        Tab tab2=new Tab(R.drawable.tab_trainning_selector,"tranning","定期培训", TrainningFragment.class);
        Tab tab3=new Tab(R.drawable.tab_study_selector,"study","我的学习", MyStudyFragment.class);
        Tab tab4=new Tab(R.drawable.tab_usercenter_selector,"usercenter","个人中心", UserCenterFragment.class);
        list.add(tab1);
        list.add(tab2);
        list.add(tab3);
        list.add(tab4);
        mTabHost = ((FragmentTabHost) findViewById(android.R.id.tabhost));
        mTabHost.setup(this,getSupportFragmentManager(),R.id.realtabcontent);
        for (Tab tab:list){
            TabHost.TabSpec tabSpec=mTabHost.newTabSpec(tab.getTag());
            tabSpec.setIndicator(buildView(tab));
            mTabHost.addTab(tabSpec,tab.getFragment(),null);
        }
        mTabHost.getTabWidget().setShowDividers(LinearLayout.SHOW_DIVIDER_NONE);
        mTabHost.setCurrentTabByTag(tab1.getTag());
    }

    private View buildView(Tab tab) {
        View view= LayoutInflater.from(this).inflate(R.layout.tab_indicator,null);
        ImageView tabImg = (ImageView) view.findViewById(R.id.tab_img);
        TextView text = (TextView) view.findViewById(R.id.tab_text);
        tabImg.setImageResource(tab.getIcon());
        text.setText(tab.getText());
        return view;

    }
}
