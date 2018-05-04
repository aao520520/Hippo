package com.example.administrator.hippo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class QuestionAdapter extends BaseAdapter {

    private List<Question> list;
    private Context context;//上下文环境

    public QuestionAdapter(Context context, List<Question> list) {
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
        Question question=list.get(position);
        ViewHolder viewHolder;
        if (convertView==null){
            viewHolder=new ViewHolder();
            convertView= LayoutInflater.from(context).inflate(R.layout.question_item,null);

            viewHolder.text_time=(TextView)convertView.findViewById(R.id.question_time_item);
            viewHolder.text_title=(TextView)convertView.findViewById(R.id.question_title_item);
            viewHolder.picture=(ImageView)convertView.findViewById(R.id.question_picture_item);
            viewHolder.text_uid=(TextView)convertView.findViewById(R.id.question_uid_item);
            viewHolder.text_num=(TextView)convertView.findViewById(R.id.question_questionnum_item);



            convertView.setTag(viewHolder);
        }
        else{
            viewHolder=(ViewHolder) convertView.getTag();
        }

        //将对象中的数据显示在组件上
        viewHolder.picture.setBackgroundResource(question.getQpicture());
        viewHolder.text_time.setText(question.getTime());
        viewHolder.text_title.setText(question.getQtitle());
        viewHolder.text_uid.setText(question.getUid());
        viewHolder.text_num.setText(question.getAnswernum());


        return convertView;
    }

    public class ViewHolder{
        TextView text_time;
        TextView text_title;
        ImageView picture;
        TextView text_uid;
        TextView text_num;
    }
    //适配器更新数据方法
    public void refresh(List<Question> list){
        this.list=list;
        notifyDataSetChanged();
    }
}
