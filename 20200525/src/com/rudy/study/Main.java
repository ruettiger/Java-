package com.rudy.study;

public class Main {
    public static void main(String[] args) {
        // write your code here
        MagicPotion magicPotion = new MagicPotion();
        magicPotion.effect();

        Hero galun = new Hero();
        APHero apHero = new APHero();
        galun.kill(apHero);


        ADHero adHero = new ADHero();
        galun.kill(adHero);


        ADAPHero adapHero = new ADAPHero();
        galun.kill(adapHero);
    }
}
