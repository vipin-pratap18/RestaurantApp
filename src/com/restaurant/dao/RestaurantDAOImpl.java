package com.restaurant.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.restaurant.model.Restaurant;
import com.restaurant.model.RestaurantItems;

@Repository
public class RestaurantDAOImpl implements  RestaurantDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Restaurant> getAllRestaurants() {
		
		String query = "SELECT * FROM restaurant where showInList = ?";
		List<Map<String, Object>> listOfRestObj = jdbcTemplate.queryForList(query, 1);
		List<Restaurant> listOfRest = new ArrayList<>();
		Restaurant restaurant;
		for(Map<String, Object> map : listOfRestObj){
			restaurant = new Restaurant();
			restaurant.setRestId(map.get("restId").toString());
			restaurant.setRestName(map.get("name").toString());
			listOfRest.add(restaurant);
		}
		return listOfRest;
	}

	@Override
	public List<RestaurantItems> getAllRestaurantsItems(String restId) { 
		String query = "SELECT ri.restItemId, ri.restID, ri.itemID, ri.restItemPopularity, ri.showInCatalogue, i.itemName, (SELECT name FROM restaurant WHERE ri.restID = restId) AS restName FROM restaurant_item ri, item i where ri.restID = ? AND ri.showInCatalogue = ? AND ri.itemID = i.itemId";
		List<Map<String, Object>> listOfRestObj = jdbcTemplate.queryForList(query, restId, 1);
		List<RestaurantItems> listOfRestItems = new ArrayList<>();
		RestaurantItems restaurant;
		for(Map<String, Object> map : listOfRestObj){
			restaurant = new RestaurantItems();
			restaurant.setItemID(map.get("itemID").toString());
			restaurant.setItemName(map.get("itemName").toString());
			restaurant.setRestName(map.get("restName").toString());
			listOfRestItems.add(restaurant);
		}
		return listOfRestItems;
	}
}
