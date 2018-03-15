package org.wecancodeit.statesdemo;

public class City {

	private String cityName;
	private int pop;

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

}
