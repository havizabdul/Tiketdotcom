package kereta
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



class Pencarian_Kereta {

	@Given("user berada pada homepage")
	def user_berada_pada_homepage_tiket() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.tiket.com/')
		WebUI.maximizeWindow()
	}

	@When("user memilih menu kereta api")
	def user_memilih_menu_kereta_api() {
		WebUI.click(findTestObject('Object Repository/Object Kereta/a_Tiket Kereta Api'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Object Kereta/button_OK'))
		WebUI.delay(2)
	}

	@Then("user memilih stasiun asal")
	def user_memilih_stasiun_asal() {
		WebUI.click(findTestObject('Object Repository/Object Kereta/input_Dari_input-airport'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Object Kereta/div_GMR'))
		WebUI.delay(2)
	}

	@And("user memilih stasiun tujuan")
	def user_memilih_stasiun_tujuan() {
		WebUI.mouseOver(findTestObject('Object Repository/Object Kereta/div_Bandung'))
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/Object Kereta/div_JakartaGambir'), 3)
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Object Kereta/div_YK'))
		WebUI.delay(2)
	}

	@And("user memilih tanggal keberangkatan")
	def user_memilih_tanggal_keberangkatan() {
		WebUI.click(findTestObject('Object Repository/Object Kereta/div_21'))
		WebUI.delay(2)
	}

	@And("user memilih jumlah penumpang")
	def user_memilih_jumlah_penumpang() {
		WebUI.click(findTestObject('Object Repository/Object Kereta/button_Selesai'))
		WebUI.delay(2)
	}

	@Then("user memilih kereta")
	def user_memilih_kereta() {
		WebUI.click(findTestObject('Object Repository/Object Kereta/button_Cari Kereta Api'))
		WebUI.delay(2)
	}

}
