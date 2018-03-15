package org.wecancodeit.statesdemo;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FishTest {

		@Test
		public void shouldMakeFish() {
			Fish underTest = new Fish("walleye", "Sander vitreus", "image/url");
			
			assertThat(underTest.getFishName(), is("walleye"));
		}
}
