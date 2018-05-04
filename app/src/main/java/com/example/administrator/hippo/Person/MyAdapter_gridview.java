package com.example.administrator.hippo.Person;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.hippo.R;

import java.util.LinkedList;

/**
 * Created by Administrator on 2018/4/11/011.
 */

public class MyAdapter_gridview extends BaseAdapter{

    private LinkedList<ListView_item_class> mData;
    private Context mContext;

    public MyAdapter_gridview(LinkedList<ListView_item_class> mData, Context mContext) {
        this.mData = mData;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder=null;

        if(view==null) {
            //创建缓冲布局界面，获取界面上的组件
            view = LayoutInflater.from(mContext).inflate(R.layout.layout_person_gridview_item,null);
            holder=new ViewHolder();
            holder.img_icon=(ImageView)view.findViewById(R.id.hsv_icon);
            holder.name =(TextView)view.findViewById(R.id.hsv_name);
            view.setTag(holder);
        }
        else {
            //用原有组件
            holder=(ViewHolder)view.getTag();
        }
        holder.img_icon.setBackgroundResource(mData.get(i).getIcon());
        holder.name

                .setText(mData.get(i).getName());

        return view;
    }
    //在类中增加一个静态的内部类，用以保存缓冲布局（显示组件每一分项布局）
    static  class ViewHolder{
        ImageView img_icon;
        TextView name;
    }
}
