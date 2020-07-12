$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature",
  "description": "As a QE I want to test Login Feature of USPS",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Successful login with valid username and password",
  "description": "",
  "id": "login-feature;successful-login-with-valid-username-and-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "customer is on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Customer clicks SignIn link on the top of homepage",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Customer enters \"\u003cusername\u003e\" and Customer enters \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Custoemr clicks sign in",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Homepage should be shown",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "login-feature;successful-login-with-valid-username-and-password;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "login-feature;successful-login-with-valid-username-and-password;;1"
    },
    {
      "cells": [
        "MahbubaNimme2020",
        "Corona2020"
      ],
      "line": 13,
      "id": "login-feature;successful-login-with-valid-username-and-password;;2"
    },
    {
      "cells": [
        "QA2020",
        "Corona2020"
      ],
      "line": 14,
      "id": "login-feature;successful-login-with-valid-username-and-password;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6160722300,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Successful login with valid username and password",
  "description": "",
  "id": "login-feature;successful-login-with-valid-username-and-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "customer is on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Customer clicks SignIn link on the top of homepage",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Customer enters \"MahbubaNimme2020\" and Customer enters \"Corona2020\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Custoemr clicks sign in",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Homepage should be shown",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.customer_is_on_Homepage()"
});
formatter.result({
  "duration": 411228973,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.customer_clicks_Register_SignIn_link_on_the_top_of_homepage()"
});
formatter.result({
  "duration": 1606201623,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MahbubaNimme2020",
      "offset": 17
    },
    {
      "val": "Corona2020",
      "offset": 56
    }
  ],
  "location": "LoginStepDefination.customer_enters_and_Customer_enters(String,String)"
});
formatter.result({
  "duration": 1254876095,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.custoemr_clicks_sign_in()"
});
formatter.result({
  "duration": 749349859,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.homepage_should_be_shown()"
});
formatter.result({
  "duration": 64365,
  "status": "passed"
});
formatter.after({
  "duration": 308010015,
  "status": "passed"
});
formatter.before({
  "duration": 3418099421,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Successful login with valid username and password",
  "description": "",
  "id": "login-feature;successful-login-with-valid-username-and-password;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "customer is on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Customer clicks SignIn link on the top of homepage",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Customer enters \"QA2020\" and Customer enters \"Corona2020\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Custoemr clicks sign in",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Homepage should be shown",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.customer_is_on_Homepage()"
});
formatter.result({
  "duration": 9772753,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.customer_clicks_Register_SignIn_link_on_the_top_of_homepage()"
});
formatter.result({
  "duration": 1309030756,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "QA2020",
      "offset": 17
    },
    {
      "val": "Corona2020",
      "offset": 46
    }
  ],
  "location": "LoginStepDefination.customer_enters_and_Customer_enters(String,String)"
});
formatter.result({
  "duration": 1062310679,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.custoemr_clicks_sign_in()"
});
formatter.result({
  "duration": 791648331,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.homepage_should_be_shown()"
});
formatter.result({
  "duration": 56920,
  "status": "passed"
});
formatter.after({
  "duration": 379722083,
  "status": "passed"
});
});