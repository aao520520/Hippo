package com.example.administrator.hippo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;


public class HomephotoAdapter extends BaseAdapter {

    private List<homephoto> list;
    private Context context;//上下文环境

    public HomephotoAdapter(Context context, List<homephoto> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        homephoto homephoto=list.get(position);
        ViewHolder viewHolder;
        if (convertView==null){
            viewHolder=new ViewHolder();
            convertView= LayoutInflater.from(context).inflate(R.layout.home_photo,null);

            viewHolder.img_icon=(ImageView) convertView.findViewById(R.id.home_icon);
            viewHolder.txt_name=(TextView)convertView.findViewById(R.id.home_tv);

            convertView.setTag(viewHolder);
        }
        else{
            viewHolder=(ViewHolder) convertView.getTag();
        }

        //将对象中的数据显示在组件上
        viewHolder.img_icon.setBackgroundResource(homephoto.getHicon());
        viewHolder.txt_name.setText(homephoto.getName());


        return convertView;
    }

    public class ViewHolder{
        ImageView img_icon;
        TextView txt_name;
    }
    //适配器更新数据方法
    public void refresh(List<homephoto> list){
        this.list=list;
        notifyDataSetChanged();
    }
}
