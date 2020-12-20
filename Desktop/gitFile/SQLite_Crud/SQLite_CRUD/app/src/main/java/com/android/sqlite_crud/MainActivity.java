package com.android.sqlite_crud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button insertBtn = null;
    Button updateBtn = null;
    Button deleteBtn = null;
    Button selectBtn = null;

    Intent intent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        insertBtn = findViewById(R.id.btn_Insert);
        updateBtn = findViewById(R.id.btn_Update);
        deleteBtn = findViewById(R.id.btn_Delete);
        selectBtn = findViewById(R.id.btn_Select);

        insertBtn.setOnClickListener(onClickListener);
        updateBtn.setOnClickListener(onClickListener);
        deleteBtn.setOnClickListener(onClickListener);
        selectBtn.setOnClickListener(onClickListener);
        insertBtn.startAnimation(  AnimationUtils.loadAnimation( MainActivity.this,  R.anim.fade_in ) );
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch (v.getId()){
                case R.id.btn_Insert:
                    Toast.makeText(MainActivity.this, "입력화면으로 이동합니다.", Toast.LENGTH_LONG).show();

                    intent = new Intent(MainActivity.this, InsertActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_Update:
                    Toast.makeText(MainActivity.this, "수정하고자 하는 행을 짧게 클릭하시면 수정화면으로 이동합니다.", Toast.LENGTH_LONG).show();

                    intent = new Intent(MainActivity.this, UpdateActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_Delete:
                    Toast.makeText(MainActivity.this, "삭제하고자 하는 행을 길게 클릭하시면 삭제화면으로 이동합니다.", Toast.LENGTH_LONG).show();

                    intent = new Intent(MainActivity.this, DeleteActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_Select:
                    Toast.makeText(MainActivity.this, "검색화면으로 이동합니다.", Toast.LENGTH_LONG).show();

                    intent = new Intent(MainActivity.this, ListActivity.class);
                    startActivity(intent);
                    break;
            }

        }
    };
}
