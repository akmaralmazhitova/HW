package com.company;

public class Kvartira extends Uybulo implements JawooAble{

    public Kvartira(int jiteli, String address) {
        super(jiteli, address);
    }

    @Override
    public void uslugi() {
        System.out.println("Kvartirada jawagandar komunalniy usluga tolowot.");
    }

    @Override
    public String toString() {
        return "Kvartirada 3 " + super.toString();
    }
}
