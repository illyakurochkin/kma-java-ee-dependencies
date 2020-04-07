package org.example.heroes.heroesImplementations;

import org.example.heroes.Hero;

public class Hero1 implements Hero {

    private final int age;

    public Hero1() {
        this(25);
    }

    public Hero1(int age) {
        this.age = age;
    }

    @Override
    public void showPower() {
        System.out.println("Hello my age is: " + age);
    }

}
