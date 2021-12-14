package com.company;

public class Limb extends DanteHell{
    public Limb(String name, String punishment, String guard, String харон) {
        super(name, punishment, guard);
    }

    @Override
    public void print() {
        System.out.println("Первый круг ада" + getName() + "," + getPunishment() + ",страж" + getGuard());

    }
}
