package com.restaurant.dao;

import java.util.List;

import com.restaurant.model.Restaurant;
import com.restaurant.model.RestaurantItems;

public interface RestaurantDAO {

	public List<Restaurant> getAllRestaurants();

	public List<RestaurantItems> getAllRestaurantsItems(String restId);

}
