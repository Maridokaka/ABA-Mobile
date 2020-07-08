package com.marido.abamonile.modedl;

import android.graphics.drawable.Drawable;

public class DepositMenuitem {

    private String title,desc,btntitle;
    private Drawable icon;

    public DepositMenuitem(String title, String desc, String btntitle, Drawable icon) {
        this.title = title;
        this.desc = desc;
        this.btntitle = btntitle;
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getBtntitle() {
        return btntitle;
    }

    public void setBtntitle(String btntitle) {
        this.btntitle = btntitle;
    }

    public Drawable getIcon() {
        return icon;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }
}
