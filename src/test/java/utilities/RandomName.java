package utilities;

import java.util.Random;

public class RandomName {
    public static String getRandomName(int nameCount) {
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        StringBuilder firstName = new StringBuilder();
        for (int i = 0; i < nameCount; i++) {
            char letter = abc.charAt(random.nextInt(26));
            firstName.append(letter);
        }
          return firstName.append(firstName).toString();
    }
}
