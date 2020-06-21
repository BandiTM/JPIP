package com.company;

public class kupTshirt {
    TSHIRTSIZE Rozmiar;
    TSHIRTCOLOR Kolor;
    TSHIRTTYPE Typ;

    kupTshirt(){
        this.Rozmiar = TSHIRTSIZE.M;
        this.Typ = TSHIRTTYPE.DLUGI;
        this.Kolor = TSHIRTCOLOR.CZERWONY;
    }

    kupTshirt(int kolor,int rozmiar, int typ){
        switch (kolor){
            case 0:
                this.Kolor = TSHIRTCOLOR.CZERWONY;
                break;
            case 1:
                this.Kolor = TSHIRTCOLOR.NIEBIESKI;
                break;
            case 2:
                this.Kolor = TSHIRTCOLOR.ZIELONY;
                break;
            case 3:
                this.Kolor = TSHIRTCOLOR.RÓŻÓWY;
            default:
                this.Kolor = TSHIRTCOLOR.CZERWONY;
                System.out.println("Zły wybór ustawiam na domyślny kolor");
                break;
        }
        switch (rozmiar){
            case 0:
                this.Rozmiar = TSHIRTSIZE.XS;
                break;
            case 1:
               this.Rozmiar =TSHIRTSIZE.S;
               break;
            case 2:
                this.Rozmiar = TSHIRTSIZE.M;
                break;
            case 3:
                this.Rozmiar = TSHIRTSIZE.L;
                break;
            case 4:
                this.Rozmiar = TSHIRTSIZE.XL;
                break;
            case 5:
                this.Rozmiar = TSHIRTSIZE.XXL;
                break;
            default:
                this.Rozmiar = TSHIRTSIZE.M;
                System.out.println("Zły wybór ustawiam na domyślny Rozmiar");
                break;
        }
        switch (typ){
            case 0:
                this.Typ = TSHIRTTYPE.POLO;
                break;
            case 1:
                this.Typ = TSHIRTTYPE.SEREK;
                break;
            case 2:
                this.Typ = TSHIRTTYPE.DLUGI;
                break;
            case 3:
                this.Typ = TSHIRTTYPE.KAPTUR;
            default:
                this.Typ = TSHIRTTYPE.POLO;
                System.out.println("Zły wybór ustatwiam na domyślny Typ !");
                break;
        }
    }

    public void printTshirt(){
        System.out.println("Kupiłeś tshirt : "+ this.Rozmiar.toString().toLowerCase()+" "+this.Rozmiar.getDlugosc()+" "+this.Rozmiar.getSzerokosc()+" "+this.Rozmiar.getDlugoscRekawa() +" "+this.Kolor.toString().toLowerCase()+" "+this.Typ.toString().toLowerCase());
    }

    public void Ladny(){
        if (this.Kolor == TSHIRTCOLOR.RÓŻÓWY){
            System.out.println("Ochydny :) ");
        }else{
            System.out.println("Bardzo ładny tshirt");
        }
    }
}
