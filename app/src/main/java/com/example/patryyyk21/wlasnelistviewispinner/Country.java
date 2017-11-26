package com.example.patryyyk21.wlasnelistviewispinner;

/**
 * Created by Patryyyk21 on 2017-10-23.
 */

public class Country {

    private int Flag;
    private String Name;
    private int Surface;
    private String Capitol;

    public Country (int cFlag, String cName, int cSurface, String cCapitol) {
        this.Flag = cFlag;
        this.Name = cName;
        this.Surface = cSurface;
        this.Capitol = cCapitol;
    }

    public int getFlag() {
        return this.Flag;
    }

    public String getName() {
        return this.Name;
    }

    public int getSurface() {
        return this.Surface;
    }

    public String getCapitol() {
        return this.Capitol;
    }
}
