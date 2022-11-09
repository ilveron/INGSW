package builder.builder;

import builder.enumeration.Dough;
import builder.enumeration.Topping;
import builder.product.Pizza;

import java.util.ArrayList;

public class PizzaBuilder implements Builder {
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
    public void setName(String name) { this.name = name; }

    public Pizza getResult(){
        return new Pizza(name, dough, toppings);
    }
}
