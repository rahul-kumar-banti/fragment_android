package com.fragment.rahul.hp.fragmentpart1;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListFragment.ItemSelected {
TextView tvDetail;
    FragmentManager manager=this.getSupportFragmentManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDetail=findViewById(R.id.tvDetail);

        if(findViewById(R.id.layout_landscape)!=null){
        manager.beginTransaction()
                .show(manager.findFragmentById(R.id.detailFragment))
                .show(manager.findFragmentById(R.id.listFragment))
                .commit();
        }
        if(findViewById(R.id.layout_portrait)!=null){
            manager.beginTransaction()
                    .hide(manager.findFragmentById(R.id.detailFragment))
                    .show(manager.findFragmentById(R.id.listFragment))
                    .commit();
        }
    }

    @Override
    public void onSelecItem(int i) {
        String []list=getResources().getStringArray(R.array.descriptions);
        manager.beginTransaction()
                .show(manager.findFragmentById(R.id.detailFragment))
                .hide(manager.findFragmentById(R.id.listFragment))
                .addToBackStack(null)
                .commit();
        tvDetail.setText(list[i]);
    }
}
