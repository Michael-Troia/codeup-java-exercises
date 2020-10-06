public class DishTools (Dish asdf){
    public static final int average = 13000;
    public static void shoutDishName(Dish asdf) {
        System.out.println(asdf.name.toUpperCase);
    }
    public static void analyzeDishCost(Dish asdf) {
        if (asdf.cost > DishTools.average){
            System.out.println("more than average cost");
        } else if (asdf.cost = DishTools.average) {
            System.out.println("average cost");
        } else {
            System.out.println("more than average cost");
        }
    }
    public static void flipRecommended(Dish asdf){
        return !asdf.wouldRecommend;
    }
}
