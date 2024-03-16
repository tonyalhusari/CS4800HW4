package Factory;

import java.util.ArrayList;

import java.util.List;

public class Demo {

    public static void main(String[] args) {
       // Creating 6 customers with different diet plans
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("John", "No Restriction"));
        customers.add(new Customer("Alice", "Paleo"));
        customers.add(new Customer("Bob", "Vegan"));
        customers.add(new Customer("Emily", "Nut Allergy"));
        customers.add(new Customer("Charlie", "No Restriction"));
        customers.add(new Customer("David", "Vegan"));

        // Generate meal for each customer
        for (Customer customer : customers) {
            System.out.println("Customer: " + customer.getName() + ", Diet Plan: " + customer.getDietPlan());
            System.out.println("Meal Contains:");
            generateMeal(customer);
            System.out.println("-------------------------");
        }

    }

    public static void generateMeal(Customer customer) {
        MacronutrientsFactory factoryCreator = FactoryCreator.getMacronutrientsFactory("Carbs");
        Carbs carbs = factoryCreator.getCarbs(customer.getDietPlan());

        factoryCreator = FactoryCreator.getMacronutrientsFactory("Protein");
        Protein protein = factoryCreator.getProtein(customer.getDietPlan());

        factoryCreator = FactoryCreator.getMacronutrientsFactory("Fats");
        Fats fats = factoryCreator.getFats(customer.getDietPlan());

        Meal meal = new Meal(carbs, protein, fats);
        meal.display();

    }
}
