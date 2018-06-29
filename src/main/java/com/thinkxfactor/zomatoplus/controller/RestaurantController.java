package com.thinkxfactor.zomatoplus.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.repository.RestaurantRepository;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	@PostMapping("/add")
	public Restaurant addRestaurant(@RequestBody Restaurant rest) {
		Restaurant persistedRestaurant=restaurantRepository.save(rest);
		return persistedRestaurant;
	}

	@GetMapping("/getAll")
	public List<Restaurant> getAll(){
		List<Restaurant> listofrestaurant=restaurantRepository.findAll();
		return listofrestaurant;
	}
/*@GetMapping("/getall")
public List<Restaurant> getAll(){
	List<Restaurant> res = new ArrayList<>();
	Restaurant r1 = new Restaurant("Chowman","Chowman.com","Kolkata",4,12345677);
	Restaurant r2 = new Restaurant("Bon apptite","bonapt.com","Hazra",4,78594242);
	res.add(r2);
	res.add(r1);
	return res;
}

@PostMapping("/addItem")
public Item addItem(@RequestBody Item item) {
	Item i1=new Item("Fish",100);
	i1.addItem(item);
	return item;
}

@PostMapping("/create")
public Restaurant restCreate(@RequestBody Restaurant rest) {
	Restaurant r1 = new Restaurant("Hanglatherium","www.hangla.com","Rashbehari av.",3,2435678);
	return rest;
}

*/
}
