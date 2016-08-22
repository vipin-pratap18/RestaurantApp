package com.restaurant.service;

import java.util.List;

import com.restaurant.model.Restaurant;
import com.restaurant.model.RestaurantItems;

public interface RestaurantService {

	public List<Restaurant> getAllRestaurants();

	public List<RestaurantItems> getAllRestaurantsItems(String restId);

}
