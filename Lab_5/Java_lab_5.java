package Java_Lab.Lab_5;
import java.util.Scanner;

public class Java_lab_5 {

    static String decrypt(String sent) {
        String lett = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String finalSent = "";
        // System.out.println(lett.length());
        int len = sent.length();
        for (int i = 0; i < len; i++) {
            String letter =  String.valueOf(sent.charAt(i));
            if (letter.equals(" ")) {
                finalSent += " ";
            }
            else {
            int val = lett.indexOf(letter);
            if (val + 3 >= 26) {
                val = val - 26;
            }

            finalSent += String.valueOf(lett.charAt(val + 3));

        }
    }

        return finalSent;
    }

    static String encrypt(String sent) {
        String lett = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String finalSent = "";
        int len = sent.length();
        for (int i = 0; i < len; i++) {
            String letter =  String.valueOf(sent.charAt(i));
            if (letter.equals(" ")) {
                finalSent += " ";
            }
            else {
            int val = lett.indexOf(letter);
            if (val >= 3) {
                val = val - 26;
            }

            finalSent += String.valueOf(lett.charAt(val + 23));
        }

        }

        return finalSent;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the message: ");
        String words = scan.nextLine();
        words = words.toUpperCase();
        System.out.println("Press 1 to encrypt the message");
        System.out.println("Press 2 to decrypt the message");
        System.out.println("Your choice: ");
        int choice = scan.nextInt();
        switch(choice) {
            case 1:
            System.out.println(encrypt(words));
            break;
            case 2:
            System.out.println(decrypt(words));
            break;
            default:
            System.out.println("Wrong Input");
            break;
        }

        scan.close();


    }
    
}
