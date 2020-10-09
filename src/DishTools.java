public class DishTools {
    public static final int average = 13000;
    public static void shoutDishName(Dish asdf) {
        System.out.println(asdf.nameOfDish.toUpperCase());
    }
    public static void analyzeDishCost(Dish asdf) {
        if (asdf.costInCents > DishTools.average){
            System.out.println("more than average cost");
        } else if (asdf.costInCents == DishTools.average) {
            System.out.println("average cost");
        } else {
            System.out.println("more than average cost");
        }
    }
    public static boolean flipRecommended(Dish asdf){
        return asdf.wouldRecommend;
    }
}
