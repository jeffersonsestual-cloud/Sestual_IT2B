import java.util.Scanner;

public class Activity1 {
Scanner sc = new Scanner(System.in);

    public void userGreatings(){
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter Brith Year: ");
        int byear = sc.nextInt();
        System.out.print("Enter Gender: ");
        String gender = sc.next();

        System.out.println("-----------------------------");
        System.out.println("Hellow "+name+" ! Welcome to Java");
        System.out.println("You were born in "+byear+" and your gender is "+gender);
        System.out.println("-------------------------------------");

    }

}
