package ru.netology.service;

public class CustomsService {
    public static final int WEIGHT_RATE = 100;

    public static int dutyCalc(int price, int weight) {
        return (price / 100) + (weight * WEIGHT_RATE);
}

}