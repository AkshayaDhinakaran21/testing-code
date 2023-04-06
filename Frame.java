package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		driver.switchTo().alert().sendKeys("Dharun...");
		driver.switchTo().alert().accept();
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println("Output:"+text);
		
	}
}
