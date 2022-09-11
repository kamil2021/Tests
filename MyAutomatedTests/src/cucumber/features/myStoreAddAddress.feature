Feature: User can log in using proper data
#
#  Scenario: User loged in existing account on url https://mystore-testlab.coderslab.pl
#    Given User opened url https://mystore-testlab.coderslab.pl
#    When User clicked on SignIn button And clicked LogIn button after entered corect email and password
#    And clicked on View Customer Account button
#    And clicked on Adresses button
#    And clicked on Create new address button
#    And filed the form inputs: alias, address, city, zipCode, phone
#    And checked that entered data is correct
#    And clicked on save button
#    Then new address was created
  Scenario Outline: User loged in existing account on url https://mystore-testlab.coderslab.pl
    Given User opened url https://mystore-testlab.coderslab.pl
    When User clicked on SignIn button And clicked LogIn button after entered corect email and password
    And clicked on View Customer Account button
    And clicked on Adresses button
    And clicked on Create new address button
    And filed the form input: <alias>
    And filed the form inputt:<address>
    And filed the form inputx:<city>
    And filed the form inputy:<zipCode>
    And filed the form inputz:<phone>
    And choose the country
    And check that data in form is correct
    And clicked on save button
    Then phrase Address successfully added is visible
  Examples:
    |alias|address  |city |zipCode |phone    |
    |Jacek|polna 7  |Mława|06-500   |933666666|


