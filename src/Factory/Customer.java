package Factory;

public class Customer {
    private String name;
    private String dietPlan;

    public Customer(String name, String dietPlane) {
        this.name = name;
        this.dietPlan = dietPlane;
    }

    public String getName() {
        return name;
    }
    public String getDietPlan() {
        return dietPlan;
    }
    public void setDietPlan(String dietPlane) {
        this.dietPlan = dietPlane;
    }
}
