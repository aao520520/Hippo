package com.example.administrator.hippo;

import android.widget.ImageView;

/**
 * Created by Administrator on 2018/4/10/010.
 */

public class Question {
    private String  qtitle;
    private int qpicture;
    private String uid;
    private String answernum;
    private String time;


    public Question() {
    }

    public Question(String qtitle, int qpicture, String uid, String answernum, String time) {
        this.qtitle = qtitle;        //标题
        this.qpicture = qpicture;//图片
        this.uid = uid;//用户id
        this.answernum = answernum;//回答人量
        this.time = time;       //发布时间
    }

    public String getQtitle() {
        return qtitle;
    }

    public void setQtitle(String qtitle) {
        this.qtitle = qtitle;
    }

    public int getQpicture() {
        return qpicture;
    }

    public void setQpicture(int qpicture) {
        this.qpicture = qpicture;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getAnswernum() {
        return answernum;
    }

    public void setAnswernum(String answernum) {
        this.answernum = answernum;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
