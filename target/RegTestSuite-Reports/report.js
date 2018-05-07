$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Open application",
  "description": "",
  "id": "open-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5271435017,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "As a tenant I can login and see tenant dashboard",
  "description": "",
  "id": "open-application;as-a-tenant-i-can-login-and-see-tenant-dashboard",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I open Url",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.iOpenUrl()"
});
formatter.result({
  "duration": 15334476874,
  "status": "passed"
});
formatter.after({
  "duration": 121007547,
  "status": "passed"
});
});