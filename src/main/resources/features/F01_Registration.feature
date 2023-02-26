@smoke
  Feature: F01_Registration | guest users could create new accounts

    Scenario: create new account with a valid data
      Given user go to register page
      When user click on gender
      And user type firstName&LastName
      And user choose his birthday
      And user enter his email
      And user enter password
      And user enter confirmPass
     And user click on register button
     Then user assert success register

