//package Com.talentech.Stepdefination;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import Com.talentech.pages.GroupStudyPage;
//import io.cucumber.java.en.*;
//
//public class GroupStudySteps {
//	
//	public WebDriver driver;
//	GroupStudyPage gp;
//	
//	@Given("User launch Chrome browser")
//	public void user_launch_Chrome_browser() {
//	 System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
//	 driver = new ChromeDriver();
//	 gp= new GroupStudyPage(driver);
//	}
//
//	@When("User opens URL {string}")
//	public void user_opens_URL(String url) {
//	  driver.get(url);  
//	  driver.manage().window().maximize();
//	}
//
//	@Then("User enters Email as {string} and Password as {string}")
//	public void user_enters_Email_as_and_Password_as(String email, String password) {
//	gp.Username(email);
//	gp.Password(password);	    
//	}
//
//	@Then("User clicks login button")
//	public void user_clicks_login_button() {
//		gp.clickSubmit();
//	}
//
//	@Then("User should be on {string}")
//	public void user_should_be_on(String string) {
//	    System.out.println(driver.getTitle());
//	}
//
//	@Then("User clicks logout")
//	public void user_clicks_logout() {
//	   gp.clickLogout(); 
//	}
//
//	@Then("User shoud be on page {string}")
//	public void user_shoud_be_on_page(String string) {
//	    System.out.println(driver.getTitle());
//	}
//
//	@Then("User close the browser")
//	public void user_close_the_browser() {
//	    driver.quit();
//	}
//
//}
