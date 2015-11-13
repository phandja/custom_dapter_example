package br.adapterstest.com.adaptertests.fragment;

import android.support.v4.app.Fragment;
import android.widget.ListView;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

import br.adapterstest.com.adaptertests.CustomAdapter;
import br.adapterstest.com.adaptertests.R;
import br.adapterstest.com.adaptertests.adapter.PlanetAdapter;
import br.adapterstest.com.adaptertests.model.Planet;

/**
 * Created by thiago on 13/11/2015.
 */
@EFragment(R.layout.list)
public class PlanetAdapterFragment extends Fragment {
    @FragmentArg
    ArrayList<Planet> listItems;

    @ViewById
    ListView myList;

    @ViewById
    TextView empty;

    @Bean
    PlanetAdapter adapter;

    @AfterViews
    public void init() {
        listItems = (ArrayList<Planet>) populatePlanets();
        adapter.setList(listItems);
        myList.setAdapter(adapter);
        myList.setEmptyView(empty);
    }

    public void addItem(Planet item){
        adapter.add(item);
    }


    //Usar no Fragment
    private List<Planet> populatePlanets() {
        ArrayList<Planet> planets = new ArrayList<Planet>();
        planets.add(new Planet("Merkur", R.drawable.merkur));
        planets.add(new Planet("Venera", R.drawable.venera));
        planets.add(new Planet("Zemlja", R.drawable.zemlja));
        planets.add(new Planet("Mars", R.drawable.mars));
        planets.add(new Planet("Jupiter", R.drawable.jupiter));
        planets.add(new Planet("Saturn", R.drawable.saturn));
        planets.add(new Planet("Uran", R.drawable.uran));
        planets.add(new Planet("Neptun", R.drawable.neptun));
        planets.add(new Planet("Pluton", R.drawable.pluton));

        return planets;
    }
}

