package com.swiggy.testscripts;

import org.testng.Assert;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderPizzaTestStep extends Driver {


@Given("a user is on the home of Swiggy")
public void a_user_is_on_the_home_of_swiggy() {
	Assert.assertTrue(driver.getTitle().equals("Order food online from India's best food delivery service. Order from restaurant near you"));
   
}

@When("he Enter location as {string}")
public void he_enter_location_as(String string) {
	landingPage.enterLocation(string);
    
}

@When("he select first location from suggested location in suggestion-box")
public void he_select_first_location_from_suggested_location_in_suggestion_box() {
	landingPage.selectLocation();
   
}

@When("he redirects to ItemPage")
public void he_redirects_to_item_page() {
	System.out.println("test cases");
   
}

@When("he hover over search icon")
public void he_hover_over_search_icon() {
	items.hoverOverSearch();
   
}

@When("he Enter Item as {string}")
public void he_enter_item_as(String string) {
	items.enterItem(string);
	items.searchItem();
   
}
@When("he select first suggested Item in pizza cateogory")
public void he_select_first_suggested_item_in_pizza_cateogory() {
	items.selectFirstItem();

  
}

@When("he search restaurant and select first restaurant")
public void he_search_restaurant_and_select_first_restaurant() {
	placeOrder.addItem();
    
}

@When("he redirects to orderPage")
public void he_redirects_to_order_page() {
	placeOrder.continueorder();
	
    
}

@When("he add first item to cart")
public void he_add_first_item_to_cart() {
	placeOrder.moveToCart();
	

}

@When("he click on checkout button")
public void he_click_on_checkout_button() {
	placeOrder.checkoutAction();
   
}

@Then("he should be able to order a pizza suscessfully")
public void he_should_be_able_to_order_a_pizza_suscessfully() {
	String expectedErrMsg = "SECURE CHECKOUT";
	String actualErrMsg = checkOut.getMsg();
	Assert.assertEquals(actualErrMsg, expectedErrMsg);
    
}



}
