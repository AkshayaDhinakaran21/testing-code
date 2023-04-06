package webApplications;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		 driver.findElement(By.name("firstname")).sendKeys("DHARUN");
		 driver.findElement(By.name("lastname")).sendKeys("KUMAR");
		 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9488083682");
		 driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Dharunkumar17");	 
		 WebElement ele=driver.findElement(By.id("day"));
		 Select selectDay=new Select(ele);
		 selectDay.selectByValue("4");
		 WebElement mon=driver.findElement(By.id("month"));
		 Select selectMonth=new Select(mon);
		 selectMonth.selectByValue("2");
		 WebElement year=driver.findElement(By.id("year"));
		 Select selectYear=new Select(year);
		 selectYear.selectByValue("2002");
		 driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		 
		 
		 
		 
	}

}
