package Builder;

public class PizzaDemo {
    public static void main(String[] args){
        // PizzaHut size large with 3 toppings

        Pizza pizza = new PizzaHutBuilder(PizzaSize.LARGE)
                .setPizzaName("Pizza Hut")
                .setPizzaTopping(PizzaTopping.HAM)
                .setPizzaTopping(PizzaTopping.PEPPERONI)
                .setPizzaTopping(PizzaTopping.OLIVES)
                .build();
        pizza.eat();

        pizza = new DominosBuilder(PizzaSize.SMALL)
                .setPizzaName("Pizza Hut")
                .setPizzaTopping(PizzaTopping.BACON)
                .setPizzaTopping(PizzaTopping.CHICKEN)
                .build();
        pizza.eat();

        pizza = new LittleCaesarsBuilder(PizzaSize.MEDIUM)
                .setPizzaName("Little Caesars")
                .setPizzaTopping(PizzaTopping.BEEF)
                .setPizzaTopping(PizzaTopping.HAM_AND_PINEAPPLE)
                .setPizzaTopping(PizzaTopping.SPICY_PORK)
                .setPizzaTopping(PizzaTopping.EXTRA_CHEESE)
                .setPizzaTopping(PizzaTopping.PESTO)
                .setPizzaTopping(PizzaTopping.TOMATO_AND_BASIL)
                .setPizzaTopping(PizzaTopping.ONIONS)
                .setPizzaTopping(PizzaTopping.MUSHROOMS)
                .build();
        pizza.eat();

        pizza = new LittleCaesarsBuilder(PizzaSize.SMALL)
                .setPizzaName("Little Caesars")
                .setPizzaTopping(PizzaTopping.HAM)
                .setPizzaTopping(PizzaTopping.PEPPERONI)
                .setPizzaTopping(PizzaTopping.SAUSAGE)
                .setPizzaTopping(PizzaTopping.SPINACH)
                .setPizzaTopping(PizzaTopping.PEPPERS)
                .setPizzaTopping(PizzaTopping.OLIVES)
                .build();
        pizza.eat();

        pizza = new DominosBuilder(PizzaSize.SMALL)
                .setPizzaName("Dominos")
                .setPizzaTopping(PizzaTopping.PEPPERONI)
                .build();
        pizza.eat();

        pizza = new DominosBuilder(PizzaSize.LARGE)
                .setPizzaName("Dominos")
                .setPizzaTopping(PizzaTopping.BACON)
                .setPizzaTopping(PizzaTopping.CHICKEN)
                .setPizzaTopping(PizzaTopping.MUSHROOMS)
                .build();
        pizza.eat();




    }
}
