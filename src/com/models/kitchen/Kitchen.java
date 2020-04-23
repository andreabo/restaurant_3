package com.models.kitchen;

import java.util.List;

import static com.models.utils.Init.initIngredients;

public class Kitchen {

    private List<Ingredient> ingredients;

    public Kitchen() {
        this.ingredients = initIngredients();
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
