//package Com.talentech.Stepdefination;
//
//import Com.talentech.pages.GraduationPagesCardOrdering;
//import io.cucumber.java.en.*;
//
//public class GradStep {
//	GraduationPagesCardOrdering grd;
//
//	@Given("Customer clicks on Stamps & Supplies from Mail&Ship Menu")
//	public void customer_clicks_on_Stamps_Supplies_from_Mail_Ship_Menu() {
//		GraduationPagesCardOrdering gr3= new GraduationPagesCardOrdering();
//		gr3.Stamp();
//	}
//
//	@When("Customer lands on Postal store Page")
//	public void customer_lands_on_Postal_store_Page() {
//		System.out.println("postal Store");
//	}
//
//	@When("Customer clicks on Cards & Envelope")
//	public void customer_clicks_on_Cards_Envelope() {
//		GraduationPagesCardOrdering gr4= new GraduationPagesCardOrdering();
//		gr4.CardEnv();
//
//	}
//
//	@Then("Customer see the Cards & Envelope page")
//	public void customer_see_the_Cards_Envelope_page() {
//		System.out.println("I got it");
//
//	}
//
//	@Then("Cutomer Selects Graduation from the left filter options")
//	public void cutomer_Selects_Graduation_from_the_left_filter_options() {
//		GraduationPagesCardOrdering gr5= new GraduationPagesCardOrdering(); 
//		gr5.Graduation();
//
//	}
//
//	@Then("Customer Selects Flowers From The Garden Notecards")
//	public void customer_Selects_Flowers_From_The_Garden_Notecards() {
//		GraduationPagesCardOrdering gr6= new GraduationPagesCardOrdering();
//		gr6.Flowers();
//
//	}
//
//	@Then("Customer Lands on Checkout page")
//	public void customer_Lands_on_Checkout_page() {
//
//		System.out.println("go now");
//	}
//
//	@Then("Customer Clicks on the add to cart option")
//	public void customer_Clicks_on_the_add_to_cart_option() throws InterruptedException {
//
//		GraduationPagesCardOrdering gr7= new GraduationPagesCardOrdering();
//		gr7.addCart();
//	}
//
//	@Then("Customer Clicks on Checkout Now")
//	public void customer_Clicks_on_Checkout_Now() {
//		GraduationPagesCardOrdering gr8= new GraduationPagesCardOrdering();
//		gr8.ChekOut();
//
//	}
//
//
//
//}
