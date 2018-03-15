package org.wecancodeit.statesdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class City {

	
	@Id
	@GeneratedValue
	private Long id;
	private String cityName;
	private int pop;

	
	@ManyToOne
	private Star territory;
	
	protected City() {
	}

	public City(String cityName, int pop) {
		this.cityName = cityName;
		this.pop = pop;
	}
	
	public String getCityName() {
		return cityName;
	}

	public int getPop() {
		return pop;
	}
	
	public Star getTerritory() {
		return territory;
	}
	
	public Long getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
