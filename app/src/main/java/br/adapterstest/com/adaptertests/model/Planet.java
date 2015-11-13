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
