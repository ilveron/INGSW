package builder.client;

import builder.builder.Builder;
import builder.builder.PizzaBuilder;
import builder.builder.RecipeBuilder;
import builder.director.Director;
import builder.enumeration.Dough;
import builder.product.Pizza;
import builder.product.Recipe;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BuilderDemo {
        private static PizzaBuilder pizzaBuilder;
        private static RecipeBuilder recipeBuilder;
        public static void run(){
            pizzaBuilder = new PizzaBuilder();
            recipeBuilder = new RecipeBuilder();
            //printInitialPrompt();
            Scanner in = new Scanner(System.in);
            Byte choice;
                printDoughsList();
                choice = in.nextByte();
                pizzaBuilder.setDough(getDough(choice));
                recipeBuilder.setDough(getDough(choice));

                printPizzaList();
                choice = in.nextByte();
                switch (choice){
                    case 1:
                        Director.makeMargherita(pizzaBuilder);
                        Director.makeMargherita(recipeBuilder);
                        break;
                    case 2:
                        Director.makeAmericana(pizzaBuilder);
                        Director.makeAmericana(recipeBuilder);
                        break;
                    case 3:
                        Director.makePepperoni(pizzaBuilder);
                        Director.makePepperoni(recipeBuilder);
                        break;
                    case 4:
                        Director.makeMarinara(pizzaBuilder);
                        Director.makeMarinara(recipeBuilder);
                        break;
                    case 5:
                        Director.makeTropea(pizzaBuilder);
                        Director.makeTropea(recipeBuilder);
                        break;
                    case 6:
                        Director.makePrimavera(pizzaBuilder);
                        Director.makePrimavera(recipeBuilder);
                        break;
                    default:
                        throw new InputMismatchException();
                }

                Pizza pizza = pizzaBuilder.getResult();
                Recipe recipe = recipeBuilder.getResult();

                pizza.show();
                recipe.print();
        }

    public static void printPizzaList(){
        System.out.println();
        System.out.println("--- PIZZA LIST ---");
        System.out.println("1: Margherita");
        System.out.println("2: Americana");
        System.out.println("3: Pepperoni");
        System.out.println("4: Marinara");
        System.out.println("5: Tropea");
        System.out.println("6: Primavera");
        System.out.println("------------------");
        System.out.print("\tChoose the pizza: ");
    }

    public static void printDoughsList(){
        System.out.println();
        System.out.println("--- DOUGHS LIST ---");
        System.out.println("1: Neapolitan");
        System.out.println("2: Whole wheat");
        System.out.println("3: Pinsa");
        System.out.println("4: Gluten free");
        System.out.println("-------------------");
        System.out.print("\tSelect the dough: ");
    }

    public static Dough getDough(Byte choice){
        switch (choice){
            case 1:
                return Dough.NEAPOLITAN;
            case 2:
                return Dough.WHOLE_WHEAT;
            case 3:
                return Dough.PINSA;
            case 4:
                return Dough.GLUTEN_FREE;
            default:
                throw new InputMismatchException();
        }
    }
}
