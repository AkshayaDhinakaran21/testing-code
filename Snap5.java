package snap;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Snap5 {
	public static void main(String[] args) throws IOException {
		//EdgeOptions option=new EdgeOptions();
		//option.addArguments("-disable-notifications");
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.muscleblaze.com/");
		WebElement ele = driver.findElement(By.xpath("//span[text()='Best Seller']"));
		File start =ele.getScreenshotAs(OutputType.FILE);
		File end =new File("./snap/007.jpg");
		FileUtils.copyFile(start, end);
		
	}

}
