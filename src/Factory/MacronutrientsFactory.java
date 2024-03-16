package Factory;

public abstract class MacronutrientsFactory {

    public abstract Carbs getCarbs(String dietPlan);
    public abstract Protein getProtein(String dietPlan);
    public abstract Fats getFats(String dietPlan);
}
