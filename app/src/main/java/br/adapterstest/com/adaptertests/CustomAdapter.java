package br.adapterstest.com.adaptertests;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by thiago on 13/11/2015.
 */
public class CustomAdapter extends BaseAdapter {

    private List<String> list;
    private Context context;

    public CustomAdapter(Context context, List<String> list){
        this.list = list;
        this.context = context;
    }

    public void add(String item){
        this.list.add(item);
        notifyDataSetChanged();
    }

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
