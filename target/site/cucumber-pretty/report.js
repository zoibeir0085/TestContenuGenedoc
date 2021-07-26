$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/ContenuTest.feature");
formatter.feature({
  "name": "AddQuestionFeature",
  "description": "  This feature deals with the login functionality of the application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login with correct username and password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "name": "I navigate to the model page",
  "keyword": "Then "
});
formatter.step({
  "name": "I click to contenu",
  "keyword": "Then "
});
formatter.step({
  "name": "I add new section",
  "keyword": "Then "
});
formatter.step({
  "name": "I add subsection of picture",
  "keyword": "Then "
});
formatter.step({
  "name": "I add subsection of table",
  "keyword": "Then "
});
formatter.step({
  "name": "I add subsection of blue ball",
  "keyword": "Then "
});
formatter.step({
  "name": "I click New Folder Button",
  "keyword": "Then "
});
formatter.step({
  "name": "I enter \"\u003cDocument\u003e\"  , \"\u003cCharteGraphique\u003e\", \"\u003cRedacteurs\u003e\" and \"\u003cApprobateur\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "I verify the existence of the new section",
  "keyword": "Then "
});
formatter.step({
  "name": "I validate the report",
  "keyword": "Then "
});
formatter.step({
  "name": "I preview the report",
  "keyword": "Then "
});
formatter.step({
  "name": "I navigate to the model page",
  "keyword": "Then "
});
formatter.step({
  "name": "I click to contenu",
  "keyword": "Then "
});
formatter.step({
  "name": "I delete the section created",
  "keyword": "Then "
});
formatter.step({
  "name": "I close the browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "Document",
        "CharteGraphique",
        "Redacteurs",
        "Approbateur",
        "Reference",
        "Title",
        "Description",
        "Contenu"
      ]
    },
    {
      "cells": [
        "rgauvin@kpmg.fr",
        "aezan75",
        "CAC\\Rapport sur les comptes annuels",
        "Rapport_CAC seul.docx",
        "BELKACEM Amine",
        "BELKACEM Amine",
        "Test",
        "Test",
        "Test",
        "Test"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with correct username and password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "ContenuTest.iNavigateToTheLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"rgauvin@kpmg.fr\" and \"aezan75\"",
  "keyword": "And "
});
formatter.match({
  "location": "ContenuTest.iEnterUsernameAndPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click login button",
  "keyword": "And "
});
formatter.match({
  "location": "ContenuTest.iClickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the model page",
  "keyword": "Then "
});
formatter.match({
  "location": "ContenuTest.iNavigateToTheCreationOfNewFolderPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click to contenu",
  "keyword": "Then "
});
formatter.match({
  "location": "ContenuTest.iClickToScalingQuestion()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add new section",
  "keyword": "Then "
});
formatter.match({
  "location": "ContenuTest.iAddNewSection()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add subsection of picture",
  "keyword": "Then "
});
formatter.match({
  "location": "ContenuTest.iAddSubsectionOfPicture()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add subsection of table",
  "keyword": "Then "
});
formatter.match({
  "location": "ContenuTest.iAddSubsectionOfTable()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add subsection of blue ball",
  "keyword": "Then "
});
formatter.match({
  "location": "ContenuTest.iAddSubsectionOfBlueBall()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click New Folder Button",
  "keyword": "Then "
});
formatter.match({
  "location": "ContenuTest.iClickNewFolderButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"CAC\\Rapport sur les comptes annuels\"  , \"Rapport_CAC seul.docx\", \"BELKACEM Amine\" and \"BELKACEM Amine\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ContenuTest.iEnterAnd(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the existence of the new section",
  "keyword": "Then "
});
formatter.match({
  "location": "ContenuTest.iVerifyTheExistanceOfTheNewArticle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the report",
  "keyword": "Then "
});
formatter.match({
  "location": "ContenuTest.iValidateTheReport()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I preview the report",
  "keyword": "Then "
});
formatter.match({
  "location": "ContenuTest.iPreviewTheReport()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the model page",
  "keyword": "Then "
});
formatter.match({
  "location": "ContenuTest.iNavigateToTheCreationOfNewFolderPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click to contenu",
  "keyword": "Then "
});
formatter.match({
  "location": "ContenuTest.iClickToScalingQuestion()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I delete the section created",
  "keyword": "Then "
});
formatter.match({
  "location": "ContenuTest.iDeleteTheArticleCreated()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ContenuTest.iCloseTheBrowser()"
});
formatter.result({
  "status": "passed"
});
});