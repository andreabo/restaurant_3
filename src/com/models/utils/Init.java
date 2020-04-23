package com.models.utils;

import com.models.dishes.Dish;
import com.models.dishes.Food;
import com.models.kitchen.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class Init {
    private static Common common = new Common();

    public static List<Ingredient> initIngredients() {
        List<String> lines = common.readFile("ingredientes.txt");
        List<Ingredient> ingredientList = new ArrayList<>();

        for (String line : lines) {
            String[] values = line.split(",");

            Ingredient ingredient = new Ingredient(values[0], Double.parseDouble(values[1]), Integer.parseInt(values[2]));
            ingredientList.add(ingredient);
        }
        return ingredientList;
    }

    public static List<Dish> initFood() {

        List<Dish> foodList = new ArrayList<>();

        Food food1 = new Food("Hamburguesa", getHamburgerIngredients());
        Food food2 = new Food("Sandwich", getSandwichIngredients());

        foodList.add(food1);
        foodList.add(food2);

        return foodList;
    }

    private static List<Ingredient> getHamburgerIngredients() {
        Ingredient pan = new Ingredient("pan", 20, 2);
        Ingredient carne = new Ingredient("carne", 70, 1);
        Ingredient tomate = new Ingredient("tomate", 40, 1);

        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(pan);
        ingredients.add(carne);
        ingredients.add(tomate);

        return ingredients;
    }

    private static List<Ingredient> getSandwichIngredients() {
        Ingredient pan = new Ingredient("pan", 20, 2);
        Ingredient carne = new Ingredient("carne", 70, 1);
        Ingredient tomate = new Ingredient("tomate", 40, 1);
        Ingredient cebolla = new Ingredient("cebolla", 30, 1);

        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(pan);
        ingredients.add(carne);
        ingredients.add(tomate);
        ingredients.add(cebolla);

        return ingredients;
    }
}
