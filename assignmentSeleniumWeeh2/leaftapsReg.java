package assignmentSeleniumWeeh2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class leaftapsReg {

	public static void main(String[] args) throws InterruptedException {

     ChromeDriver driver=new ChromeDriver();
     //1. Launch URL "http://leaftaps.com/opentaps/control/login"
     driver.get("http://leaftaps.com/opentaps/control/login");
     
     // window maximize
     driver.manage().window().maximize();
     
     // 2. Enter UserName and Password Using Id Locator
     
     WebElement eleUsername=driver.findElement(By.id("username"));
     eleUsername.sendKeys("Demosalesmanager");
     
     driver.findElement(By.id("password")).sendKeys("crmsfa");

     // 3. Click on Login Button using Class Locator
     
     driver.findElement(By.className("decorativeSubmit")).click();
     
     // 4. Click on CRM/SFA Link
     driver.findElement(By.partialLinkText("CRM/SFA")).click();
     
     // 5. Click on Leads Button
     driver.findElement(By.linkText("Leads")).click();
     
     //6. Click on Create Lead 
     driver.findElement(By.partialLinkText("Create Lead")).click();
     
     // 7. Enter CompanyName Field Using id Locator
     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
     
     //8. Enter FirstName Field Using id Locator
     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ram");
     
     //9. Enter LastName Field Using id Locator
     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jain");
     
     //10. Enter FirstName(Local) Field Using id Locator
     driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("RamJ");
     
     //11. Enter Department Field Using any Locator of Your Choice
     driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CRM");
     
     // 12. Enter Description Field Using any Locator of your choice 
     driver.findElement(By.id("createLeadForm_description")).sendKeys("A customer relationship management (CRM) system is an integral part of every marketing, sales, and business development department as well as CRM companies.");
     
	 // 13. Enter your email in the E-mail address Field using the locator of your choice
     driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Ramjain@gmail.com");
     
	  //14. Select State/Province as NewYork Using Visible Text
   //selectByVisibleText();
	 
     
     WebElement sourceDD=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
     Select sec =new Select(sourceDD);
     
     sec.selectByVisibleText("New York");
     
	  //15. Click on Create Button
     driver.findElement(By.name("submitButton")).click();
     
     //driver.findElement(By.id("ext-gen603")).click();
     
     //driver.findElement(By.xpath("//button[@id='smallSubmit']")).click();
     
     //driver.findElement(By.id("ext-gen603")).click();
     //driver.findElement(By.className("submitButton")).click();
     
        // 16. Get the Title of Resulting Page(refer the video)  using driver.getTitle()
     
     String title=driver.getTitle();
     System.out.println(title);
     
          //   17. Click on Duplicate button
     
     driver.findElement(By.partialLinkText("Duplicate Lead")).click();
     Thread.sleep(300);
     
            // 18. Clear the CompanyName Field using .clear() And Enter new CompanyName
     driver.findElement(By.id("createLeadForm_companyName")).clear();
     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SelinumCompany");
     
     
     
             //19.Clear the FirstName Field using .clear() And Enter new FirstName
     driver.findElement(By.id("createLeadForm_firstName")).clear();
     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Tina");
     
             //20.Click on Create Lead Button
     driver.findElement(By.name("submitButton")).submit();
     
             //21. Get the Title of Resulting Page(refer the video)  using driver.getTitle()
     
     String title1=driver.getTitle();
     System.out.println(title1);
     
	}

}

	