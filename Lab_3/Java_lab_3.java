package Java_Lab.Lab_3;

import java.util.Scanner;

public class Java_lab_3 {

    // Static Scanner, name Array, Detail list Array objects
    static Scanner scan = new Scanner(System.in);
    static String[] nameArr = new String[1024];
    static String[][] delArray = new String[1024][];
    static int count = 0;

    // Function to collect Student information
    static void delCollect() {
        System.out.println("Enter the Student information");
        System.out.println("Enter your name: ");
        String name2 = scan.next();

       nameArr[count] = name2;
        scan.nextLine();
        System.out.println("Enter your Registration no.: ");
        String regNo = scan.nextLine();

        System.out.println("Enter your email id: ");
        String email = scan.nextLine();

        System.out.println("Enter your class: ");
        String className = scan.nextLine();

        System.out.println("Enter your Department: ");
        String depName = scan.nextLine();
        // Adding the details to an student array 
        String[] delLis = {name2, regNo, email, className, depName};
        // Adding the Student Array to the main detail array
        delArray[count] = delLis;
        count +=1;
    }

    // function to display the user given name
    static void display() {
        scan.nextLine();
        System.out.print("Enter the name to display: ");
        String disName = scan.nextLine();
        System.out.println("-----------------------------------------------------");
        int bol = search(disName);
        String[] delDisplay = new String[5];
        // displays the information if the given name is found
        if (bol == -1){
        System.out.println("Name not found");
        }

        else {        
            delDisplay = delArray[bol];
            System.out.println("Name: " + delDisplay[0]);
            System.out.println("Registration No: " + delDisplay[1]);
            System.out.println("Email id: " + delDisplay[2]);
            System.out.println("Class: " + delDisplay[3]);
            System.out.println("Department: " + delDisplay[0]);

        }
    }

    // function to search the user given name
    static int search(String name) {
        for (int i = 0; i < count; i++) {
            if (nameArr[i].equals(name)) {
                return i;
                
            }
        }
        return -1;
    }


    // The main method
    public static void main(String[] args) {
        System.out.println("Press 1 to Enter Student detail");
        System.out.println("Press 2 to Search for a name");
        System.out.println("Press 3 to display a name");
        System.out.println("Press 4 to exit");
        int option;
        do {
            System.out.println("-----------------------------------------------------");
            System.out.print("Enter option: ");
            option = scan.nextInt();
            System.out.println("-----------------------------------------------------");
            switch (option) {
                case 1:
                delCollect();
                break;

                case 2:
                System.out.println("Enter the name to be searched: ");
                String sername = scan.next();
                System.out.println("-----------------------------------------------------");
                int pos = search(sername);
                if (pos == -1) {
                    System.out.println("The name was not found");
                }
                else {
                    System.out.println(sername + " is at " + pos + " position");
                }
                break;

                case 3:
                display();
                break;
                case 4:
                System.out.println("Exiting Program");
                break;
                default:
                System.out.println("Wrong Input");
                break;
            }
        } while (option != 4);

    }
    
}
