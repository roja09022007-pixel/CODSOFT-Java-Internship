import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int subjects;
        int total = 0;

        System.out.print("Enter number of subjects: ");
        subjects = sc.nextInt();

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks of subject " + i + ": ");
            int marks = sc.nextInt();
            total = total + marks;
        }

        double average = total / subjects;

        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);

        if (average >= 90) {
            System.out.println("Grade: A");
        }
        else if (average >= 75) {
            System.out.println("Grade: B");
        }
        else if (average >= 60) {
            System.out.println("Grade: C");
        }
        else if (average >= 40) {
            System.out.println("Grade: D");
        }
        else {
            System.out.println("Grade: Fail");
        }

        sc.close();
    }
}