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

public class Snap3 {
	public static void main(String[] args) throws IOException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("-disable-notifications");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.muscleblaze.com/");
		WebElement ele = driver.findElement(By.xpath("//div[text()='Sign Up']"));
		File start=ele.getScreenshotAs(OutputType.FILE);
		File end=new File("./snap/003.jpg");
		FileUtils.copyFile(start, end);
		driver.close();

}
}