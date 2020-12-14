Feature: Logout

  Scenario: Logout
    Given user memilih menu profil
    When user memilih fitur logout
    Then user melakukan konfirmasi logout
    And user menutup browser