package builder.product;

import builder.enumeration.Dough;
import builder.enumeration.Topping;

import java.util.ArrayList;

public class Recipe {
    private String name;
    private Dough dough;
    private ArrayList<Topping> toppings;

    public Recipe(String name, Dough dough, ArrayList<Topping> toppings){
        this.name = name;
        this.dough = dough;
        this.toppings = toppings;
    }

    public Dough getDough() {
        return dough;
    }

    public ArrayList<Topping> getToppings() {
        return toppings;
    }

    public void print() {
        System.out.println();
        System.out.println("--- " + name + " pizza ---"
                + System.lineSeparator() + "Roll out the " + dough + " dough,"
                + System.lineSeparator() + "Then add: " + toppings + ","
                + System.lineSeparator() + "Then let it bake for 10 minutes in an oven at 250 degrees (celsius).");
    }
}
