package pencarianHotel
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

class Pencarian_Hotel {

	@Given("user berada pada homepage tiket dot com")
	def user_berada_pada_homepage_tiket_dot_com() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.tiket.com/')
		WebUI.maximizeWindow()
	}

	@When("user memilih menu hotel")
	def user_memilih_menu_hotel() {
		WebUI.click(findTestObject('Object Repository/a_Hotel'))
		WebUI.delay(2)
	}

	@Then("user memilih lokasi tujuan")
	def user_memilih_lokasi_tujuan() {
		WebUI.click(findTestObject('Object Repository/input_Tujuan_destination'))
		WebUI.delay(2)
		WebUI.setText(findTestObject('Object Repository/input_Tujuan_destination'), 'verse luxe')
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/div_Verse Luxe Hotel Wahid Hasyim'))
		WebUI.delay(2)
	}

	@And("user memilih tanggal checkin dan tanggal checkout")
	def user_memilih_tanggal_checkin_dan_tanggal_checkout() {
		WebUI.click(findTestObject('Object Repository/div_20'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/div_25'))
		WebUI.delay(2)
	}

	@And("user memilih jumlah kamar dan tamu")
	def user_memilih_jumlah_kamar_dan_tamu() {
		WebUI.click(findTestObject('Object Repository/div_Tamu_btn-operation'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/button_Selesai'))
		WebUI.delay(2)
	}

	@And("user memilih cari hotel")
	def user_memilih_cari_hotel() {
		WebUI.click(findTestObject('Object Repository/button_Cari Hotel'))
		WebUI.delay(5)
	}
}