package br.adapterstest.com.adaptertests;

import android.support.v4.app.Fragment;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@EFragment(R.layout.list)
public class MyListFragment extends Fragment {
    @FragmentArg
    int qtdListItems;

    @ViewById
    ListView myList;

    SimpleAdapter adapter;
    
    @AfterViews
    public void init(){
        List<HashMap<String, String>> data = getData();
        int resource = android.R.layout.simple_list_item_1;
        String[] from = {"name"};
        int[] to = {android.R.id.text1};
        adapter = new SimpleAdapter(getActivity(), data, resource, from, to);
        myList.setAdapter(adapter);
    }

    private List<HashMap<String, String>> getData() {
        List<HashMap<String, String>> list = new ArrayList(qtdListItems);

        for(int i=0; i < qtdListItems; i++){
            HashMap<String, String> hash = new HashMap<>();
            hash.put("name", getString(R.string.fragment_list_text, i));
            list.add(hash);
        }

        return list;
    }
}
