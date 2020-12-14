package pembayaranHotel
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



class Detail_Pembayaran {

	@Given("user memilih jenis pembayaran")
	def user_memilih_jenis_pembayaran() {
		WebUI.click(findTestObject('Object Repository/div_BCA Virtual Account'))
		WebUI.delay(2)
	}

	@When("user melakukan pembayaran")
	def user_melakukan_pembayaran() {
		WebUI.click(findTestObject('Object Repository/button_Lanjutkan'))
		WebUI.delay(2)
	}

	@Then("user melihat daftar pesanan")
	def user_melihat_daftar_pesanan() {
		WebUI.click(findTestObject('Object Repository/button_Lihat Daftar Pesanan'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/button_Ke My Order'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/button_OK (1)'))
		WebUI.delay(2)
	}
}