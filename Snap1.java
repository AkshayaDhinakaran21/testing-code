package snap;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snap1 {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		 WebElement ele = driver.findElement(By.name("login"));
		 File start =ele.getScreenshotAs(OutputType.FILE);
		 File end=new File("./snap/001.png");
		 FileUtils.copyFile(start, end);
	}

}
