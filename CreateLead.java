package Week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		 WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		WebElement elementPassword=driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();
		WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();
		WebElement elementcompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementcompanyName.sendKeys("Dell");
		WebElement elementfirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementfirstName.sendKeys("Vinsmoke");
		WebElement elementlastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementlastName.sendKeys("Sanji");
		WebElement elementfirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		elementfirstNameLocal.sendKeys("Sanji");
		WebElement elementdepartmentName = driver.findElement(By.id("createLeadForm_departmentName"));
		elementdepartmentName.sendKeys("Claims");
		WebElement elementdescription = driver.findElement(By.id("createLeadForm_description"));
		elementdescription.sendKeys("Maintaining and Renewing the claims as per the client request");
		WebElement elementprimaryEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementprimaryEmail.sendKeys("sanji18@gmail.com");
		WebElement CreateLead= driver.findElement(By.className("smallSubmit"));
		CreateLead.click();
		System.out.println("The Title is: " + driver.getTitle());
		
		
	}	
}
