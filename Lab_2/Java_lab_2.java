import java.util.Scanner;

public class Java_lab_2 {
  static Scanner sc = new Scanner(System.in);
  static String[] names = new String[1024];
  static int count = 0;

  public static void main(String[] args) {
    do {
      printMenu();
      int option = sc.nextInt();
      switch (option) {
        case 1:
          addName();
          break;
        case 2:
          searchName();
          break;
        case 3:
          removeName();
          break;
        case 4:
          System.out.println("Exiting program...");
          count = 4;
      }
    } while (count != 4);
  }

  // function to take in user input choice
  static void printMenu() {
    System.out.println("Press 1 to Enter Name");
    System.out.println("To Search a Name Press 2");
    System.out.println("To Remove a name Press 3");
    System.out.println("To Exit press 4");
    System.out.print("Enter option: ");

  }

  // function to add user given name to the lsit
  static void addName() {
    System.out.print("Enter a name: ");
    String name = sc.next();
    if (isNameExists(name)) {
      System.out.println("Name already exists, please enter a unique name.");
    } else {
      names[count++] = name;
      System.out.println("Name added successfully!");
    }
  }

  // function to search the name if it exists in the litst
  static void searchName() {
    System.out.print("Enter the name: ");
    String name = sc.next();
    boolean isFound = false;
    for (int i = 0; i < count; i++) {
      if (names[i].equals(name)) {
        System.out.println("Name found at: " + (i + 1));
        isFound = true;
        break;
      }
    }
    if (!isFound) {
      System.out.println("Name not found.");
    }
  }

  // function to remove the name from the list
  static void removeName() {
    System.out.print("Enter a name to remove: ");
    String name = sc.next();
    boolean isFound = false;
    for (int i = 0; i < count; i++) {
      if (names[i].equals(name)) {
        for (int j = i; j < count - 1; j++) {
          names[j] = names[j + 1];
        }
        count--;
        System.out.println("Name removed successfully!");
        isFound = true;
        break;
      }
    }
    if (!isFound) {
      System.out.println("Name not found.");
    }
  }

  // function to check weather the name exists or not
  static boolean isNameExists(String name) {
    for (int i = 0; i < count; i++) {
      if (names[i].equals(name)) {
        return true;
      }
    }
    return false;
  }

}