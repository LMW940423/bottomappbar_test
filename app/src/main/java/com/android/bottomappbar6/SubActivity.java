package com.android.bottomappbar6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {
    Button insertBtn = null;
    Button updateBtn = null;
    Button deleteBtn = null;
    Button selectBtn = null;

    Intent intent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        insertBtn = findViewById(R.id.btn_Insert);
        updateBtn = findViewById(R.id.btn_Update);
        deleteBtn = findViewById(R.id.btn_Delete);
        selectBtn = findViewById(R.id.btn_Select);

        insertBtn.setOnClickListener(onClickListener);
        updateBtn.setOnClickListener(onClickListener);
        deleteBtn.setOnClickListener(onClickListener);
        selectBtn.setOnClickListener(onClickListener);

        insertBtn.startAnimation(  AnimationUtils.loadAnimation( SubActivity.this,  R.anim.fade_in ) );
        updateBtn.startAnimation(  AnimationUtils.loadAnimation( SubActivity.this,  R.anim.fade_in ) );
        deleteBtn.startAnimation(  AnimationUtils.loadAnimation( SubActivity.this,  R.anim.fade_in ) );
        selectBtn.startAnimation(  AnimationUtils.loadAnimation( SubActivity.this,  R.anim.fade_in ) );
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch (v.getId()){
                case R.id.btn_Insert:
                    Toast.makeText(SubActivity.this, "입력화면으로 이동합니다.", Toast.LENGTH_LONG).show();

                    intent = new Intent(SubActivity.this, InsertActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_Update:
                    Toast.makeText(SubActivity.this, "수정하고자 하는 행을 짧게 클릭하시면 수정화면으로 이동합니다.", Toast.LENGTH_LONG).show();

                    intent = new Intent(SubActivity.this, MainActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_Delete:
                    Toast.makeText(SubActivity.this, "삭제하고자 하는 행을 길게 클릭하시면 삭제화면으로 이동합니다.", Toast.LENGTH_LONG).show();

                    intent = new Intent(SubActivity.this, MainActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_Select:
                    Toast.makeText(SubActivity.this, "검색화면으로 이동합니다.", Toast.LENGTH_LONG).show();

                    intent = new Intent(SubActivity.this, MainActivity.class);
                    startActivity(intent);
                    break;
            }

        }
    };
}