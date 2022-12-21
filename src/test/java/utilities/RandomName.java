package utilities;

import java.util.Random;

public class RandomName {
    public static String getRandomName(int nameCount) {
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        StringBuilder name = new StringBuilder();
        for (int i = 0; i < nameCount; i++) {
            char letter = abc.charAt(random.nextInt(26));
            name.append(letter);
        }
          return name.append("a").toString();
    }
}
