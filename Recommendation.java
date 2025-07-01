import java.util.*;

public class RecommendationSystem {

    static class Item {
        String title;
        String genre;

        Item(String title, String genre) {
            this.title = title;
            this.genre = genre;
        }
    }

    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
            new Item("The Hobbit", "Fantasy"),
            new Item("Harry Potter", "Fantasy"),
            new Item("Sherlock Holmes", "Mystery"),
            new Item("Gone Girl", "Thriller"),
            new Item("The Da Vinci Code", "Mystery"),
            new Item("The Girl with the Dragon Tattoo", "Thriller")
        );

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your preferred genre (Fantasy, Mystery, Thriller): ");
        String preferredGenre = scanner.nextLine();

        List<Item> recommendations = getRecommendations(items, preferredGenre);

        System.out.println("\nRecommended Books for you:");
        for (Item item : recommendations) {
            System.out.println("- " + item.title);
        }
    }

    private static List<Item> getRecommendations(List<Item> items, String genre) {
        List<Item> result = new ArrayList<>();
        for (Item item : items) {
            if (item.genre.equalsIgnoreCase(genre)) {
                result.add(item);
            }
        }
        return result;
    }
}
