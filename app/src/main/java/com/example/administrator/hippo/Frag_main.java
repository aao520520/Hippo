package com.example.administrator.hippo;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * Created by jimz on 2018/3/13.
 */

public class Frag_main extends Fragment{
    private List<homephoto> mData=null;
    private HomephotoAdapter homephotoAdapter=null;
    private Context mContext;
    private GridView mainlist,main1list;

    private ViewPager viewPager;
    private int[] imageArr={R.drawable.icon1,R.drawable.icon2,R.drawable.icon3};
    private ArrayList<ImageView> imgList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View frag_main=inflater.inflate(R.layout.main,container,false);
        viewPager=(ViewPager)frag_main.findViewById(R.id.view_page);

        mainlist=(GridView) frag_main.findViewById(R.id.grid_main);
        main1list=(GridView) frag_main.findViewById(R.id.grid_main1);

        initView();
        frag_main();
        frag_main1();
        return frag_main;

    }

    public void initView(){


        imgList=new ArrayList<ImageView>();
        for (int i=0;i<imageArr.length;i++) {
            ImageView image = new ImageView(getContext());
            image.setBackgroundResource(imageArr[i]);
            imgList.add(image);
        }
        //实例化MyPagerAdapter
        MyPagerAdapter adapter=new MyPagerAdapter(imgList);

        //将adapter中的信息显示到ViewPager上
        viewPager.setAdapter(adapter);



    }
    private void frag_main() {
        mContext=getActivity();//当前界面
//        准备适配器中的数据
        mData=new LinkedList<homephoto>();
        for (int i=0;i<1;i++)
        {
            mData.add(new homephoto("写了解 ",R.drawable.icon1));
            mData.add(new homephoto("写了解 ",R.drawable.icon2));
            mData.add(new homephoto("写了解 ",R.drawable.icon3));
        }


//        实例自定义适配器AnimalAdater
        homephotoAdapter=new HomephotoAdapter(mContext,(LinkedList<homephoto>)mData);
//        将适配器中的数据显示到ListView
        mainlist.setAdapter(homephotoAdapter);
    }

    private void frag_main1() {
        mContext=getActivity();//当前界面
//        准备适配器中的数据
        mData=new LinkedList<homephoto>();
        for (int i=0;i<1;i++)
        {
            mData.add(new homephoto("写了解 ",R.drawable.icon3));
            mData.add(new homephoto("写了解 ",R.drawable.icon1));
            mData.add(new homephoto("写了解 ",R.drawable.icon4));
        }


//        实例自定义适配器AnimalAdater
        homephotoAdapter=new HomephotoAdapter(mContext,(LinkedList<homephoto>)mData);
//        将适配器中的数据显示到ListView
        main1list.setAdapter(homephotoAdapter);
    }
}
