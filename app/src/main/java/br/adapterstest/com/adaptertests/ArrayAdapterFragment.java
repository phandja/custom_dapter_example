package br.adapterstest.com.adaptertests;

import android.support.v4.app.Fragment;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by thiago on 13/11/2015.
 */
@EFragment(R.layout.list)
public class ArrayAdapterFragment extends Fragment {
    @FragmentArg
    ArrayList listItems;

    @ViewById
    ListView myList;

    @ViewById
    TextView empty;

    ArrayAdapter adapter;

    @AfterViews
    public void init() {
        adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, listItems);
        myList.setAdapter(adapter);
        myList.setEmptyView(empty);
    }

    public void setListItems(ArrayList list){
        this.listItems = list;
        init();
    }

    public void addItem(String item){
        adapter.add(item);
    }
}

