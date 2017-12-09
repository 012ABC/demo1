package com.onepluse.app3.bean;

/**
 * Created by dylan on 2017/12/8.
 */

public class Tab {
    private String tag;
    private String text;
    private int icon;
    private Class mFragment;

    public Tab( int icon,String text, String tag, Class mFragment) {
        this.tag = tag;
        this.text = text;
        this.icon = icon;
        this.mFragment = mFragment;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public Class getFragment() {
        return mFragment;
    }

    public void setFragment(Class mFragment) {
        this.mFragment = mFragment;
    }
}
