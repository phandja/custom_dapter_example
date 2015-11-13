package br.adapterstest.com.adaptertests;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    ArrayList items;

    @ViewById
    EditText my_text;

    ArrayAdapterFragment_ fragmentList;

    @AfterViews
    public void init(){
        items = new ArrayList();
        final FragmentManager manager = getSupportFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();
        fragmentList = (ArrayAdapterFragment_) ArrayAdapterFragment_.builder().listItems(items).build();
        transaction.add(R.id.container, fragmentList);
        transaction.commit();
    }

    @Click(R.id.bt_add)
    public void btAdd(){
        String item = my_text.getText().toString();
//        items.add(item);
//        fragmentList.setListItems(items);
        fragmentList.addItem(item);
//        fragmentList.myList.scrollBy(0, fragmentList.);
        fragmentList.myList.setSelection(fragmentList.myList.getCount() - 1);
    }
}
