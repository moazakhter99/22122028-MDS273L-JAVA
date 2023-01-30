package Java_Lab.Lab_1;
import java.util.*;

public class Java_Lab_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Age: ");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("gender: ");
        String gender = scan.nextLine();
        System.out.print("State: ");
        String state = scan.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Age : " + age); 
        System.out.println("Gender: " + gender); 
        System.out.println("State: " + state);
        gender = gender.toLowerCase();
        
        if (gender.equals("m")) {
            System.out.println("Gender: MALE");
        } else if (gender.equals("f")) {
            System.out.println("Gender: FEMALE");
        }

        switch (state) {
            case "Tamil Nadu":
            case "Kerala":
            case "Andhra Pradesh":
            case "Karnataka":
                System.out.println("The Student is from the southern state of India");
                System.out.println("The details of the student is: " + "\n" + age + "\n"+ name + "\n" + gender);
                break;
            case "Rajasthan":
            case "Haryana":
            case "Jammu & Kashmir":
                System.out.println("The student is from Northern state of India");
                System.out.println("The details of the student is: " + "\n" + age + "\n"+ name + "\n" + gender);
                break;
            case "Gujarat":
            case "Goa":
            case "Maharashtra":
                 System.out.println("The student is from Western state of India");
                 System.out.println("The details of the student is: " + "\n" + age + "\n"+ name + "\n" + gender);
                 break;
            case "Assam":
            case "Bihar":
            case "Nagaland":
            case "West Bengal":
                 System.out.println("The student is from Eastern state of India");    
                 System.out.println("The details of the student is: " + "\n" + age + "\n"+ name + "\n" + gender);    
        }
 
    
}
}
