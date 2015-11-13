package br.adapterstest.com.adaptertests.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

import java.util.ArrayList;
import java.util.List;

import br.adapterstest.com.adaptertests.R;
import br.adapterstest.com.adaptertests.model.Planet;

/**
 * Created by thiago on 13/11/2015.
 */
@EBean
public class PlanetAdapter extends BaseAdapter {

    @RootContext
    Context context;

    public void add(Planet item){
        this.list.add(item);
        notifyDataSetChanged();
    }

    public List<Planet> getList() {
        return list;
    }

    public void setList(ArrayList<Planet> list) {
        this.list = list;
    }

    private List<Planet> list;

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
            convertView = View.inflate(context, R.layout.manolo_item, null);// isso demora.....cuidado
        }
        Planet planet = (Planet) getItem(position);
        ImageView image = (ImageView) convertView.findViewById(R.id.imageView);
        image.setImageResource(planet.getImgRes());

        TextView mytext = (TextView) convertView.findViewById(R.id.textView);
        mytext.setText(planet.getName());

        return convertView;
    }
}
