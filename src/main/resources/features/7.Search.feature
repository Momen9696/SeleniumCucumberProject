@smoke
Feature: Search Feature

  Scenario Outline: user wants to by a new item
    When  User enter name of "<products>" and click search
    Then  Searched products shall be appeared
    Examples:
      | products   |
      | phone      |
      | Gift Cards |
      | Jewelry    |

  Scenario Outline: user wants to by a new item
    When  User enter name of "<products>" and click search
    Then  Searched products shall be appeared
    Examples:
      | products  |
      | OM_HTC_BL |
      | PG_CR_050 |
      | EG_GEM_NL |


