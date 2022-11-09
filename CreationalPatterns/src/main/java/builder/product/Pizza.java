package builder.product;

import builder.enumeration.Dough;
import builder.enumeration.Topping;
import javax.swing.*;
import java.util.ArrayList;

public class Pizza {
    private String name;
    private Dough dough;
    private ArrayList<Topping> toppings;

    public Pizza(String name, Dough dough, ArrayList<Topping> toppings){
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

    @Override
    public String toString() {
        return "Pizza: " + "\tDough ->" + dough +
                System.lineSeparator() + "\t\tToppings -> {" + toppings + '}';
    }

    public void show() {
        JFrame f = new JFrame(name + " pizza");
        ImageIcon img = new ImageIcon(getClass().getResource("/"+name+".jpg"));
        f.setSize(600,600);
        f.add(new JLabel(img));
        f.setVisible(true);
        f.setAlwaysOnTop(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
