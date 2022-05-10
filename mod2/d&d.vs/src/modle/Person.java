package modle;

import javax.annotation.processing.RoundEnvironment;

public class Person {
    private int str;

    public int getStr() {
        return this.str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    private int strm = (str - 10) / 2;

    public int getStrm() {
        return this.strm;
    }

    private int dex;

    public int getDex() {
        return this.dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    private int dexm = (dex - 10) / 2;

    public int getDexm() {
        return this.dexm;
    }

    private int con;

    public int getCon() {
        return this.con;
    }

    public void setCon(int con) {
        this.con = con;
    }

    private int conm = (con - 10) / 2;

    public int getConm() {
        return this.conm;
    }

    private int itl;

    public int getItl() {
        return this.itl;
    }

    public void setItl(int itl) {
        this.itl = itl;
    }

    private int itlm = (itl - 10) / 2;

    public int getItlm() {
        return this.itlm;
    }

    private int wis;

    public int getWis() {
        return this.wis;
    }

    public void setWis(int wis) {
        this.wis = wis;
    }

    private int wism = (wis - 10) / 2;

    public int getWism() {
        return this.wism;
    }

    private int car;

    public int getCar() {
        return this.car;
    }

    public void setCar(int car) {
        this.car = car;
    }

    private int carm = (car - 10) / 2;

    public int getCarm() {
        return this.carm;
    }

    // private List itemList = new List();
}
