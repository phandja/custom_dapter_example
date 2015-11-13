package br.adapterstest.com.adaptertests;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @AfterViews
    public void init(){
        final FragmentManager manager = getSupportFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();
        final MyListFragment fragment = MyListFragment_.builder().qtdListItems(12).build();
        transaction.add(R.id.container, fragment);
        transaction.commit();
    }
}
