package ru.netology.service;

public class CustomsService {
    public static Integer calculateCustoms(int price, int weight) {
        return (price/100)+(weight*100);
    }
}
