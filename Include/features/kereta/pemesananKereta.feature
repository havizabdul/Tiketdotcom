Feature: Pemesanan Kereta

  Scenario: Pemesanan Kereta
    Given user memilih kereta tujuan
    When user mengisi data pemesan
    Then user mengisi data penumpang
    And user memilih kursi kereta
    And user melanjutkan ke pembayaran kereta
