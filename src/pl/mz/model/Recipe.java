package pl.mz.model;

import java.util.List;

/**
 * Created by Marta Zukowska (mrt.zukowska@gmail.com) on 2015-02-25.
 */
public class Recipe {
    private String title;
    private List<Ingredient> ingredients;
    private String directions;

    public Recipe(final String title, final List<Ingredient> ingredients, final String directions) {
        this.title = title;
        this.ingredients = ingredients;
        this.directions = directions;
    }

    @Override
    public final String toString() {
        return "Recipe{" +
                "title='" + title + '\'' +
                ", ingredients=" + ingredients +
                ", directions='" + directions + '\'' +
                '}';
    }
}
