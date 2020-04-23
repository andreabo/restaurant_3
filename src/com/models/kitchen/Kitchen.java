package com.models.kitchen;

import java.util.List;

import static com.models.utils.Init.initIngredients;

public class Kitchen {

    private List<Ingredient> ingredients;
    private Menu menu;

    public Kitchen() {
        this.menu = new Menu();
        this.ingredients = initIngredients();
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
