package org.wecancodeit.statesdemo;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CityTest {
	
	@Test
	public void shouldMakeACity() {
		City underCity = new City("Columbus", 860090);
		assertThat(underCity.getPop(), is(860090));
	}

}
