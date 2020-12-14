Feature: Pembayaran Kereta

  Scenario: Pembayaran Kereta
    Given user memilih jenis pembayaran kereta
    When user melakukan pembayaran kereta
    Then user melihat daftar pesanan kereta
    And user menutup browser kereta