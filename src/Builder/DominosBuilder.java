package Builder;

import java.util.ArrayList;
import java.util.List;

public class DominosBuilder implements PizzaBuilder{
    private String name;
    private PizzaSize size;
    private List<PizzaTopping> topping;

    public DominosBuilder(PizzaSize size){
        this.size = size;
        this.topping = new ArrayList<>();

    }

    public PizzaBuilder setPizzaName(String name){
        this.name = name;
        return this;
    };


    @Override
    public PizzaBuilder setPizzaTopping(PizzaTopping topping) {
        this.topping.add(topping);
        return this;
    }

    @Override
    public Pizza build() {
        //Ask do i need a try catch to make sure the pizza size has been set, do i put it here or somewhere else
        return new Pizza(name, size, topping);
    }
}
