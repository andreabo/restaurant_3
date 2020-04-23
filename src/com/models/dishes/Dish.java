package com.models.dishes;

import com.models.kitchen.Ingredient;
import java.util.List;

public abstract class Dish {

    private String name;
    private List<Ingredient> ingredientList;

    public Dish(String name, List<Ingredient> ingredientList) {
        this.name = name;
        this.ingredientList = ingredientList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    public abstract double calculatePrice();
}
