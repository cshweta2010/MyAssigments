package assignmentSeleniumWeeh2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class emailSelenium {

	public static void main(String[] args) {
		
		
		ChromeDriver driver=new ChromeDriver();
		
		//1. Load url "https://acme-test.uipath.com/login"
		driver.get("https://acme-test.uipath.com/login");
		
		 // window maximize
	     driver.manage().window().maximize();
		
		//2 Enter email as "kumar.testleaf@gmail.com"
		
		WebElement eleEmail = driver.findElement(By.id("email"));
		eleEmail.sendKeys("kumar.testleaf@gmail.com");
		
		
		 //3 Enter Password as "leaf@12"
		 
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		
		//4. Click login button
		//driver.findElement(By.className("btn btn-primary")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//driver.submit();
		
		//driver.findElement(By.id("Login")).click();
		
		//5. Get the title of the page and print
		 
	String title = driver.getTitle();
	System.out.println(title);
	
		//6 log out
	
	driver.findElement(By.partialLinkText("Log Out")).click();
	}

}
