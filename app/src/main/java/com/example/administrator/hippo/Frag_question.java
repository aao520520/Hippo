package com.example.administrator.hippo;

import android.app.Application;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by jimz on 2018/3/13.
 */

public class Frag_question extends Fragment {
    private List<Question> mData=null;
    private QuestionAdapter QuestionAdapter=null;
    private GridView gv_ques;
    private Context mContext;
    private Spinner spinner;
    private List<String> spnlist;
    private ArrayAdapter<String> spnadapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View frag_question=inflater.inflate(R.layout.question,container,false);
        spinner= (Spinner) frag_question.findViewById(R.id.spinner_question);
        gv_ques=(GridView)frag_question.findViewById(R.id.gv_ques) ;

        spnlist=new ArrayList<String>();
        spnlist.add("C语言");
        spnlist.add("C++语言");
        spnlist.add("JAVA语言");
        spnlist.add("C#语言");

        spnadapter=new ArrayAdapter<String>(getActivity(), R.layout.spinner_item,spnlist);
        spnadapter.setDropDownViewResource(R.layout.spinner_dialogspinselect);

        spinner.setAdapter(spnadapter);

        init();

        //GridView点击事件



        return frag_question;
    }
    //添加要显示GridView中的数据
    private void init() {
        mContext=getActivity();//当前界面
//        准备适配器中的数据
        mData=new LinkedList<Question>();
        for (int i=0;i<1;i++)
        {
            mData.add(new Question("求解答啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊！！！ ",R.drawable.icon1,"张三","2"+"回答" ,"15分钟前"));
            mData.add(new Question("求解答！！！ ",R.drawable.icon1,"张三","2"+"回答" ,"15分钟前"));
            mData.add(new Question("求解答！！！ ",R.drawable.icon1,"张三","2"+"回答" ,"15分钟前"));
        }


//        实例自定义适配器AnimalAdater
        QuestionAdapter=new QuestionAdapter(mContext,(LinkedList<Question>)mData);
//        将适配器中的数据显示到ListView
        gv_ques.setAdapter(QuestionAdapter);

        gv_ques.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                Toast.makeText(getActivity(), position+"+"+id, Toast.LENGTH_SHORT).show();


                    }
                }
        );
    }
}
