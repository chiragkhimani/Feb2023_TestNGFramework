package com.automation.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.automation.pages.CartPage;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.pages.ProductDetailPage;
import com.automation.utils.DriverUtils;
import com.automation.utils.PropertyReader;

public class BaseTest {

	LoginPage loginPage;
	HomePage homePage;
	CartPage cartPage;
	ProductDetailPage pdpPage;

	@BeforeMethod
	public void setUp() {
		PropertyReader.initProperty();
		DriverUtils.initDriver();
		loginPage = new LoginPage();
		homePage = new HomePage();
		cartPage = new CartPage();
		pdpPage = new ProductDetailPage();
	}

	@AfterMethod
	public void cleanUp() {
		DriverUtils.quitDriver();
	}

}
