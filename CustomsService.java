package ru.netology.service;

public class CustomsService {
    public static final int CUSTOM_WEIGHT = 100;

    public static int calculateCustoms(int price, int weight) {
        return (price/100)+(weight*CUSTOM_WEIGHT);
    }
}
