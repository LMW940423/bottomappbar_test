package com.android.sqlite_crud;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    private ArrayList<Student> data = null;
    private StudentAdapter adapter = null;
    private ListView listView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        data = new ArrayList<Student>();

        //DB에서 받아온 값 넣어주세요-----------------

        //DB에서 받아온 값 넣어주세요-----------------


        // Context는 Activity
        adapter = new StudentAdapter(ListActivity.this, R.layout.activity_list, data);
        listView = findViewById(R.id.listView_Student);
        listView.setAdapter(adapter);


    }


}
