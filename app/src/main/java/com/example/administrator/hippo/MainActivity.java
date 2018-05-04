package com.example.administrator.hippo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.hippo.Person.Frag_person;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private FrameLayout frameLayout;

    private View main_id,person_id,study_id,question_id;
    private ImageView main_pic,person_pic,study_pic,question_pic;
    private TextView main_txt,person_txt,study_txt,question_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        getFragView(new Frag_main(),"Frag_main");
    }

    public void init() {
        main_id=(View)findViewById(R.id.main_id);
        person_id=(View)findViewById(R.id.person_id);
        study_id=(View)findViewById(R.id.study_id);
        question_id=(View)findViewById(R.id.question_id);

        main_pic=(ImageView)findViewById(R.id.main_pic);
        person_pic=(ImageView)findViewById(R.id.person_pic);
        study_pic=(ImageView)findViewById(R.id.study_pic);
        question_pic=(ImageView)findViewById(R.id.question_pic);

        main_txt=(TextView)findViewById(R.id.main_txt);
        person_txt=(TextView)findViewById(R.id.person_txt);
        study_txt=(TextView)findViewById(R.id.study_txt);
        question_txt=(TextView)findViewById(R.id.question_txt);

        main_id.setOnClickListener(this);
        person_id.setOnClickListener(this);
        study_id.setOnClickListener(this);
        question_id.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.question_id:
                getFragView(new Frag_question(),"Frag_person");
                break;
            case R.id.main_id:
                getFragView(new Frag_main(),"Frag_main");
                break;
            case R.id.study_id:
                getFragView(new Frag_study(),"Frag_study");
                break;
            case R.id.person_id:
                getFragView(new Frag_person(),"Frag_person");
        }
    }
    public void getFragView(Fragment fragment,String tag){
        //1.获取碎片管理器
        FragmentManager supporFragmentManager=getSupportFragmentManager();
        //2.开启一个事物
        android.support.v4.app.FragmentTransaction beginFragmentTransaction=supporFragmentManager.beginTransaction();
        //3.添加碎片
        beginFragmentTransaction.replace(R.id.framelayout,fragment,tag);
        //4.提交事务
        beginFragmentTransaction.commit();
    }
}

