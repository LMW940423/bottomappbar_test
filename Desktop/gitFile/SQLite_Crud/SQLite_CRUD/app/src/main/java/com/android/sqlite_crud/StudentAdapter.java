package com.android.sqlite_crud;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentAdapter extends BaseAdapter { // 기본 어댑터 형식 BaseAdapter

    //Field
    private Context mContext = null;
    private int layout = 0;
    private ArrayList<Student> data = null;
    private LayoutInflater inflater = null;

    //Constructor
    public StudentAdapter(Context mContext, int layout, ArrayList<Student> data) {
        this.mContext = mContext;
        this.layout = layout;
        this.data = data;
        this.inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    //Method
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position).getSno();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = inflater.inflate(this.layout, parent, false);
        }
        // ListView 만들기
        TextView tv_sno = convertView.findViewById(R.id.tv_sno);
        TextView tv_username = convertView.findViewById(R.id.tv_username);
        TextView tv_userid = convertView.findViewById(R.id.tv_userid);
        TextView tv_usermajor = convertView.findViewById(R.id.tv_usermajor);
        TextView tv_usertel = convertView.findViewById(R.id.tv_usertel);


        tv_sno.setText(data.get(position).getSno() + " ");
        tv_username.setText(data.get(position).getSno() + " ");
        tv_userid.setText(data.get(position).getSno() + " ");
        tv_usermajor.setText(data.get(position).getSno() + " ");
        tv_usertel.setText(data.get(position).getSno() + " ");



        if(position % 2 == 1){
            convertView.setBackgroundColor(0x5000ff00);
        }else{
            convertView.setBackgroundColor(0x2000ff00);
        }

        return convertView;
    }

}
