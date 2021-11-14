package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo2 {

	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Launch URL
		driver.get("http://automationpractice.com/index.php");
		
		//maximize web page window
		driver.manage().window().maximize(); 
		
		//Locator by class names, finds multiple elements followed by size. This example has 5 images that slides
		int slider = driver.findElements(By.className("homeslider-container")).size();
		System.out.println(slider);
		
		//Locator by tag name. Also use to find multilp elements on a web page. a is the ancor for links
		int links = driver.findElements(By.tagName("a")).size();
		System.out.println(links);
		
		

}
