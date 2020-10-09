import java.util.Random;

public class ServerNameGenerator {
    public static String[] adjectives = {
            "cool", "uncool", "swell", "jovial", "stinky", "not stinky", "disenfranchised", "swift", "slow", "plump"
    };
    public static String[] nouns = {
            "dog","not dog", "cat", "ferret", "wombat", "pony", "pig", "human", "napkin", "table"
    };

    public static void main(String[] args) {
        System.out.println("random name: " + wordRandomizer(adjectives) + " " + wordRandomizer(nouns));
    }

    public static String wordRandomizer(String[] array){
        Random rnd = new Random(); //lookup random
        int randomIndex = rnd.nextInt(array.length);
        return array[randomIndex];
    }
}
