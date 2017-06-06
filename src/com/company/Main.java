package com.company;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void choice ()
    {
        System.out.println("                Menu                    ");
        System.out.println("1. Initialize SetWagons by default");
        System.out.println("2. Add new wagon");
        System.out.println("3. Remove wagon");
        System.out.println("4. Check if collection contains wagon");
        System.out.println("5. Print SetWagons");
        System.out.println("6. Exit");
        System.out.println("******************************************");
    }
    public static Wagon enterWagon(Scanner sc){
        System.out.print("Enter 1 if the wagon is Sitting or other num if it is Sleeping: ");
        int key = sc.nextInt();
        Wagon newWagon;
        if (key == 1) {
            newWagon = new WagonSit();
                System.out.print("Enter number of wagon: ");
                newWagon.numberWag = sc.nextInt();

                System.out.println("Enter the number of comfortable ");
                System.out.println("4-'Sidachiy 1 klass', 5-'Sidachiy 2 klass' ");
                System.out.print("6-'Sidachiy 3 klass', 7-'Obschiy'): ");
                newWagon.comfort = sc.nextInt();

                System.out.print("Enter th enumber of people: ");
                newWagon.people = sc.nextInt();
                System.out.print("Enter th enumber of luggage: ");
                newWagon.luggage = sc.nextInt();
        } else {
            newWagon = new WagonSleep();
                System.out.print("Enter number of wagon: ");
                newWagon.numberWag = sc.nextInt();

                System.out.println("Enter the number of comfortable ");
                System.out.println("1-'SW', 2-'Kupe', 3-'Platskart' ");
                newWagon.comfort = sc.nextInt();

                System.out.print("Enter th enumber of people: ");
                newWagon.people = sc.nextInt();
                System.out.print("Enter th enumber of luggage: ");
                newWagon.luggage = sc.nextInt();
        }

        return newWagon;
    }
    public static void main(String[] args){
        SetWag set = new SetWag();

        Scanner sc = new Scanner(System.in);

        choice();


        System.out.print("Enter choice: ");
        int c = sc.nextInt();
        sc.nextLine();

        while (c != 6) {

            switch (c) {
                case 1: {
                    set.initSetByDefaultValues();
                    break;
                }
                case 2:
                {
                    Wagon newWagon = enterWagon(sc);
                    set.add(newWagon);
                }
                break;
                case 3: {
                    Wagon removeWagon = enterWagon(sc);
                    boolean removeRes = set.remove(removeWagon);
                    if (removeRes) {
                        System.out.println("Element was successfully removed");
                    } else {
                        System.out.println("Element was not removed");
                    }
                    break;
                }
                case 4: {
                    Wagon foundWagon = enterWagon(sc);
                    boolean foundRes = set.contains(foundWagon);
                    if (foundRes) {
                        System.out.println("Collection contains element");
                    } else {
                        System.out.println("Collection doesn't contain element");
                    }
                    break;
                }
                case 5: {
                    set.print();
                    break;
                }
                default: {
                    break;
                }
            }

            choice();

            System.out.print("Enter choice: ");
            c = sc.nextInt();
            sc.nextLine();
        }
    }


}
