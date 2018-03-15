package org.wecancodeit.statesdemo;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class StateTest {

	@Test
	public void shouldGetStateStuff() {
		Fish underFish = new Fish("walleye", "Sander vitreus", "imageURL");
		State underTest = new State("OH", "Ohio", "Birthplace of aviation", underFish, "cities");
		
		
		assertThat(underTest.getAbb(), is("OH"));
		
	}
	
}
