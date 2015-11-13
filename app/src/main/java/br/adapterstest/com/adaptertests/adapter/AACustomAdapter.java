package br.adapterstest.com.adaptertests.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

import java.util.List;

/**
 * Created by thiago on 13/11/2015.
 */
@EBean
public class AACustomAdapter extends BaseAdapter {

    @RootContext
    Context context;

    public void add(String item){
        this.list.add(item);
        notifyDataSetChanged();
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    private List<String> list;

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = View.inflate(context, android.R.layout.simple_list_item_1, null);// isso demora.....cuidado
        }
        ((TextView) convertView).setText(getItem(position).toString());
        return convertView;
    }
}
