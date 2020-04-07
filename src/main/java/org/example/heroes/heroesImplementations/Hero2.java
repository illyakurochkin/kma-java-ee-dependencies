package org.example.heroes.heroesImplementations;

import org.example.heroes.Hero;
import org.example.heroes.ShotWeapon;

import java.util.Collection;

public class Hero2 implements Hero {
    private ShotWeapon weapon;

    public void setWeapon(ShotWeapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void showPower() {
        System.out.println("hello i am hero 2");
        weapon.makeSoundShot();;
    }
}
