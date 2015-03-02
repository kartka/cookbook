package pl.mz.model;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Marta Zukowska (mrt.zukowska@gmail.com) on 2015-02-25.
 */
public class Cookbook {
    private List<Recipe> recipies = new LinkedList<>();

    public void addRecipie(final Recipe recipe) {
        recipies.add(recipe);
    }

    public final List<Recipe> getRecipies() {
        return recipies;
    }
}
