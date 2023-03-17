package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class uibank {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://uibank.uipath.com/register-account");
        driver.findElement(By.id("firstName")).sendKeys("Sirath");
        WebElement title = driver.findElement(By.id("title"));
        Select selectTitle = new Select(title);
        selectTitle.selectByValue("mr");
        driver.findElement(By.id("middleName")).sendKeys("-");
        driver.findElement(By.id("lastName")).sendKeys("Sarvin");
        WebElement gender = driver.findElement(By.name("gender"));
        Select selectGender = new Select(gender);
        selectGender.selectByValue("male");
        WebElement employmentStatus = driver.findElement(By.name("employmentStatus"));
        Select selectEmploymentStatus = new Select(employmentStatus);
        selectEmploymentStatus.selectByVisibleText("Full-time");
        driver.findElement(By.name("username")).sendKeys("Sirath07");
        driver.findElement(By.name("email")).sendKeys("sirath81@gmail.com");
        driver.findElement(By.id("password")).sendKeys("456787");
        driver.close();
        
        
        
      


		
	}

}
