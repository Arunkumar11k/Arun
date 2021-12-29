Feature: verifying  adactin hotal booking details

  Scenario Outline: verifying adacting booking with valid credentails
    Given user is on the adactin page
    When user should enter "<username>" and "<password>"
    And user should click login button
    And user should enter search hotel "<location>""<Hotels>""<RoomType>""<Number of rooms>""<Check in date>""<Check out date>""<Adults per room>""<Children per room>"
    And user should click search button
    And user should select hotel and click continue button
    And user should Book a hotel "<firstname>""<lastname>""<Billing Adderss>""<Credit card number>""<Credit card type>""<Expiry month>""<Expiry year>""<CVV>"
    And user should click BookNow button
    And user should booking confirmation and getting the order id
    Then user should verify Succesful msg

    Examples: 
      | username         | password | location | Hotels      | RoomType | Number of rooms | Check in date | Check out date | Adults per room | Children per room | firstname | lastname | Billing Adderss | Credit card number | Credit card type | Expiry month | Expiry year | CVV |
      | Arunkumarkabaddi | Q22E7F   | Sydney   | Hotel Creek | Standard | 1 - One         | 28/12/2021    | 29/12/2021     | 1 - One         | 1 - One           | Arunkumar | k        | chennai         |   9876547689876569 | VISA             | February     |        2022 | 856 |
      | Arunkumarkabaddi | Q22E7F   | Sydney   | Hotel Creek | Standard | 1 - One         | 28/12/2021    | 29/12/2021     | 1 - One         | 1 - One           | Arunkumar | k        | chennai         |   9876547689876569 | VISA             | February     |        2022 | 856 |
      | Arunkumarkabaddi | Q22E7F   | Sydney   | Hotel Creek | Standard | 1 - One         | 28/12/2021    | 29/12/2021     | 1 - One         | 1 - One           | Arunkumar | k        | chennai         |   9876547689876569 | VISA             | February     |        2022 | 856 |
      | Arunkumarkabaddi | Q22E7F   | Sydney   | Hotel Creek | Standard | 1 - One         | 28/12/2021    | 29/12/2021     | 1 - One         | 1 - One           | Arunkumar | k        | chennai         |   9876547689876569 | VISA             | February     |        2022 | 856 |
      | Arunkumarkabaddi | Q22E7F   | Sydney   | Hotel Creek | Standard | 1 - One         | 28/12/2021    | 29/12/2021     | 1 - One         | 1 - One           | Arunkumar | k        | chennai         |   9876547689876569 | VISA             | February     |        2022 | 856 |
      | Arunkumarkabaddi | Q22E7F   | Sydney   | Hotel Creek | Standard | 1 - One         | 28/12/2021    | 29/12/2021     | 1 - One         | 1 - One           | Arunkumar | k        | chennai         |   9876547689876569 | VISA             | February     |        2022 | 856 |
      | Arunkumarkabaddi | Q22E7F   | Sydney   | Hotel Creek | Standard | 1 - One         | 28/12/2021    | 29/12/2021     | 1 - One         | 1 - One           | Arunkumar | k        | chennai         |   9876547689876569 | VISA             | February     |        2022 | 856 |
      | Arunkumarkabaddi | Q22E7F   | Sydney   | Hotel Creek | Standard | 1 - One         | 28/12/2021    | 29/12/2021     | 1 - One         | 1 - One           | Arunkumar | k        | chennai         |   9876547689876569 | VISA             | February     |        2022 | 856 |
      | Arunkumarkabaddi | Q22E7F   | Sydney   | Hotel Creek | Standard | 1 - One         | 28/12/2021    | 29/12/2021     | 1 - One         | 1 - One           | Arunkumar | k        | chennai         |   9876547689876569 | VISA             | February     |        2022 | 856 |
      | Arunkumarkabaddi | Q22E7F   | Sydney   | Hotel Creek | Standard | 1 - One         | 28/12/2021    | 29/12/2021     | 1 - One         | 1 - One           | Arunkumar | k        | chennai         |   9876547689876569 | VISA             | February     |        2022 | 856 |
      