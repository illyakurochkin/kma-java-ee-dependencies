package org.example;

import org.example.heroes.heroesImplementations.Hero2;
import org.example.heroes.heroesImplementations.Hero1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        Hero1 hero1 = (Hero1) context.getBean("hero1impl");
        hero1.showPower();
        Hero2 hero2 = (Hero2) context.getBean("hero2impl");
        hero2.showPower();
        Hero2 superHero2 = (Hero2) context.getBean("superhero2impl");
        superHero2.showPower();
    }
}
