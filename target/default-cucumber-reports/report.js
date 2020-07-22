$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/project001_features/login.feature");
formatter.feature({
  "name": "Login",
  "description": "  As user, I want to be able to login into restful booker\n  to test web services",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@F0001"
    }
  ]
});
formatter.scenario({
  "name": "Login as (data table example)",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@F0001"
    },
    {
      "name": "@data_table_map"
    }
  ]
});
formatter.step({
  "name": "user is on the restful booker login page",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinitions.userIsOnTheRestfulBookerLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user log in with following credentials",
  "rows": [
    {
      "cells": [
        "link1",
        "API Docs"
      ]
    },
    {
      "cells": [
        "link2",
        "Website"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.userLogInWithFollowingCredentials(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
});