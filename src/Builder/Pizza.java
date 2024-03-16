package Builder;

import java.util.List;

public class Pizza {
    private String name;
    private PizzaSize size;
    private List<PizzaTopping> topping;
    public Pizza(String name, PizzaSize size, List<PizzaTopping> topping){
        this.name = name;
        this.size = size;
        this.topping = topping;
    }

    public void eat(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", topping=" + topping +
                "}\n";
    }
}
