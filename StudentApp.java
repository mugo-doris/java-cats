//Name: Doris Nduta Mugo
//Reg Number: CT101/G/21006/23
//CAT 1: Question two

import java.util.Scanner;



public class StudentApp {



    // StudentRecord class definition

    public static class StudentRecord {

        // Fields

        private String studentID;

        private String name;

        private String course;



        // Constructor to initialize fields

        public StudentRecord(String studentID, String name, String course) {

            this.studentID = studentID;

            this.name = name;

            this.course = course;

        }



        // Method to display student information

        public void displayInfo() {

            System.out.println("Student ID: " + studentID);

            System.out.println("Name: " + name);

            System.out.println("Course: " + course);

        }

    }



    public static void main(String[] args) {

        // Create Scanner object to read user input

        Scanner scanner = new Scanner(System.in);



        // Prompt the user for input

        System.out.print("Enter Student ID: ");

        String studentID = scanner.nextLine();



        System.out.print("Enter Name: ");

        String name = scanner.nextLine();



        System.out.print("Enter Course: ");

        String course = scanner.nextLine();



        // Create StudentRecord object with user input

        StudentRecord student = new StudentRecord(studentID, name, course);



        // Call the displayInfo method to display student details

        student.displayInfo();



        // Close the scanner

        scanner.close();

    }

}