//package Com.talentech.Stepdefination;
//
////import org.junit.Assert;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import Com.talentech.pages.SdarkPage;
//import io.cucumber.java.en.*;
//
//public class SdarkStep {
//	public WebDriver driver;
//	public SdarkPage Sdp;
//
//
//	@Given("User launch Chrome Broswer")
//	public void user_launch_Chrome_Broswer() {
//		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
//		driver=new ChromeDriver(); 
//		Sdp=new SdarkPage(driver);
//	}
//
//	@Given("User opens URL {string}")
//	public void user_opens_URL(String url) {
//		driver.get(url);
//		driver.manage().window().maximize();
//	}
//
//	@When("User Enters Emaols as {string} and Password as {string}")
//	public void user_Enters_Emaols_as_and_Password_as(String email, String password) {
//		Sdp.setUserName(email);
//		Sdp.setPassword(password);
//	}
//
//	@When("User Click on login") 
//	public void user_Click_on_login() {
//		Sdp.clickLogin(); 
//	}
//
////	@When("Page title should be {string}")
////	public void page_title_should_be(String title) throws InterruptedException {
////		if(driver.getPageSource().contains("Login was unsuccessful.")) {
////			driver.close();
////			Assert.assertTrue(false);
////		}
////		else {
////			Assert.assertEquals(title, driver.getTitle());
////		}
////		Thread.sleep(2000);
////	}
//	@When("Page title should be {string}")
//	public void page_title_should_be(String title) throws InterruptedException {
//		System.out.println(driver.getTitle());
//	}
//
//	@Then("User click on Logout link")
//	public void user_click_on_Logout_link() throws InterruptedException {
//		Thread.sleep(2000);
//		Sdp.clickLogout();
//		Thread.sleep(2000);
//	}
//
//	@Then("Page Title should be {string}")
//	public void page_Title_should_be(String string) {
//		System.out.println(driver.getTitle());
//	}
//
//	@Then("User close the Broswer")
//	public void user_close_the_Broswer() {
//		driver.quit();
//
//	}
//}
