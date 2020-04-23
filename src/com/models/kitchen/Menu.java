package com.models.kitchen;

import com.models.dishes.Dish;

import java.util.List;

import static com.models.utils.Init.initFood;

public class Menu {

    private List<Dish> dishes;

    public Menu() {
        this.dishes = initFood();
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }
}
