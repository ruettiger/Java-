package com.rudy.study;

public class Support extends Hero implements Healer{
    @Override
    public void heal() {
        System.out.println("辅助");
    }
}
