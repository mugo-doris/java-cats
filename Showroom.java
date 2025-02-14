//Name: Doris Nduta Mugo
//Reg Number: CT101/G/21006/23
//CAT 1: Question one


import java.util.Scanner;

// Base class Vehicle
class Vehicle {
    // Fields to store vehicle details
    String brand;
    String model;
    int year;

    // Constructor to initialize the fields
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Subclass Car inherits from Vehicle
class Car extends Vehicle {
    // Additional field to store fuel type
    String fuelType;

    // Constructor to initialize all fields, including those from Vehicle
    public Car(String brand, String model, int year, String fuelType) {
        // Call the superclass constructor to initialize brand, model, and year
        super(brand, model, year);
        this.fuelType = fuelType;
    }

    // Override displayDetails method to also print fuelType
    @Override
    public void displayDetails() {
        super.displayDetails();  // Call the superclass method to display common details
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Main class Showroom
public class Showroom {
    public static void main(String[] args) {
        // Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input vehicle details
        System.out.print("Enter the brand of the car: ");
        String brand = scanner.nextLine();

        System.out.print("Enter the model of the car: ");
        String model = scanner.nextLine();

        System.out.print("Enter the year of the car: ");
        int year = scanner.nextInt();
        scanner.nextLine();  // Consume the leftover newline

        System.out.print("Enter the fuel type of the car: ");
        String fuelType = scanner.nextLine();

        // Create a Car object with the user-provided details
        Car car = new Car(brand, model, year, fuelType);

        // Display the car details
        car.displayDetails();

        // Close the scanner
        scanner.close();
    }
}