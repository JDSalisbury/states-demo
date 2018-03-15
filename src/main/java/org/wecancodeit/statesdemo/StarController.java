package org.wecancodeit.statesdemo;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarController {
	
	@Resource
	private StateRepository starRepo; 
	
	@Resource
	private CityRepository cityRepo; 
	
	@Resource
	private FishRepository fishRepo;
	
	
	@RequestMapping("/stars/{id}")
	public Star findOneTerritory(@PathVariable(value = "id") long id) {
		return starRepo.findOne(id);
	}
	
	@RequestMapping("/states/{abbreviation}/cities")
	public Iterable<City> findAll(@PathVariable(value = "abb") String abb) {
		
		return cityRepo.findAll();
	}
	
	
	
		
}
