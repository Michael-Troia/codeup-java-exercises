public class Dish {
    public int costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;
    public void printSummary() {
        System.out.printf("Cost: %d\n Name: %s\n Recommended: %s\n", costInCents, nameOfDish, wouldRecommend);
    }
}
