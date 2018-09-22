package za.co.entelect.mojo.refactoring.c.problem;

import java.util.List;

public class FruitSaladService {

    private FruitSalad fruitSalad;

    public FruitSaladService() {
        fruitSalad = new FruitSalad();
    }

    public void prepareBaiscFruitSalad() {
        fruitSalad.addBase(Ingredients.WATERMELON);
        fruitSalad.addSecondaryIngredient(Ingredients.MANGO);
        fruitSalad.addSecondaryIngredient(Ingredients.STRAWBERRY);
        fruitSalad.addSecondaryIngredient(Ingredients.APPLE);
        fruitSalad.addTertiaryIngredient(Ingredients.GRAPE);
    }

    public void prepareFruitSalad(List<Ingredients> base, List<Ingredients> secondaryIngredients, List<Ingredients> tertiaryIngredients) {
        fruitSalad.getBases().addAll(base);
        fruitSalad.getSecondaryIngredients().addAll(secondaryIngredients);
        fruitSalad.getTertiaryIngredients().addAll(tertiaryIngredients);
    }

}
