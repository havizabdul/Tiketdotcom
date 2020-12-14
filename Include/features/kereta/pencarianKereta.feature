Feature: Pencarian Kereta

  Scenario: Pencarian Kereta
    Given user berada pada homepage
    When user memilih menu kereta api
    Then user memilih stasiun asal
    And user memilih stasiun tujuan
    And user memilih tanggal keberangkatan
    And user memilih jumlah penumpang
    Then user memilih kereta