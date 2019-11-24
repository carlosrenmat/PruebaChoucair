#language:en

Feature: List of jobs offered in the city of Medellin

  Scenario: Carlos, wants to work in the city of medellin in the company
    Given enter the page in the works section
    When  wants to see the list of jobs in the city of medellin
    |location|
    |Medellin|
    Then wants to visualize the works in the city of medellin Búsqueda completada. Encontrados 4 registros.

  Scenario: Carlos, wants to work in the city of Quibdo in the company
    Given enter the page in the works section choucair
    When  wants to see the list of jobs in the city of Quibdo
      |locationQ|
      |quibdo|
    Then wants to visualize the works in the city of QuibdoNo hay trabajos correspondientes a tu búsqueda.

  Scenario: Carlos, he wants the editbox not to admit numbers
    Given enter the page in the works section choucair jobs
    When  wants to enter numbers in the editbox of the choucair works section
      |locationC|
      |&/#R(#)|
    Then wants the editbox to not support numbersNo hay trabajos correspondientes a tu búsqueda.