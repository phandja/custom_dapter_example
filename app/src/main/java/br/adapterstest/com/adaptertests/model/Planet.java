package br.adapterstest.com.adaptertests.model;

/**
 * Created by thiago on 13/11/2015.
 */
public class Planet {

    private String name;

    private int imgRes;

    public Planet(String name, int imgRes) {
        this.name = name;
        this.imgRes = imgRes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }
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
