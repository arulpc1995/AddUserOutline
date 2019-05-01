$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/ScenarioOutline.feature");
formatter.feature({
  "name": "The User check with an scenario outline page",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@regerrsion"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@user1"
    }
  ]
});
formatter.step({
  "name": "The user is in add triff paln page",
  "keyword": "Given "
});
formatter.step({
  "name": "The user fill the valid detail \"\u003cMonthRent\u003e\",\"\u003cLocalMin\u003e\",\"\u003cInterMin\u003e\",\"\u003cSmsPack\u003e\",\"\u003cPerMin\u003e\",\"\u003cMinuteCharge\u003e\",\"\u003cPerCharge\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "The user click the submit button in add triff plan",
  "keyword": "When "
});
formatter.step({
  "name": "the user should see the success message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "MonthRent",
        "LocalMin",
        "InterMin",
        "SmsPack",
        "PerMin",
        "MinuteCharge",
        "PerCharge"
      ]
    },
    {
      "cells": [
        "500",
        "200",
        "400",
        "250",
        "350",
        "550",
        "100"
      ]
    },
    {
      "cells": [
        "400",
        "200",
        "700",
        "250",
        "850",
        "550",
        "100"
      ]
    },
    {
      "cells": [
        "900",
        "200",
        "300",
        "250",
        "550",
        "550",
        "600"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@regerrsion"
    },
    {
      "name": "@user1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user is in add triff paln page",
  "keyword": "Given "
});
formatter.match({
  "location": "ScenarioOutline.the_user_is_in_add_triff_paln_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user fill the valid detail \"500\",\"200\",\"400\",\"250\",\"350\",\"550\",\"100\"",
  "keyword": "When "
});
formatter.match({
  "location": "ScenarioOutline.the_user_fill_the_valid_detail(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click the submit button in add triff plan",
  "keyword": "When "
});
formatter.match({
  "location": "ScenarioOutline.the_user_click_the_submit_button_in_add_triff_plan()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the success message",
  "keyword": "Then "
});
formatter.match({
  "location": "ScenarioOutline.the_user_should_see_the_success_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@regerrsion"
    },
    {
      "name": "@user1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user is in add triff paln page",
  "keyword": "Given "
});
formatter.match({
  "location": "ScenarioOutline.the_user_is_in_add_triff_paln_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user fill the valid detail \"400\",\"200\",\"700\",\"250\",\"850\",\"550\",\"100\"",
  "keyword": "When "
});
formatter.match({
  "location": "ScenarioOutline.the_user_fill_the_valid_detail(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click the submit button in add triff plan",
  "keyword": "When "
});
formatter.match({
  "location": "ScenarioOutline.the_user_click_the_submit_button_in_add_triff_plan()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the success message",
  "keyword": "Then "
});
formatter.match({
  "location": "ScenarioOutline.the_user_should_see_the_success_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@regerrsion"
    },
    {
      "name": "@user1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user is in add triff paln page",
  "keyword": "Given "
});
formatter.match({
  "location": "ScenarioOutline.the_user_is_in_add_triff_paln_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user fill the valid detail \"900\",\"200\",\"300\",\"250\",\"550\",\"550\",\"600\"",
  "keyword": "When "
});
formatter.match({
  "location": "ScenarioOutline.the_user_fill_the_valid_detail(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click the submit button in add triff plan",
  "keyword": "When "
});
formatter.match({
  "location": "ScenarioOutline.the_user_click_the_submit_button_in_add_triff_plan()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the success message",
  "keyword": "Then "
});
formatter.match({
  "location": "ScenarioOutline.the_user_should_see_the_success_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});