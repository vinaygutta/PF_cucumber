package com.toolsqa.featuresteps;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.toolsqa.base.BasePageInit;
import com.toolsqa.pages.actions.AlertsPage;
import com.toolsqa.pages.actions.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlertSOne {
	
	

	private HomePage homepage;
	private AlertsPage apage;

	@Given("^when clicked on AlertsFrameWin link on the Home page$")
	public void when_clicked_on_alertsframewin_link_on_the_home_page() throws Throwable {

		homepage = new HomePage();
		homepage.clickAlertFrmWin();

	}

	@And("^clicked on Alerts link on the left nav$")
	public void clicked_on_alerts_link_on_the_left_nav() throws Throwable {
		
		apage = BasePageInit.lnavPage.clickLeftNavalertsfrmwin_alerts(true);

	}

	@When("^when clicked on click me button related to alert$")
	public void when_clicked_on_click_me_button_related_to_alert() throws Throwable {

		
		apage.clickAlertButton();
		//Assert.assertEquals(true,false);
		
		
	
		

	}
	
	@When("when clicked on click me button related to delayed alert")
	public void when_clicked_on_click_me_button_related_to_delayed_alert() {
		apage.clickdelayAlertButton();
	}

	@Then("^alert should be displayed$")
	public void alert_should_be_displayed() throws Throwable {

	}

}
