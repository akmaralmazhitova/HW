package com.company;

public abstract class Uybulo {
    private int jiteli;
    private String address;

    public Uybulo(int jiteli, String address) {
        this.jiteli = jiteli;
        this.address = address;
    }

    public int getJiteli() {
        return jiteli;
    }

    public void setJiteli(int jiteli) {
        this.jiteli = jiteli;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Uybulo{ " +
                " jiteli=" + jiteli +
                ", address='" + address + '\'' +
                '}';
    }
}
