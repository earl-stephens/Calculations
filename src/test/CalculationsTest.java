package test;
import org.junit.Assert;
import org.junit.Test;
import application.App;

public class CalculationsTest {
	@Test
	public void shouldReturnAnInstanceOfApp() {
		App app = new App();
		Assert.assertNotNull(app);
	}
}
