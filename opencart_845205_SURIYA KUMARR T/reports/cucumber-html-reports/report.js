$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/myTest.Feature");
formatter.feature({
  "line": 2,
  "name": "OpenCart Website",
  "description": "",
  "id": "opencart-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@OpenCart"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Login in the opencart",
  "description": "",
  "id": "opencart-website;login-in-the-opencart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@TC01_ValidLogin"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the Opencart application opens in chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user clicks on the login",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user fills all the valid details",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "the user clicks on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.the_Opencart_application_opens_in_chrome_browser()"
});
formatter.result({
  "duration": 20875422600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.the_user_clicks_on_the_login()"
});
formatter.result({
  "duration": 1065125300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.the_user_fills_all_the_valid_details()"
});
formatter.result({
  "duration": 6086640900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.the_user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 4314145100,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Invalid login in the opencart",
  "description": "",
  "id": "opencart-website;invalid-login-in-the-opencart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@TC02_InvalidLogin"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "the application will open in chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "the user clicks on login",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "the user tries to login with invalid details",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "the user clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "InvalidLoginStepDefinition.the_application_will_open_in_chrome_browser()"
});
formatter.result({
  "duration": 20039541800,
  "status": "passed"
});
formatter.match({
  "location": "InvalidLoginStepDefinition.the_user_clicks_on_login()"
});
formatter.result({
  "duration": 951345500,
  "status": "passed"
});
formatter.match({
  "location": "InvalidLoginStepDefinition.the_user_tries_to_login_with_invalid_details()"
});
formatter.result({
  "duration": 5547244700,
  "status": "passed"
});
formatter.match({
  "location": "InvalidLoginStepDefinition.the_user_clicks_on_login_button()"
});
formatter.result({
  "duration": 4231126600,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Choose the product and add to cart",
  "description": "",
  "id": "opencart-website;choose-the-product-and-add-to-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@TC03_AddtoCart"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "the url opens in Chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "the user clicks on loginbutton",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "the user selects the product",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "clicks on add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartStepDefinition.the_url_opens_in_Chrome_application()"
});
formatter.result({
  "duration": 18078957800,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartStepDefinition.the_user_clicks_on_loginbutton()"
});
formatter.result({
  "duration": 21210191700,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartStepDefinition.the_user_selects_the_product()"
});
formatter.result({
  "duration": 4860838800,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartStepDefinition.clicks_on_add_to_cart()"
});
formatter.result({
  "duration": 3548375300,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "check the cart",
  "description": "",
  "id": "opencart-website;check-the-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@TC04_CheckCart"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "url opens in Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "the user clicks on loginbutton and logs in",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "the user clicks the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "confirms the product we added is present or not",
  "keyword": "And "
});
formatter.match({
  "location": "CartCheckingStepDefinition.url_opens_in_Chrome_browser()"
});
formatter.result({
  "duration": 18005890700,
  "status": "passed"
});
formatter.match({
  "location": "CartCheckingStepDefinition.the_user_clicks_on_loginbutton_and_logs_in()"
});
formatter.result({
  "duration": 9818864100,
  "status": "passed"
});
formatter.match({
  "location": "CartCheckingStepDefinition.the_user_clicks_the_cart()"
});
formatter.result({
  "duration": 2788857300,
  "status": "passed"
});
formatter.match({
  "location": "CartCheckingStepDefinition.confirms_the_product_we_added_is_present_or_not()"
});
formatter.result({
  "duration": 7009576400,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Remove the product from cart",
  "description": "",
  "id": "opencart-website;remove-the-product-from-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@TC05_RemovefromCart"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "the url opens in the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "the user logs in to the opencart",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "user clicks the cart option",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "clicks on remove",
  "keyword": "And "
});
formatter.match({
  "location": "RemovefromCartStepDefinition.the_url_opens_in_the_chrome_browser()"
});
formatter.result({
  "duration": 27677559300,
  "status": "passed"
});
formatter.match({
  "location": "RemovefromCartStepDefinition.the_user_logs_in_to_the_opencart()"
});
formatter.result({
  "duration": 13431230200,
  "status": "passed"
});
formatter.match({
  "location": "RemovefromCartStepDefinition.user_clicks_the_cart_option()"
});
formatter.result({
  "duration": 3521848600,
  "status": "passed"
});
formatter.match({
  "location": "RemovefromCartStepDefinition.clicks_on_remove()"
});
formatter.result({
  "duration": 5003915900,
  "status": "passed"
});
});