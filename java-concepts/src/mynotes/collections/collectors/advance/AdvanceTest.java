package mynotes.collections.collectors.advance;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AdvanceTest {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            final String input = scanner.nextLine();

            try {
                final List<Person> persons = Arrays.stream(input.split("\\s"))
                    .filter(s -> !s.isEmpty())
                    .collect(ListOfPersonsCollector.toPersonList());

                System.out.println("----List----");
                persons.forEach(
                    person -> System.out.println(person)
                );
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }

        scanner.close();
    }

}
