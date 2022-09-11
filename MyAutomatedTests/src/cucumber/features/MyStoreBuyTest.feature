Feature: Loged User choose products added them to cart and buy

  Scenario: Loged User choose products added them to cart and buy on WebAplication on url https://mystore-testlab.coderslab.pl/index.php
    Given User opened url https://mystore-testlab.coderslab.pl
    When loged in on existing account
    And has selected Hummingbird Printed Sweater
    And has selected size
    And has selected 5 pieces
    And added its to card
    And clicked PROCEED TO CHECKOUT
    And confirmed Address
    And chosen pick up in store method of shipping
    And clicked on Pay by Check option
    And clicked on order with an obligation to pay option
    Then taken screenshot of confirmed order

