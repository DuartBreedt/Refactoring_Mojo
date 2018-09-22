package za.co.entelect.mojo.refactoring.c.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class FruitSalad {
    private Map<IngredientType, List<Ingredients>> ingredients;

    FruitSalad() {
        ingredients = new HashMap<>();
    }

    FruitSalad addIngredient(IngredientType type, Ingredients ingredient) {
        if(!ingredients.containsKey(type)) {
            ingredients.put(type, new ArrayList<Ingredients>());
        }
        ingredients.get(type).add(ingredient);
        return this;
    }
    FruitSalad addIngredients(IngredientType type, List<Ingredients> ingredients) {
        if(!this.ingredients.containsKey(type)) {
            this.ingredients.put(type, new ArrayList<Ingredients>());
        }
        this.ingredients.get(type).addAll(ingredients);
        return this;
    }

    public List<Ingredients> getIngredients(IngredientType type) {
        return ingredients.get(type);
    }
}
