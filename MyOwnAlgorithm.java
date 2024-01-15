// Programmed by: FAGELA, Lucci Ania Luisse J.
// Laboratory Act 1: Algorithm 
// Date of Submission: January 13, 2024 

import java.util.Scanner; //imports the scanner 

public class MyOwnAlgorithm {
    public static void main(String[]args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Lucci's After School Routine");
        System.out.println();
        System.out.println("STEP 1 - Time: 5:00 - Dismissal Time!");
        System.out.println("Are you going home immediately? Yes or No? "); // Step 1: Going home

        String Q1 = myObj.nextLine();
        // Condition 1 
        if (Q1.equalsIgnoreCase("Yes")) {
            System.out.println("STEP 2 - Time: 5:00 - 6:30 - Going Home!");
            System.out.println("STEP 3 - Time: 6:30 - Arrived home!");
            System.out.println();
            System.out.println("STEP 4 - Time: 6:45 - Change outdoor clothes to indoor clothes"); 
            System.out.println();
            System.out.println("STEP 5 - Time: 6:55 - Study Session 1 for 45 minutes."); 
            System.out.println("STEP 6 - Time: 7:40 - Study Session 1 End. Time to refresh!");
            System.out.println();
            System.out.println("STEP 7 - Time: 7:45 - 8:20 - Dinner Time!"); 
            System.out.println();
            System.out.println("STEP 8 - Time: 8:25 - Time to do nightly routine!"); 
            System.out.println();
            System.out.println("STEP 9 - Time: 8:45 - Study Session 2 for 20 minutes!");
            System.out.println("STEP 10 - Time: 9:05 - Study Session 2 end. Time to conclude the day's study session!");
            System.out.println();
            System.out.println("STEP 11 - Do you wish to continue studying or play Valorant? 1. Study , 2. Valorant");

            String Q2 = myObj.nextLine();
            //Condition 2
            if (Q2.equalsIgnoreCase("1")){
                System.out.println("Its time to give yourself a break! Go and sleep!");
                System.out.println();
                System.out.println("STEP 12: Time: 10:30 - Time to sleep!");
                System.out.println("Zzzz Zzzz Zzzz Zzzz");

            } else if (Q2.equalsIgnoreCase("2")){
                System.out.println("NO! Go to sleep!!");
                System.out.println("STEP 12: Time: 10:30 - Time to sleep!");
                System.out.println("Zzzz Zzzz Zzzz Zzzz");
            }

        
        } else if (Q1.equalsIgnoreCase("No")) {
            System.out.println("!!! Please go home and study !!!");
        } else {
            System.out.println("Answer Invalid.");
        }
    }
}
