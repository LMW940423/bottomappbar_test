package com.android.bottomappbar6;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.snackbar.Snackbar;

public class InsertActivity extends AppCompatActivity {
    BottomAppBar bab;
    boolean isCenter=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);


        bab=findViewById(R.id.bab);
        setSupportActionBar(bab);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //제목줄 옆에 [<-] 기호

    }

    //옵션메뉴 만드는 메소드
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bab_option,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void clickFab(View view) {
        isCenter= !isCenter;

        if(isCenter) bab.setFabAlignmentMode(BottomAppBar.FAB_ALIGNMENT_MODE_CENTER);
        else bab.setFabAlignmentMode(BottomAppBar.FAB_ALIGNMENT_MODE_END);

        Intent intent = new Intent(InsertActivity.this, SubActivity.class);
        startActivity(intent);
    }

    public void clickBtn(View view) {



    }
}
