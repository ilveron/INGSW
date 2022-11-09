package builder.builder;

import builder.enumeration.Dough;
import builder.enumeration.Topping;
import builder.product.Recipe;

import java.util.ArrayList;

public class RecipeBuilder implements Builder {
    private String name;
    private Dough dough;
    private ArrayList<Topping> toppings = new ArrayList<>();

    @Override
    public void setDough(Dough dough) {
        this.dough = dough;
    }

    @Override
    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Recipe getResult(){
        return new Recipe(name, dough, toppings);
    }
}
