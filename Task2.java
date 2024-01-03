package CodsoftTask2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        int TotalSubjects;
        int student = 0;
        int count = 0;
        int TotalMarks = 0;
        int AverageMarks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Student Grade Calculator!!");

        String Name;
        System.out.println("Enter the total number of subjects: ");
        TotalSubjects = sc.nextInt();


        for (int a = 1; a <= TotalSubjects; a++) {
            System.out.println("Enter the marks for subject " + a + ": ");
            TotalMarks += sc.nextInt();
        }


        AverageMarks = TotalMarks / TotalSubjects;
        System.out.println("The Total Marks of Subjects is:" +TotalMarks);

        if (AverageMarks >= 80) {
            System.out.println("The Average Marks Of Student is: " + AverageMarks + ", " + "Grade = A");
        } else if (AverageMarks >= 60) {
            System.out.println("The Average Marks Of The Student is: " + AverageMarks + "," + "Grade = B");
        } else if (AverageMarks >= 30) {
            System.out.println("The Average Marks Of Student is: " + AverageMarks + "," + "Grade = C");
        } else {
            System.out.println("The Average Marks Of Student is: " + AverageMarks + "," + "Grade = D");
        }
    }
}
