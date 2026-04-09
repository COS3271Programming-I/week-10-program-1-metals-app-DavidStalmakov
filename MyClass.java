package projectdavid;
import java.util.Scanner;

///// Metals App
public class MyClass {

	static Scanner input = new Scanner(System.in);

    // Only need this one (C → F)
    static double toFahrenheit(double c) {
        return (9.0 / 5) * c + 32;
    }

    public static void main(String[] args) {

        String choice = "y";

        System.out.println("Name\tDensity\tMelt(F)\tBoil(F)\tHardness");

        while (choice.equals("y")) {

            // Variables
            String name;
            double density, meltC, boilC, hardness;

            // Input
            System.out.print("\nEnter name: ");
            name = input.next();

            System.out.print("Density: ");
            density = input.nextDouble();

            System.out.print("Melting point (C): ");
            meltC = input.nextDouble();

            System.out.print("Boiling point (C): ");
            boilC = input.nextDouble();

            System.out.print("Hardness (0–10): ");
            hardness = input.nextDouble();

            // Convert
            double meltF = toFahrenheit(meltC);
            double boilF = toFahrenheit(boilC);

            // Output
            System.out.println(name + "\t" + density + "\t" + meltF + "\t" + boilF + "\t" + hardness);

            // Repeat?
            System.out.print("Another? (y/n): ");
            choice = input.next();
        }
    }
}