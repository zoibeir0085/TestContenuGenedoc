Feature: AddQuestionFeature
  This feature deals with the login functionality of the application

  Scenario Outline: Login with correct username and password
    Given I navigate to the login page
    And I enter "<username>" and "<password>"
    And I click login button
    Then I navigate to the model page
    Then I click to contenu
    Then I add new section
    Then I add subsection of picture
    Then I add subsection of table
    Then I add subsection of blue ball
    Then I click New Folder Button
    Then I enter "<Document>"  , "<CharteGraphique>", "<Redacteurs>" and "<Approbateur>"
    Then I verify the existence of the new section
    Then I validate the report
    Then I preview the report
    Then I navigate to the model page
    Then I click to contenu
    Then I delete the section created
    #Then I logout
    Then I close the browser
    Examples:
      | username        | password | Document                            | CharteGraphique       | Redacteurs     | Approbateur    | Reference | Title | Description | Contenu |
      | rgauvin@kpmg.fr | aezan75  | CAC\TEST model base -- test | Modele test | BELKACEM Amine | BELKACEM Amine | Test      | Test  | Test        | Test    |
