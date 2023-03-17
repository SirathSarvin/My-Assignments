package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class facebooklogin {
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		    driver.manage().window().maximize();
            driver.get("https://www.facebook.com/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.findElement(By.xpath("//a[text() = 'Create new account']")).click();
	        driver.findElement(By.name("firstname")).sendKeys("Sirath");
	        driver.findElement(By.name("lastname")).sendKeys("Sarvin");
	        driver.findElement(By.name("reg_email__")).sendKeys("765676543");
	        driver.findElement(By.name("reg_passwd__")).sendKeys("9080706050");
            WebElement dayDropDown = driver.findElement(By.name("birthday_day"));
	        Select selectDay = new Select(dayDropDown);
	        selectDay.selectByValue("23");
            WebElement monthDropDown = driver.findElement(By.name("birthday_month"));
	        Select selectMonth = new Select(monthDropDown);
	        selectMonth.selectByValue("6");
            WebElement yearDropDown = driver.findElement(By.name("birthday_year"));
	        Select selectYear = new Select(yearDropDown);
	        selectYear.selectByValue("2000");
            WebElement maleRadio = driver.findElement(By.xpath("//input[@value = '2']"));
	        maleRadio.click();
	        driver.close();



       
		
	}

}
