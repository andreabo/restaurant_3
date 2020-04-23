package com.models.dishes;

import com.models.kitchen.Ingredient;
import java.util.List;

public class Food extends Dish {

    public Food(String name, List<Ingredient> ingredientList) {
        super(name, ingredientList);
    }

    @Override
    public double calculatePrice() {
        double sumPrice = 0;
        for (Ingredient ingredient : getIngredientList()) {
            sumPrice = sumPrice + ingredient.getPrice();
        }
        return (sumPrice * 0.1) + sumPrice;
    }
}