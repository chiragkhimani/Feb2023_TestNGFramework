package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

	@FindBy(id = "checkout")
	WebElement checkoutBtn;

	@FindBy(className = "inventory_item_name")
	WebElement itemName;
	
	@FindBy(className = "inventory_item_price")
	WebElement itemPrice;

	public boolean isCartPageDisplayed() {
		return checkoutBtn.isDisplayed();
	}
	
	public String getItemName() {
		return itemName.getText();
	}
	
	public String getItemPrice() {
		return itemPrice.getText();
	}
}
