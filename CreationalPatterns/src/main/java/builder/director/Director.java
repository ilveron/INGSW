package builder.director;

import builder.builder.Builder;
import builder.enumeration.Topping;

//The Director will be a SINGLETON class
public class Director {
    Builder builder;
    private Director instance = null;
    private Director(){}
    public Director getInstance(){
        if(instance == null)
            instance = new Director();
        return instance;
    }

    public static void makeMargherita(Builder builder){
        builder.addTopping(Topping.BASIL);
        builder.addTopping(Topping.SAUCE);
        builder.addTopping(Topping.MOZZARELLA);
        builder.addTopping(Topping.OIL);
        builder.setName("margherita");
    }

    public static void makeAmericana(Builder builder){
        builder.addTopping(Topping.WURSTEL);
        builder.addTopping(Topping.FRIES);
        builder.addTopping(Topping.SAUCE);
        builder.addTopping(Topping.MOZZARELLA);
        builder.setName("americana");
    }

    public static void makePepperoni(Builder builder){
        builder.addTopping(Topping.SAUCE);
        builder.addTopping(Topping.CHEESE);
        builder.addTopping(Topping.PEPPERONI);
        builder.addTopping(Topping.BASIL);
        builder.setName("pepperoni");
    }

    public static void makeMarinara(Builder builder){
        builder.addTopping(Topping.SAUCE);
        builder.addTopping(Topping.GARLIC);
        builder.addTopping(Topping.OREGANO);
        builder.addTopping(Topping.OIL);
        builder.setName("marinara");
    }

    public static void makeTropea(Builder builder){
        builder.addTopping(Topping.SAUCE);
        builder.addTopping(Topping.TUNA);
        builder.addTopping(Topping.ONIONS);
        builder.addTopping(Topping.BASIL);
        builder.addTopping(Topping.MOZZARELLA);
        builder.setName("tropea");
    }

    public static void makePrimavera(Builder builder){
        builder.addTopping(Topping.SAUCE);
        builder.addTopping(Topping.TOMATOES);
        builder.addTopping(Topping.PARMESAN);
        builder.addTopping(Topping.RAW_HAM);
        builder.addTopping(Topping.ROCKET_SALAD);
        builder.setName("primavera");
    }
}
