package snap;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snap2 {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://leafground.com/button.xhtml;jsessionid=node09y9nqu7zbcm39v675nnnpnz8151681.node0");
		WebElement ele = driver.findElement(By.xpath("//span[text()='Secondary']"));
		File start=ele.getScreenshotAs(OutputType.FILE);
		File end=new File("./snap/002.jpg");
		FileUtils.copyFile(start, end);
	}

}
