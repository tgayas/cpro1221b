package org.example;
import java.util.Scanner;

public class Tedjoshuaangelo_gayas_StudentRegistration {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Student Registration Form");
            System.out.print("Enter first name: ");
            String nameFirst = scanner.next();
            System.out.print("Enter last name: ");
            String nameLast = scanner.next();

            System.out.print("Enter year of birth: ");
            int yearBirth = scanner.nextInt();

            scanner.close();

            String nameFull = nameFirst + " " + nameLast;
            String passwordTemporary = nameFirst + "*" + yearBirth;

            System.out.println("Welcome, " + nameFull + "!");
            System.out.println("Your registration is Complete!");
            System.out.println("Your temporary password is: " + passwordTemporary);
        }
    }
