package mvc;

import org.junit.Assert;
import org.junit.Test;

import mvc.impl.controllers.CMain;
import mvc.impl.models.MMain;
import mvc.impl.views.VMain;

public class Main {

	@Test
	public void test() {
		Assert.assertNotEquals(new CMain(new MMain(), new VMain()), null);
	}

}
