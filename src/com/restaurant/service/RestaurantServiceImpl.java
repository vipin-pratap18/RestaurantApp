package com.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.dao.RestaurantDAO;
import com.restaurant.model.Restaurant;
import com.restaurant.model.RestaurantItems;

@Service
public class RestaurantServiceImpl implements  RestaurantService{

	@Autowired
	private RestaurantDAO restaurantDAO;

	@Override
	public List<Restaurant> getAllRestaurants() {
		return restaurantDAO.getAllRestaurants();
	}

	@Override
	public List<RestaurantItems> getAllRestaurantsItems(String restId) {
		return restaurantDAO.getAllRestaurantsItems(restId);
	}
}
