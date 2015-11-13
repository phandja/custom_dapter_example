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

    BaseAdapterFragment fragmentList;

    @AfterViews
    public void init(){
        items = new ArrayList();
        final FragmentManager manager = getSupportFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();
        fragmentList =  BaseAdapterFragment_.builder().listItems(items).build();
        transaction.add(R.id.container, fragmentList);
        transaction.commit();
    }

    @Click(R.id.bt_add)
    public void btAdd(){
        String item = my_text.getText().toString();
        fragmentList.addItem(item);
        fragmentList.myList.setSelection(fragmentList.myList.getCount() - 1);
    }
}
