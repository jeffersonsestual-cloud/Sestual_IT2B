import java.util.Scanner;
public static void main (String[] args ){
       Scanner sc = new Scanner(System.in);
       System.out.print("---PORTFOLIO OF ACTIVITY----");
       System.out.println("Name : JEFFERSON L");
       System.out.println("SECTION/YEAR: IT2B");
       System.out.println("------CONTENTS-----------");
       System.out.println("1. Activity 1");
       System.out.println("2. Activity 2");
       System.out.println("---------------------------");
       System.out.print("Enter Selection: ");
       int select = sc.nextInt();

       if(select == 1){
              Activity1 act1 = new Activity1();
              act1.userGreatings();
       }else {
              System.out.println("Selection not Found!");
       }

}











