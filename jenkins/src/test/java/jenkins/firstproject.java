package jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class firstproject {
	

	@Test
	public void test()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();
		driver.close();
	}

}
