package com.example.administrator.hippo;

/**
 * Created by Administrator on 2018/3/28/028.
 */

public class homephoto {

    private int hicon;
    private String name;

    public homephoto() {
    }

    public homephoto(String name, int hicon) {
        this.name = name;
        this.hicon = hicon;
    }

    public int getHicon() {
        return hicon;
    }

    public void setHicon(int hicon) {
        this.hicon = hicon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
