package org.wecancodeit.statesdemo;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StatePopulator implements CommandLineRunner {

	@Resource
	private StateRepository stateRepo; 
	
	@Resource
	private FishRepository fishRepo;
	
	@Resource
	private CityRepository cityRepo; 

	
	@Override
	public void run(String... args) throws Exception {
		Fish walleye = new Fish("walleye", "Sander vitreus", "image/url");
		fishRepo.save(walleye); 
		Fish triggerFish = new Fish("Humuhumunukunkuapua", "Rhinecanthus rectangulus", "image/url");
		fishRepo.save(triggerFish); 
		Fish channelCatFish = new Fish("Channel catFish", "Ictalurus punctatus", "image/url");
		fishRepo.save(channelCatFish); //Nebraska 
		Fish guadalupe = new Fish("Guadalupe Bass", "Micropterus treculii", "image/url");
		fishRepo.save(guadalupe); //Texas
		
		City columbus = new City("Columbus",860090);
		cityRepo.save(columbus); 
		City cleveland =new City("Cleveland",385809);
		cityRepo.save(cleveland); 
		City honalulu = new City("Honolulu", 374658); 
		cityRepo.save(honalulu);
		City lincoln = new City("Lincoln", 280364); 
		cityRepo.save(lincoln);
		City austin = new City("Austin", 947890);
		cityRepo.save(austin);
		
		State ohio = new State("OH", "Ohio", "Birthplace of aviation", walleye, "citiesUrl");
		stateRepo.save(ohio);
		State hawaii = new State("HI", "Hawaii", "This islands of Aloha", triggerFish, "citiesUrl");
		stateRepo.save(hawaii); 
		State nebraska = new State("NE", "Nebraska", "Equality before the Law", channelCatFish , "citiesUrl");
		stateRepo.save(nebraska); 
		State texas = new State("TX", "Texas", "Friendship", guadalupe , "citiesUrl");
		stateRepo.save(texas); 
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
