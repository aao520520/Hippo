package com.example.administrator.hippo;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by Administrator on 2017/12/5 0005.
 */

public class MyPagerAdapter extends PagerAdapter {

    //定义容纳显示页面的集合对象，该对象中是一个个待显示的页面
    private List<ImageView> list;

    public MyPagerAdapter() {
    }

    public MyPagerAdapter(List<ImageView> list) {
        this.list = list;
    }

    //ViewPager组件中要显示的页面总数
    @Override
    public int getCount() {

        return list.size();
    }

    //初始化，创建指定位置的页面视图
    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        //将待显示的页面依次放入container中
        container.addView(list.get(position));
        return list.get(position);

    }


    //判断哪一个页面来显示
    @Override
    public boolean isViewFromObject(View view, Object object) {

        return view==object;
    }

    //移出一个指定位置上的页面，即滑动页面时，消失的那个页面
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView(list.get(position));

    }

    //ViewPager标题
    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }
}
