package com.fragment.rahul.hp.fragmentpart1;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends android.support.v4.app.ListFragment {

ItemSelected activity;
    public ListFragment() {
        // Required empty public constructor
    }

   public interface ItemSelected{
        public void onSelecItem(int i);
   }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity=(ItemSelected) context;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        String[] list=getResources().getStringArray(R.array.pieces);
        setListAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,list));
//        activity.onSelecItem(0);

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
     activity.onSelecItem(position);
    }
}
