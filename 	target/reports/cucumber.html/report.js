$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resurces/features/login_codefios.feature");
formatter.feature({
  "name": "user be able to login with valid credintial from databaase",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "1 user login with valid user id and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "user is on loginpage",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.Login_StepDefination.user_is_on_loginpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter user name as \"username\" from database",
  "keyword": "When "
});
formatter.match({
  "location": "steps.Login_StepDefination.user_enter_user_name_as_from_database(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter user passsword as \"password\" from database",
  "keyword": "When "
});
formatter.match({
  "location": "steps.Login_StepDefination.user_enter_user_passsword_as_from_database(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "en user is able to click login button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.Login_StepDefination.en_user_is_able_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is able to landed on dash bord and able to click on list account",
  "keyword": "When "
});
formatter.match({
  "location": "steps.Login_StepDefination.user_is_able_to_landed_on_dash_bord_and_able_to_click_on_list_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is able to land on add account page and able to click on add button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.Login_StepDefination.user_is_able_to_land_on_add_account_page_and_able_to_click_on_add_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is able to enter the account information",
  "keyword": "When "
});
formatter.match({
  "location": "steps.Login_StepDefination.user_is_able_to_enter_the_account_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is able to save information",
  "keyword": "When "
});
formatter.match({
  "location": "steps.Login_StepDefination.user_is_able_to_save_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is able to valid account in list account",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.Login_StepDefination.user_is_able_to_valid_account_in_list_account()"
});
formatter.result({
  "status": "passed"
});
});