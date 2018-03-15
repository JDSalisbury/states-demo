package org.wecancodeit.statesdemo;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	
		
}
