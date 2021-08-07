Feature:

  @marksAndSpencerSignIn
  Scenario: As a user, I should be able to signIn and should be able to go to profile page
    Given I am on the home page
    When I am on the signInMouseHover
    When I click on SignIn
    And I enter emailId as "vandana.sandeep.umredkar@gmail.com"
    And I enter password as "Piluvm@123"
    And I click on signIn button
    And I am on the schoolMouseHover
    And I click on dresses
    Then I should  be redirected to school dresses page and get relevant products.
