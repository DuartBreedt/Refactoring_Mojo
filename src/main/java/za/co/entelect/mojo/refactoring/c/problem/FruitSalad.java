package za.co.entelect.mojo.refactoring.c.problem;

import java.util.ArrayList;
import java.util.List;

class FruitSalad {
    private List<Ingredients> bases;
    private List<Ingredients> secondaryIngredients;
    private List<Ingredients> tertiaryIngredients;

    FruitSalad() {
        this.bases = new ArrayList<>();
        this.secondaryIngredients = new ArrayList<>();
        this.tertiaryIngredients = new ArrayList<>();
    }

    void addBase(Ingredients base) {
        this.bases.add(base);
    }

    void addSecondaryIngredient(Ingredients secondaryIngredient) {
        this.secondaryIngredients.add(secondaryIngredient);
    }

    void addTertiaryIngredient(Ingredients tertiaryIngredient) {
        this.tertiaryIngredients.add(tertiaryIngredient);
    }

    public List<Ingredients> getBases() {
        return bases;
    }

    public List<Ingredients> getSecondaryIngredients() {
        return secondaryIngredients;
    }

    public List<Ingredients> getTertiaryIngredients() {
        return tertiaryIngredients;
    }
}
