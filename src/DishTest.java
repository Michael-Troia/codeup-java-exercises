public class DishTest {
    public static void main(String[] args) {
        Dish dish1 = new Dish();
        dish1.costInCents = 400;
        dish1.nameOfDish = "Icecream with two \"n's\" instead of an \"m\"";
        dish1.wouldRecommend = true;
        dish1.printSummary();
        DishTools.analyzeDishCost(dish1);
    }
}
