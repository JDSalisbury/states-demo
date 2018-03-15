package org.wecancodeit.statesdemo;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Fish {

	@Id
	@GeneratedValue
	private long id;
	private String fishName;
	private String bionomal;
	private String imageURL;
	
	@JsonIgnore
	@OneToMany(mappedBy = "fish")
	private Collection<Star> states;

	protected Fish() {

	}

	public Fish(String fishName, String bionomal, String imageURL) {
		this.fishName = fishName;
		this.bionomal = bionomal;
		this.imageURL = imageURL;

	}

	public String getFishName() {
		return fishName;
	}

	public String getBionomal() {
		return bionomal;
	}

	public String getImageURL() {
		return imageURL;
	}

	public long getId() {
		return id;
	}

	public Collection<Star> getStates() {
		return states;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Fish other = (Fish) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
