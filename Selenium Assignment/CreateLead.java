package weekly.Assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
        driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();
        driver.findElement(By.name("USERNAME")).sendKeys("DemosalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sirath");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sarvin");
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("sirath");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("Software Developer");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sirathsarvin05@gmail.com");

        WebElement stateDropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select selectStateDropDown = new Select(stateDropDown);
        selectStateDropDown.selectByVisibleText("New York");
        driver.findElement(By.className("smallSubmit")).click();
        
        String title = driver.getTitle();
		 System.out.println(title);
	}

}