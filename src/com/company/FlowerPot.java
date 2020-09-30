package com.company;

import com.company.plants.Plant;

public class FlowerPot<T extends Plant> {
    private T plant;

    public  static <T extends Plant>void toPlant(FlowerPot<T> flowerPot, T plant){
        flowerPot.plant=plant;
    }
}