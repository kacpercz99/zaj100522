import java.util.Arrays;

public class ArrayOfPublicationsMethods {
    public static void showPublications(Publication[] tabP) {
        Arrays.stream(tabP).forEach(System.out::println);
    }

    public static double calculateTotalIncome(Publication[] tabP) {
        double suma = 0;
        for(Publication publication: tabP) {
            suma += publication.getPrice() * publication.getQuantity();
        }
        return suma;
    }
}
