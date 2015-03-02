package pl.mz;

import pl.mz.model.Cookbook;
import pl.mz.model.Ingredient;
import pl.mz.model.Recipe;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Cookbook cookbook = new Cookbook();

    public static void main(String[] args) {
        Recipe recipe = getRecipeFromUser();
        cookbook.addRecipie(recipe);

        System.out.println("Przepisy w książce kucharskiej:");
        printRecipes(cookbook.getRecipies());
    }

    private static void printRecipes(final List<Recipe> recipies) {
        for (Recipe recipe : recipies) {
            System.out.println(recipe);
        }
    }

    private static Recipe getRecipeFromUser() {
        List<Ingredient> ingredients = new LinkedList<>();

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj tytuł przepisu:");
        String title = in.nextLine();

        System.out.println("Podaj liczbę składników");
        int ingredientNumber = Integer.parseInt(in.nextLine());

        for (int i=0; i<ingredientNumber; ++i) {
            System.out.println("Podaj ilość składnika:");
            double quantity = Double.parseDouble(in.nextLine());

            System.out.println("Podaj opis składnika:");
            String ingredientDescription = in.nextLine();

            ingredients.add(new Ingredient(quantity, ingredientDescription));
        }

        System.out.println("Opis przepisu w jednej linii:");
        String directions = in.nextLine();


        return new Recipe(title, ingredients, directions);
    }
}
