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



class Pembayaran_Kereta {

	@Given("user memilih jenis pembayaran kereta")
	def user_memilih_jenis_pembayaran_kereta() {
		WebUI.click(findTestObject('Object Repository/Object Kereta/div_BCA Virtual Account'))
		WebUI.delay(2)
	}

	@When("user melakukan pembayaran kereta")
	def user_melakukan_pembayaran_kereta() {
		WebUI.click(findTestObject('Object Repository/Object Kereta/button_Lanjutkan'))
		WebUI.delay(2)
	}

	@Then("user melihat daftar pesanan kereta")
	def user_melihat_daftar_pesanan_kereta() {
		WebUI.click(findTestObject('Object Repository/Object Kereta/button_Lihat Daftar Pesanan'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Object Kereta/button_Ke My Order'))
		WebUI.delay(2)
	}

	@And("user menutup browser kereta")
	def user_menutup_browser_kereta() {
		WebUI.closeBrowser()
	}
}