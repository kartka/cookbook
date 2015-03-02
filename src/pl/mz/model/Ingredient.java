package pl.mz.model;

/**
 * Created by Marta Zukowska (mrt.zukowska@gmail.com) on 2015-02-25.
 */
public class Ingredient {
    double quantity;
    String description;

    public Ingredient(final double quantity, final String description) {
        this.quantity = quantity;
        this.description = description;
    }

    @Override
    public final String toString() {
        return "Ingredient{" +
                "quantity=" + quantity +
                ", description='" + description + '\'' +
                '}';
    }
}
