package edu.umiami.caneeats.boundary;

import edu.umiami.caneeats.controllers.RestaurantController;
import edu.umiami.caneeats.database.RestaurantDataManager;
import edu.umiami.caneeats.entityobjects.Restaurant;

import java.sql.SQLOutput;
import java.util.Set;
import java.util.Scanner;

public class RestaurantScreen {

    public RestaurantController restaurantController;

    RestaurantScreen()
    {
        this.restaurantController = new RestaurantController();
    }

    public void searchRestaurant() {
        Scanner restNameScanner = new Scanner(System.in);
        System.out.println("Search Restaurant Screen");
        System.out.print("What is the name of the restaurant : ");
        String restName = restNameScanner.nextLine();


        Set<Restaurant> restaurantList = restaurantController.searchRestaurants(restName);

        System.out.println("The list of restaurants that match your query is :");

        if(restaurantList == null || restaurantList.isEmpty())
        {
            System.out.println("Sorry no matches found!!");
        }
        else
        for(Restaurant r:restaurantList)


    }

    public void searchFoodItem() {
    }
    public void modifyRestaurant(){
        //TODO
        //Display options
            //1. Edit Restaurant Info
            //2. Add / Edit Restaurant Meny --- For today's class you implement this
            //3. Delete Restaurant
            //4. View Restaurant Info with Meny
        Scanner scnr = new Scanner(System.in);
            int input = scnr.nextInt();
                switch(input){
                    case 1:
                        break;
                    case 2:
                        System.out.println("Would you like to add or search for restaurant to add? (A / S)");
                        String ans;
                        try {
                             ans = scnr.next();
                            if(!ans.equals("A") || !ans.equals("S")){
                                throw new Exception;
                            }
                        } catch (Exception e){
                            System.out.println("Answer 'A' or 'S'!");
                        }
                        if(ans.equals("S")){
                            searchRestaurant();
                            try{
                                String restaurant =  scnr.next();
                                //if()
                            }catch(Exception e){}


                        }
                        else{
                            System.out.println("Please give the following inputs: ");
                            String name = scnr.next();

                           // addNewRestaurant(new Restaurant(name));
                        }
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                }



    }


}
