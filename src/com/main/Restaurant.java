package com.main;

import com.models.kitchen.Kitchen;

public class Restaurant {
    public static Kitchen kitchen = new Kitchen();

    public static void main(String[] args) {
        System.out.println("Ingredientes: ");
        kitchen.getIngredients().forEach(ingredient -> System.out.println(ingredient.toString()));

        System.out.println("Platos: ");
        kitchen.getMenu().getDishes()
                .forEach(dish -> {
                    System.out.println("Nombre  del plato: " + dish.getName() + " - Precio : " + dish.calculatePrice());
                    System.out.println("Los ingredientes son: ");
                    dish.getIngredientList()
                            .forEach(ingredient -> System.out.println("Nombre: " + ingredient.getName() + " - Precio por ing: " + ingredient.getPrice()));
                });
    }
}
