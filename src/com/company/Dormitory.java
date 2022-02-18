package com.company;

public class Dormitory extends Uybulo implements JawooAble{

    public Dormitory(int jiteli, String address) {
        super(jiteli, address);
    }

    @Override
    public void uslugi() {
        System.out.println("Dormitoride jawagandar arenda tolowot.");
    }

    @Override
    public String toString() {
        return "Dormitoryde 6 " + super.toString();
    }
}
