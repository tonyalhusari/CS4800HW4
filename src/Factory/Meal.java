package Factory;

public class Meal {

    private Carbs carbs;
    private Protein protein;
    private Fats fats;

    public Meal(Carbs carbs, Protein protein, Fats fats) {
        this.carbs = carbs;
        this.protein = protein;
        this.fats = fats;
    }

    public void display() {
        System.out.println("Carbs: " + carbs.getCarbs());
        System.out.println("Protein: " + protein.getProtein());
        System.out.println("Fats: " + fats.getFats());
    }

}
