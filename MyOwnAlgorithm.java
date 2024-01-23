
// Programmed by: FAGELA, Lucci Ania Luisse J.
// Laboratory Act 1: Algorithm 
// Date of Submission: January 13, 2024 

import java.util.Scanner; //imports the scanner 

public class MyOwnAlgorithm {
    public static int ctr = 0; 
    
    public static void main(String[]args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Lucci's After School Routine"); ctr++;
        System.out.println();ctr++;
        System.out.println("STEP 1 - Time: 5:00");ctr++;
        System.out.println("Dismissal Time!");ctr++;
        System.out.println();ctr++;
        System.out.println("Are you going home immediately?");ctr++;
        System.out.println("Yes or No? ");ctr++;// Step 1:Going home

        String Q1 = myObj.nextLine();ctr++;
        
        // Condition 1 
        if (Q1.equalsIgnoreCase("Yes")) {
            System.out.println("STEP 2 - Time: 5:00 - 6:30"); ctr++;
            System.out.println("Going Home!"); ctr++;
            System.out.println();ctr++;
            System.out.println("STEP 3 - Time: 6:30");ctr++;
            System.out.println("Arrived home!");ctr++;
            System.out.println();ctr++;
            System.out.println("STEP 4 - Time: 6:45");ctr++;
            System.out.println("Change outdoor clothes to indoor clothes");ctr++;
            System.out.println();ctr++;
            
            ctr++;
            for (int i = 1; i <=1; i++) {
                System.out.println("STEP 5 - Time: 6:55");ctr++;
                System.out.println("Study Session 1 for 45 minutes.");ctr++;
                System.out.println();ctr++;
                System.out.println("STEP 6 - Time: 7:40");ctr++;
                System.out.println("Study Session 1 End.");ctr++;
                System.out.println("Time to refresh!");ctr++;// // can be for loop
                System.out.println();ctr++;
            }

            System.out.println("STEP 7 - Time: 7:45 - 8:20");ctr++;
            System.out.println("Dinner Time!");ctr++;
            System.out.println();ctr++;
            System.out.println("STEP 8 - Time: 8:25");ctr++;
            System.out.println("Time to do nightly routine!");ctr++;
            System.out.println();ctr++;
            
            ctr++;
            for (int i = 1; i <=1; i++) {
                System.out.println("STEP 9 - Time: 8:45");ctr++;
                System.out.println("Study Session 2 for 20 minutes!");ctr++;
                System.out.println();ctr++;
                System.out.println("STEP 10 - Time: 9:05 ");ctr++;
                System.out.println("Study Session 2 end.");ctr++;
                System.out.println("Time to conclude the day's study session!");ctr++;
                System.out.println();ctr++;
            }
            
            System.out.println("STEP 11");ctr++;
            System.out.println("Do you wish to continue studying or play Valorant? 1. Study , 2. Valorant");ctr++;
            System.out.println("1. Study");ctr++;
            System.out.println("2. Valorant");ctr++;
            System.out.println();ctr++;

            String Q2 = myObj.nextLine();
            //Condition 2
            if (Q2.equalsIgnoreCase("1")){
                System.out.println("Its time to give yourself a break!");ctr++;
                System.out.println("Go and sleep!");ctr++;
                System.out.println();ctr++;
                System.out.println("STEP 12: Time: 10:30");ctr++;
                System.out.println("Time to sleep!");ctr++;
                System.out.println("Zzzz Zzzz Zzzz Zzzz");ctr++;
                System.out.println();ctr++;

            } else if (Q2.equalsIgnoreCase("2")){
                System.out.println("NO! Go to sleep!!");ctr++;
                System.out.println("Go to sleep!!");ctr++;
                System.out.println();ctr++;
                System.out.println("STEP 12: Time: 10:30");ctr++;
                System.out.println("Time to sleep!");ctr++;
                System.out.println("Zzzz Zzzz Zzzz Zzzz");ctr++;
                System.out.println();ctr++;
            }

        
        } else if (Q1.equalsIgnoreCase("No")) {
            System.out.println("!!! Please go home and study !!!");ctr++;
        } else {
            System.out.println("Answer Invalid.");ctr++;
        }
        System.out.print(ctr);
        myObj.close();
    
    }
}
