package com.company;

public enum TSHIRTSIZE {
    XS(86,66,90),
    S(91,71,95),
    M(97,77,98),
    L(103,83,103),
    XL(109,91,107),
    XXL(117,97,111);

    private int Szerokosc;
    private int Dlugosc;
    private int DlugoscRekawa;

    TSHIRTSIZE(int szerokosc, int dlugosc, int dlugoscRekawa){
        this.Szerokosc =szerokosc;
        this.Dlugosc = dlugosc;
        this.DlugoscRekawa = dlugoscRekawa;
    }

    public int getSzerokosc(){
        return this.Szerokosc;
    }

    public int getDlugosc(){
        return this.Dlugosc;
    }

    public int getDlugoscRekawa(){
        return this.DlugoscRekawa;
    }
}
