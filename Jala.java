package webApplications;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Jala {
	public static void main(String[] args) {
        FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("http://magnus.jalatechnologies.com");
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("(//span[@class='pull-right-container'])[2]")).click();
		driver.findElement(By.xpath("//a[text()=' Menu']")).click();
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current:"+currentUrl);
		driver.findElement(By.id("b1")).click();
		String text = driver.findElement(By.id("label")).getText();
		System.out.println("Printed Text:"+ text);
		driver.findElement(By.xpath("//a[text()='Sub Menus']")).click();
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println("Selected SubMenu:"+currentUrl2);
		driver.findElement(By.className("dropbtn")).click();
		driver.findElement(By.id("manualbtn")).click();
		String text2 = driver.findElement(By.id("label1")).getText();
		System.out.println("Printed Text:"+ text2);
		driver.close();	
	}
}
