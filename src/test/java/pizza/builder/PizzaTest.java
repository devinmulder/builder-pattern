package pizza.builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class PizzaTest {

    @Test
    public void test1() {

        NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.SAUSAGE)
                .addTopping(Pizza.Topping.ONION)
                .build();

        Calzone calzone = new Calzone.Builder()
                .addTopping(Pizza.Topping.HAM)
                .sauceInside()
                .build();

        System.out.println();
        System.out.println(calzone);
        System.out.println("calzone = " + calzone);
        System.out.println(nyPizza);
        System.out.println("nyPizza = " + nyPizza);
    }

}