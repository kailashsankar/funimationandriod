$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("funimationTesting.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Shaik Nazeer"
    }
  ],
  "line": 3,
  "name": "Verify the functionality of Funimation Application",
  "description": "",
  "id": "verify-the-functionality-of-funimation-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 189079279,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Verify the User able to login Funimation Application with valid credentials",
  "description": "",
  "id": "verify-the-functionality-of-funimation-application;verify-the-user-able-to-login-funimation-application-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@funimation"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I launch the \"Funimation App\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I should see \"Login\" button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should click \"Login\" button\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I should enter \"Username\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should enter \"Password\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on \"Login\" button on \"Login screen\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on \"Menu\" button on \"Dashboard\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on \"settings\" link on Menu list",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should verify \"Your Mail\" as \"uatfuni+1548242372367@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on \"Menu\" button on \"Dashboard\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on \"Home\" button on \"Dashboard\"",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I should \"Add\" a show",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I should logout the \"Funimation App\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Funimation App",
      "offset": 14
    }
  ],
  "location": "Steps.i_launch_the(String)"
});
formatter.result({
  "duration": 51900902901,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 14
    }
  ],
  "location": "Steps.i_should_see_button(String)"
});
formatter.result({
  "duration": 1704465695,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 16
    }
  ],
  "location": "Steps.i_should_click_button(String)"
});
formatter.result({
  "duration": 590440244,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Username",
      "offset": 16
    }
  ],
  "location": "Steps.i_should_enter(String)"
});
formatter.result({
  "duration": 10270282958,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Password",
      "offset": 16
    }
  ],
  "location": "Steps.i_should_enter(String)"
});
formatter.result({
  "duration": 8477235888,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 12
    },
    {
      "val": "Login screen",
      "offset": 30
    }
  ],
  "location": "Steps.i_click_on_button_on(String,String)"
});
formatter.result({
  "duration": 3966270083,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Menu",
      "offset": 12
    },
    {
      "val": "Dashboard",
      "offset": 29
    }
  ],
  "location": "Steps.i_click_on_button_on(String,String)"
});
formatter.result({
  "duration": 354003905,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "settings",
      "offset": 12
    }
  ],
  "location": "Steps.i_click_on_link_on_Menu_list(String)"
});
formatter.result({
  "duration": 4180913560,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your Mail",
      "offset": 17
    },
    {
      "val": "uatfuni+1548242372367@gmail.com",
      "offset": 32
    }
  ],
  "location": "Steps.i_should_verify_as(String,String)"
});
formatter.result({
  "duration": 3089102162,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Menu",
      "offset": 12
    },
    {
      "val": "Dashboard",
      "offset": 29
    }
  ],
  "location": "Steps.i_click_on_button_on(String,String)"
});
formatter.result({
  "duration": 279266732,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Home",
      "offset": 12
    },
    {
      "val": "Dashboard",
      "offset": 29
    }
  ],
  "location": "Steps.i_click_on_button_on(String,String)"
});
formatter.result({
  "duration": 1169309505,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Add",
      "offset": 10
    }
  ],
  "location": "Steps.i_should_a_show(String)"
});
formatter.result({
  "duration": 318209465,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Funimation App",
      "offset": 21
    }
  ],
  "location": "Steps.i_should_logout_the(String)"
});
formatter.result({
  "duration": 5822249939,
  "status": "passed"
});
formatter.after({
  "duration": 74506,
  "status": "passed"
});
formatter.uri("funimationTests.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Shaik Nazeer"
    }
  ],
  "line": 2,
  "name": "Verify the failure scenario in funimation App",
  "description": "",
  "id": "verify-the-failure-scenario-in-funimation-app",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7533931,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify the User able to login Funimation Application with valid credentials",
  "description": "",
  "id": "verify-the-failure-scenario-in-funimation-app;verify-the-user-able-to-login-funimation-application-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@funimation1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I launch the \"Funimation App\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I should see \"Login\" button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should click \"Login\" button\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I should enter \"Username\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should enter \"Password\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on \"Login\" button on \"Login screen\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on \"Menu\" button on \"Dashboard\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on \"settings\" link on Menu list",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should verify \"Your Mail\" as \"testfailure@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Funimation App",
      "offset": 14
    }
  ],
  "location": "Steps.i_launch_the(String)"
});
formatter.result({
  "duration": 44406736860,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 14
    }
  ],
  "location": "Steps.i_should_see_button(String)"
});
formatter.result({
  "duration": 1760661696,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 16
    }
  ],
  "location": "Steps.i_should_click_button(String)"
});
formatter.result({
  "duration": 647953799,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Username",
      "offset": 16
    }
  ],
  "location": "Steps.i_should_enter(String)"
});
formatter.result({
  "duration": 10872081690,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Password",
      "offset": 16
    }
  ],
  "location": "Steps.i_should_enter(String)"
});
formatter.result({
  "duration": 8513703931,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 12
    },
    {
      "val": "Login screen",
      "offset": 30
    }
  ],
  "location": "Steps.i_click_on_button_on(String,String)"
});
formatter.result({
  "duration": 4061088742,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Menu",
      "offset": 12
    },
    {
      "val": "Dashboard",
      "offset": 29
    }
  ],
  "location": "Steps.i_click_on_button_on(String,String)"
});
formatter.result({
  "duration": 554270989,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "settings",
      "offset": 12
    }
  ],
  "location": "Steps.i_click_on_link_on_Menu_list(String)"
});
formatter.result({
  "duration": 4529717954,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your Mail",
      "offset": 17
    },
    {
      "val": "testfailure@gmail.com",
      "offset": 32
    }
  ],
  "location": "Steps.i_should_verify_as(String,String)"
});
formatter.result({
  "duration": 114253533,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[testfailure]@gmail.com\u003e but was:\u003c[uatfuni+1548242372367]@gmail.com\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat StepDefinitions.Steps.i_should_verify_as(Steps.java:87)\r\n\tat ✽.And I should verify \"Your Mail\" as \"testfailure@gmail.com\"(funimationTests.feature:14)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 17866,
  "status": "passed"
});
});