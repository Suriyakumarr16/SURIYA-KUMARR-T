@OpenCart
Feature: OpenCart Website

 @TC01_ValidLogin
 Scenario: Login in the opencart
  Given the Opencart application opens in chrome browser
  When the user clicks on the login
  Then the user fills all the valid details
  And the user clicks on the login button

 @TC02_InvalidLogin
 Scenario: Invalid login in the opencart
  Given the application will open in chrome browser
  When the user clicks on login
  Then the user tries to login with invalid details
  And the user clicks on login button

 @TC03_AddtoCart
 Scenario: Choose the product and add to cart
  Given the url opens in Chrome application
  When the user clicks on loginbutton
  Then the user selects the product
  And clicks on add to cart

 @TC04_CheckCart
 Scenario: check the cart
  Given url opens in Chrome browser
  When the user clicks on loginbutton and logs in
  Then the user clicks the cart
  And confirms the product we added is present or not

 @TC05_RemovefromCart
 Scenario: Remove the product from cart
  Given the url opens in the chrome browser
  When the user logs in to the opencart
  Then user clicks the cart option
  And clicks on remove
