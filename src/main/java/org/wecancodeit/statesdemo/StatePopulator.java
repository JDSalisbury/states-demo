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
		
		
		Star ohio = new Star("OH", "Ohio", "Birthplace of aviation", walleye, "/stars/OH/cities");
		stateRepo.save(ohio);
		Star hawaii = new Star("HI", "Hawaii", "This islands of Aloha", triggerFish, "/stars/HI/cities");
		stateRepo.save(hawaii); 
		Star nebraska = new Star("NE", "Nebraska", "Equality before the Law", channelCatFish , "/stars/NE/cities");
		stateRepo.save(nebraska); 
		Star texas = new Star("TX", "Texas", "Friendship", guadalupe , "/stars/TX/cities");
		stateRepo.save(texas); 
		
		City columbus = new City("Columbus",860090,ohio);
		cityRepo.save(columbus); 
		City cleveland =new City("Cleveland",385809,ohio);
		cityRepo.save(cleveland); 
		City honalulu = new City("Honolulu", 374658,hawaii); 
		cityRepo.save(honalulu);
		City lincoln = new City("Lincoln", 280364,nebraska); 
		cityRepo.save(lincoln);
		City austin = new City("Austin", 947890,texas);
		cityRepo.save(austin);
		

	}
	
	
	
	
	
}
