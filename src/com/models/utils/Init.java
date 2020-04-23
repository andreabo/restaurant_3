package com.models.utils;

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
}
