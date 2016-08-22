package com.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.restaurant.model.Restaurant;
import com.restaurant.model.RestaurantItems;
import com.restaurant.service.RestaurantService;

@Controller
public class RestaurantController {
	
	@Autowired
	private RestaurantService restaurantService;

	@RequestMapping("/fetch")
	public ModelAndView getAllTheRestaurants(){
		
		List<Restaurant> restaurantList = restaurantService.getAllRestaurants();
		ModelAndView model = new ModelAndView();
		model.addObject("restList", restaurantList);
		return model;
	}
	
	
	@RequestMapping("/items")
	public ModelAndView getAllTheRestaurantsItem(@RequestParam String restId){
		
		List<RestaurantItems> itemList = restaurantService.getAllRestaurantsItems(restId);
		ModelAndView model = new ModelAndView();
		model.addObject("itemList", itemList);
		return model;
	}
	
	
}
