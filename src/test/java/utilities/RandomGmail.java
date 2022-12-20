package utilities;

import java.util.Random;

public class RandomGmail {
    public static String getRandomGmail(int nameCount){
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        StringBuilder email = new StringBuilder();
        for (int i=0; i<nameCount; i++){
            char letter = abc.charAt(random.nextInt(26));
            email.append(letter);
        }
        return email.append("@gmail.com").toString();
    }
}
