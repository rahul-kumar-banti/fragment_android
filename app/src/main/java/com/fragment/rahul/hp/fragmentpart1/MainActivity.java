package com.fragment.rahul.hp.fragmentpart1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListFragment.ItemSelected {
TextView tvDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDetail=findViewById(R.id.tvDetail);
    }

    @Override
    public void onSelecItem(int i) {
        ArrayList<String> list=new ArrayList<>();
        list.add("detail of item 1 added");
        list.add("detail of item 2 added");
        list.add("detail of item 3 added");
        tvDetail.setText(list.get(i));
    }
}
