package edu.umiami.caneeats.boundary;

import edu.umiami.caneeats.entityobjects.Restaurant;

import java.util.Scanner;

public class CaneEatsMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Cane Eats Application");
        System.out.println();
        System.out.println();
        System.out.println("What do you want to do ?");
        System.out.println("1. Search Restaurants");
        System.out.println("2. Search by Food Item");
        System.out.println("3. Exit");
        Scanner mainInput = new Scanner(System.in);
        int choice = mainInput.nextInt();

        switch(choice)
        {
            case 1:new RestaurantScreen().searchRestaurant(); break;
            case 3: new RestaurantScreen().modifyRestaurant();break;
            case 2:new RestaurantScreen().searchFoodItem(); break;
            default:
                System.out.println("Thank you!!!");

        }

    }
}
