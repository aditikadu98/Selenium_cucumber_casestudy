package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Step_defination {

	WebDriver driver;

	@Before
	public void bt() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("http://elearningm1.upskills.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Given("the tester is on the sign in page")
	public void the_tester_is_on_the_sign_in_page() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
     
	}

	@When("tester clicks on sign in link")
	public void tester_clicks_on_sign_in_link() {
		driver.findElement(By.xpath("//a[contains(text(),'Sign up!')]")).click();
	}

	@When("the tester enters firstname as {string}")
	public void the_tester_enters_firstname_as(String string) {
		driver.findElement(By.xpath("//input[@id='registration_firstname']")).sendKeys(string);
	}

	@When("the tester enters lastname as {string}")
	public void the_tester_enters_lastname_as(String string) {
		driver.findElement(By.xpath("//input[@id='registration_lastname']")).sendKeys(string);
	}

	@When("the tester inputs email address as {string}")
	public void the_tester_inputs_email_address_as(String string) {
		driver.findElement(By.xpath("//input[@id='registration_email']")).sendKeys(string);
	}

	@When("the tester enters username as {string}")
	public void the_tester_enters_username_as(String string) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(string);
	}

	@When("the tester inputs password as {string}")
	public void the_tester_inputs_password_as(String string) {
		driver.findElement(By.xpath("//input[@id='pass1']")).sendKeys(string);
	}

	@When("the tester re-enters  password as {string}")
	public void the_tester_re_enters_password_as(String string) {
		driver.findElement(By.xpath("//input[@id='pass2']")).sendKeys(string);
	}

	@When("the tester clicks on Register button")
	public void the_tester_clicks_on_register_button() {
		driver.findElement(By.xpath("//button[@id='registration_submit']")).click();
	}

	@When("the tester should see the message as Dear ADITI KADU")
	public void the_tester_should_see_the_message_as_dear_aditi_kadu() throws InterruptedException {
		Thread.sleep(2000);
		String Expected = driver.findElement(By.xpath("//body/main[@id='main']/section[@id='cm-content']/div[1]/div[2]/div[1]/p[1]")).getText();
		System.out.println(Expected);
	}

	@When("the tester clicks on dropdown menu in top right corner")
	public void the_tester_clicks_on_dropdown_menu_in_top_right_corner() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/main/header/nav/div/div[2]/ul[2]/li[2]/a")).click();
	}

	@When("the tester clicks on inbox link")
	public void the_tester_clicks_on_inbox_link() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/main/header/nav/div/div[2]/ul[2]/li[2]/ul/li[3]/a")).click();
	}

	@When("the tester clicks on Compose icon")
	public void the_tester_clicks_on_compose_icon() {
		driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div/div[2]/div[1]/div/div[1]/a[1]/img"))
				.click();
	}

	@When("the tester enters {string} in sent to field")
	public void the_tester_enters_in_sent_to_field(String string) throws InterruptedException {
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath(
				"//body/main[@id='main']/section[@id='cm-content']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/"
						+ "form[1]/fieldset[1]/div[1]/div[1]/span[1]/span[1]/span[1]/ul[1]/li[1]/input[1]"))
				.sendKeys("naveen");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/span/span/span/ul/li[1]")).click();
	}

	@When("the tester enters the subject field as {string}")
	public void the_tester_enters_the_subject_field_as(String string) throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@id='compose_message_title']")).sendKeys(string);
	}

	@When("the tester enters the message")
	public void the_tester_enters_the_message() throws InterruptedException {
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"cke_1_contents\"]/iframe")));
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body")).sendKeys("Hello Mr.Naveen,");
		Actions a = new Actions(driver);
		a.sendKeys(Keys.ENTER).build().perform();
		a.sendKeys(Keys.SPACE).build().perform();
		a.sendKeys(Keys.SPACE).build().perform();
		a.sendKeys(Keys.SPACE).build().perform();
		driver.findElement(By.xpath("/html/body")).sendKeys("This is for testing");
		a.sendKeys(Keys.ENTER).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("/html/body")).sendKeys("From");
		a.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("/html/body")).sendKeys("Naveen 1");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
	}

	@When("the tester clicks on send message button")
	public void the_tester_clicks_on_send_message_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("compose_message_compose")).click();
	}

	@Then("the tester can see the acknowledgement of message send")
	public void the_tester_can_see_the_acknowledgement_of_message_send() throws InterruptedException {
		Thread.sleep(2000);
		String actual = driver
				.findElement(By.xpath("//body/main[@id='main']/section[@id='cm-content']/div[1]/div[2]/div[1]/div[1]"))
				.getText();

		System.out.println(actual);
		String expected = "The message has been sent to naveen naveen (naveen)";
		Assert.assertEquals(expected, actual);

	}

}
