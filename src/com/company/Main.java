package com.company;

public class Main {

    public static void main(String[] args) {
        Kvartira jw =new Kvartira(20, "Ozgon, ul.Razzakov 10.");
        System.out.println(jw);
        Dormitory jw1 = new Dormitory(30, "Shoro Bashat ");
        System.out.println(jw1);
        Hostel jw2 = new Hostel(30, "Ana Kizil 18.");
        System.out.println(jw2);
        JawooAble[] massiv = {jw, jw1, jw2};


        for (JawooAble res: massiv) {
            res.uslugi();
        }

    }
}
