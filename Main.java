package com.company;

public class Main {

    public static int feladat01(String [] szinek){
        if(szinek.length == 0 || szinek.length == 1){
            return 0;
        }
        int szam = 0;
        int kezdo = 1;
        int szamlalo = kezdo;
        for(int i = 0; i < szinek.length; i++){
            while(szamlalo < szinek.length){
                szam++;
                szamlalo++;
            }
            szamlalo = kezdo+1;
            kezdo++;
        }
        if(szinek.length > 2){
            szam++;
        }
        return szam;
    }
    public static void main(String[] args) {
        String[] szinek = {"prios", "kék","zöld"};
        System.out.println(feladat01(szinek));
    }


}
