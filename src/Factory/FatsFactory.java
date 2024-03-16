package Factory;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FatsFactory extends MacronutrientsFactory {
    private static FatsFactory instance = null;

    private FatsFactory() {}

    public static FatsFactory getInstance() {
        if (instance == null) {
            instance = new FatsFactory();
        }
        return instance;
    }
    @Override
    public Carbs getCarbs(String dietPlan) {
        return null;
    }

    @Override
    public Protein getProtein(String dietPlan) {
        return null;
    }

    @Override
    public Fats getFats(String dietPlan) {
        //generate random fats
        Random rand = new Random();
        if (dietPlan.equalsIgnoreCase("Paleo")) {
            List<Fats> fatsOptions = Arrays.asList(new Avocado(), new Tuna(), new Peanut());
            return fatsOptions.get(rand.nextInt(fatsOptions.size()));

        } else if (dietPlan.equalsIgnoreCase("Vegan")) {
            List<Fats> fatsOptions = Arrays.asList(new Avocado(), new Peanut());
            return fatsOptions.get(rand.nextInt(fatsOptions.size()));

        } else if (dietPlan.equalsIgnoreCase("Nut Allergy")) {
            List<Fats> fatsOptions = Arrays.asList(new Avocado(), new SourCream(), new Tuna(), new Peanut());
            return fatsOptions.get(rand.nextInt(fatsOptions.size()));

        } else if (dietPlan.equalsIgnoreCase("No Restriction")) {
            List<Fats> fatsOptions = Arrays.asList(new Avocado(), new SourCream(), new Tuna());
            return fatsOptions.get(rand.nextInt(fatsOptions.size()));
        }
        return null;

    }
}
