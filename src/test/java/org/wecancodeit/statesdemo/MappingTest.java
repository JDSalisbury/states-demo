package org.wecancodeit.statesdemo;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest

public class MappingTest {

	@Resource
	private TestEntityManager entityManager;

	@Resource
	private FishRepository fishRepo;

	@Resource
	private StateRepository stateRepo;
	
	@Resource
	private CityRepository cityRepo; 
	

	@Test
	public void shouldSaveAndLoadFish() {
		Fish underFish = new Fish("walleye", "Sander vitreus", "image/url");
		fishRepo.save(underFish); 
		long fishId = underFish.getId(); 
		
		
		String check = underFish.getFishName(); 
		
		assertThat(check, is("walleye")); 	
		
	}
	
	@Test
	public void shouldSaveAndLoadFishToState() {
		Fish underFish = new Fish("walleye", "Sander vitreus", "image/url");
		underFish = fishRepo.save(underFish);
		
		Star underState = new Star("OH", "Ohio", "Birthplace of aviation", underFish, "cities");
		underState = stateRepo.save(underState);
		Long stateId = underState.getId();
		
		entityManager.flush();
		entityManager.clear();
		
		underState = stateRepo.findOne(stateId);
		
		assertThat(underState.getFish(), is(underFish));
	}
	
	@Test
	public void shouldSaveAndLoadState() {
		Fish underFish = new Fish("walleye", "Sander vitreus", "image/url");
		underFish = fishRepo.save(underFish);
		
		Star underState = new Star("OH", "Ohio", "Birthplace of aviation", underFish, "cities");
		underState = stateRepo.save(underState); 
		long stateId = underState.getId(); 
		
		assertThat(underState.getAbb(), is("OH"));
	}
	
	@Test
	public void shouldSaveAndLoadCitiesToState() {
		Fish underFish = new Fish("walleye", "Sander vitreus", "image/url");
		underFish = fishRepo.save(underFish);
		City columbus = new City("Columbus",1000);
		cityRepo.save(columbus);
		City cleveland =new City("Cleveland",800);
		cityRepo.save(cleveland);
		Star underState = new Star("OH", "Ohio", "Birthplace of aviation", underFish, "cities", columbus, cleveland);
		underState = stateRepo.save(underState); 
		long stateId = underState.getId(); 
		
		assertThat(underState.getCities(), containsInAnyOrder(columbus, cleveland));
		
	}
	
	
}
