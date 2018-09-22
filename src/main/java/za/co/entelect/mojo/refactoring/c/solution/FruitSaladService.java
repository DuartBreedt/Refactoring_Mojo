package za.co.entelect.mojo.refactoring.c.solution;

import java.util.Arrays;
import java.util.List;

public class FruitSaladService {

    private FruitSalad fruitSalad;

    public FruitSaladService() {
        fruitSalad = new FruitSalad();
    }

    public void prepareFruitSalad() {
        fruitSalad
                .addIngredient(IngredientType.BASE, Ingredients.WATERMELON)
                .addIngredients(IngredientType.SECONDARY, Arrays.asList(
                        Ingredients.MANGO,
                        Ingredients.STRAWBERRY,
                        Ingredients.APPLE))
                .addIngredient(IngredientType.TERTIARY, Ingredients.GRAPE);
    }

    public void addIngredients(IngredientType type, List<Ingredients> ingredients) {
        fruitSalad.addIngredients(type, ingredients);
    }

    public void addIngredient(IngredientType type, Ingredients ingredient) {
        fruitSalad.addIngredient(type, ingredient);
    }
}
