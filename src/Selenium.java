import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Seada\\Downloads\\libraries\\chromedriver.exe");

        // Initializing Chrome Driver
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/form");
        driver.manage().window().maximize();

        // Getting fields
        WebElement firstName = driver.findElement(By.id("first-name"));
        WebElement lastName = driver.findElement(By.id("last-name"));
        WebElement jobTitle = driver.findElement(By.id("job-title"));
        WebElement highestGrade = driver.findElement(By.id("radio-button-1"));
        WebElement submit = driver.findElement(By.className("btn-primary"));

        // Sending values to fields
        firstName.sendKeys("Saher");
        lastName.sendKeys("Seada");
        jobTitle.sendKeys("Student");
        highestGrade.click();
        submit.click();
        String a = driver.getTitle();
        String b = "formy";

        // Outputting state of tests
        if (a.equalsIgnoreCase(b)) {
            System.out.println("Tests succeeded.");
        } else {
            System.out.println("Tests failed.");
        }
    }
}
