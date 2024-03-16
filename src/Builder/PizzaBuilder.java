package Builder;

public interface PizzaBuilder {

    public PizzaBuilder setPizzaName(String name);
    public PizzaBuilder setPizzaTopping(PizzaTopping topping);

    public Pizza build();

}
