package com.company;

public class Hostel extends Uybulo implements JawooAble{

    public Hostel(int jiteli, String address) {
        super(jiteli, address);
    }

    @Override
    public void uslugi() {
        System.out.println("Hostelde jawagandar arenda tolowot. ");
    }

    @Override
    public String toString() {
        return "Hostelde 8 " + super.toString();
    }
}
