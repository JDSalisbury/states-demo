package org.wecancodeit.statesdemo;

import java.util.Collection;
import java.util.HashSet;
import static java.util.Arrays.asList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Star {

	@Id
	@GeneratedValue
	private long id;
	private String abb;
	private String name;
	private String motto;
	private String citiesURL;

	@ManyToOne
	private Fish fish;
	
	@OneToMany(mappedBy = "territory")
	private Collection<City> cities;

	protected Star() {

	}

	public Star(String abb, String name, String motto, Fish fish, String citiesURL) {
		this.abb = abb;
		this.name = name;
		this.motto = motto;
		this.fish = fish;
		this.citiesURL = citiesURL;

	}

	public Star(String abb, String name, String motto, Fish fish, String citiesURL, City... cities) {
		this.abb = abb;
		this.name = name;
		this.motto = motto;
		this.fish = fish;
		this.citiesURL = citiesURL;
		this.cities = new HashSet<>(asList(cities));
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

	public Collection<City> getCities() {
		return cities;
	}

}
