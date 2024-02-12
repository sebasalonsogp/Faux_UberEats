package edu.umiami.caneeats.business;

import edu.umiami.caneeats.database.RestaurantDataManager;
import edu.umiami.caneeats.entityobjects.Restaurant;

import java.sql.ResultSet;
import java.util.Set;

public class RestaurantBC {

    private RestaurantDataManager rdm ;

    public RestaurantBC()
    {
        this.rdm = new RestaurantDataManager();
    }


    public Set<Restaurant> searchRestaurants(String restName) {
        return rdm.getRestaurantsList(restName);
    }
}
