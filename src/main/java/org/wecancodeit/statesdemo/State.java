package org.wecancodeit.statesdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class State {

	@Id
	@GeneratedValue
	private long id;
	private String abb;
	private String name;
	private String motto;
	private String citiesURL;
	
	@ManyToOne
	private Fish fish;
	

	protected State() {

	}

	public State(String abb, String name, String motto, Fish fish, String citiesURL) {
		this.abb = abb;
		this.name = name;
		this.motto = motto;
		this.fish = fish;
		this.citiesURL = citiesURL;

	}

	public String getName() {
		return name;
	}

	public String getMotto() {
		return motto;
	}

	public Fish getFish() {
		return fish;
	}

	public String getCitiesURL() {
		return citiesURL;
	}

	public String getAbb() {
		return abb;
	}
	
	public long getId() {
		return id;
	}

}
