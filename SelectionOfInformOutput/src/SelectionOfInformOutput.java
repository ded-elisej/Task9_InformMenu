import java.util.Scanner;

public class SelectionOfInformOutput {
    //in this task i'll realize program with operator switch where user choosing menu item number
    public static void main(String[] args) {
        System.out.println("Menu:");
        System.out.printf("1. Input name. \n2. Input surname. \n3. Input year of birth. \n4. Display information. \n0. Exit. \n");
        System.out.print("Enter menu number: ");
        int menuNumber = new Scanner(System.in).nextInt();
        String name = new String();
        String surname = new String();
        int yearOfBirth = 0;
        while (menuNumber != 0) {

            switch (menuNumber) {
                case 1:
                    System.out.print("Please, enter name: ");
                    name = new Scanner(System.in).nextLine();
                    break;
                case 2:
                    System.out.print("Please, enter surname: ");
                    surname = new Scanner(System.in).nextLine();
                    break;
                case 3:
                    System.out.print("Please, enter year of birth: ");
                    yearOfBirth = new Scanner(System.in).nextInt();
                    break;
                case 4:
                    System.out.printf("Name: %s, surname: %s, year of birth: %d.\n", name, surname, yearOfBirth);
                    break;
            }
            System.out.print("Enter menu number: ");
            menuNumber = new Scanner(System.in).nextInt();
        }
        System.out.println("Exit");
    }
}
