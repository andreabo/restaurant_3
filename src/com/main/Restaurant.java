package com.main;

import com.models.kitchen.Kitchen;

public class Restaurant {
    public static Kitchen kitchen = new Kitchen();

    public static void main(String[] args) {
        kitchen.getIngredients().forEach(ingredient -> System.out.println(ingredient.toString()));

    }
}
