package com.example.administrator.hippo.Person;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.hippo.R;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by jimz on 2018/3/13.
 */

public class Frag_person extends Fragment {
    private TextView txt_login,txt_add;
    private ImageView img_user;

    private GridView grid_list;
    private ListView list_text;
    private List<ListView_item_class> mData=null;
    private MyAdapter_gridview myAdapter_gridview =null;
    private MyAdapter_listview myAdapterListview =null;

    private Context mContext;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View frag_person=inflater.inflate(R.layout.frag_person,container,false);

        init(frag_person);

        return frag_person;
    }

    public void init(View frag_person){
        txt_login=(TextView)frag_person.findViewById(R.id.txt_login);
        txt_add=(TextView)frag_person.findViewById(R.id.txt_add);
        img_user=(ImageView)frag_person.findViewById(R.id.img_user);

        grid_list=(GridView)frag_person.findViewById(R.id.grid_list);
        list_text=(ListView)frag_person.findViewById(R.id.list_text);
        mContext=getContext();

        //GridView初始化

        mData = new LinkedList<ListView_item_class>();
        mData.add(new ListView_item_class(R.drawable.c,"我发布的"));
        mData.add(new ListView_item_class(R.drawable.c,"我发布的"));
        mData.add(new ListView_item_class(R.drawable.c,"我发布的"));

        myAdapter_gridview =new MyAdapter_gridview((LinkedList<ListView_item_class>) mData,mContext);
        grid_list.setAdapter(myAdapter_gridview);

        grid_list.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Toast.makeText(mContext, "你点击了第"+i, Toast.LENGTH_SHORT).show();

                    }
                }
        );

        //ListView初始化
        mData = new LinkedList<ListView_item_class>();
        mData.add(new ListView_item_class(R.drawable.my,"信息"));
        mData.add(new ListView_item_class(R.drawable.my,"设置"));
        mData.add(new ListView_item_class(R.drawable.my,"记录"));

        myAdapterListview =new MyAdapter_listview((LinkedList<ListView_item_class>) mData,mContext);
        list_text.setAdapter(myAdapterListview);

        list_text.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Toast.makeText(mContext, "你点击了第"+i, Toast.LENGTH_SHORT).show();

                    }
                }
        );

    }

}
