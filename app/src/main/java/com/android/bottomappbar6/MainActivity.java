package com.android.bottomappbar6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    BottomAppBar bab;
    boolean isCenter=true;

    private ArrayList<Student> data = null;
    private StudentAdapter adapter = null;
    private ListView listView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = new ArrayList<Student>();

        adapter = new StudentAdapter(MainActivity.this, R.layout.activity_main, data);
        listView = findViewById(R.id.listView_Student);
        listView.setAdapter(adapter);

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

        Intent intent = new Intent(MainActivity.this, SubActivity.class);
        startActivity(intent);
    }

    public void clickBtn(View view) {
        Snackbar.make(findViewById(R.id.snackbar_container), "This is snack bar", Snackbar.LENGTH_INDEFINITE).setAction("OK", new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        }).show();
    }
}