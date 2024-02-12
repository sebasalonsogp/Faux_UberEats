package edu.umiami.caneeats.database;

import edu.umiami.caneeats.entityobjects.Restaurant;
import edu.umiami.caneeats.utilities.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Set;

public class RestaurantDataManager {

    public int addNewRestaurant(Restaurant restaurant)
    {
        return 0;
    }

    public Set<Restaurant> getRestaurantsList(String searchString)
    {
        String sql = "SELECT * FROM RESTAURANT WHERE REST_NAME LIKE ?";

        Set<Restaurant> restSet = new HashSet<Restaurant>();
        
        try {
            Connection conn = DBConnection.getInstance().getDbConnect();
            PreparedStatement getRestaurants = conn.prepareStatement(sql);
            getRestaurants.setString(1,"%"+searchString+"%");

            ResultSet resultSet = getRestaurants.executeQuery();

            while(resultSet.next())
            {
                Restaurant r = new Restaurant();

                Integer restID = resultSet.getInt("REST_ID");
                String restName = resultSet.getString("REST_NAME");
                System.out.println(" --> "+restID+"  "+restName);

                r.setRestaurantID(restID);
                r.setRestaurantName(restName);
                r.setRestaurantLocation(resultSet.getString("REST_ADDR"));

                restSet.add(r);


            }
        }catch(Exception e)
        {
            System.out.println("Something really bad happened !!!");
            e.printStackTrace();
        }
        return  restSet;
    }



}
