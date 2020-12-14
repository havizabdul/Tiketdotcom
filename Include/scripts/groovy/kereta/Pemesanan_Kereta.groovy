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



class Pemesanan_Kereta {

	@Given("user memilih kereta tujuan")
	def user_memilih_kereta_tujuan() {
		WebUI.click(findTestObject('Object Repository/Object Kereta/button_Pilih'))
		WebUI.delay(2)
	}

	@When("user mengisi data pemesan")
	def user_mengisi_data_pemesan() {
		WebUI.setText(findTestObject('Object Repository/Object Kereta/input_Daftar_fullName'), 'Haviz Abdul')
		WebUI.delay(2)
		WebUI.setText(findTestObject('Object Repository/Object Kereta/input_Kode Negara_phone'), '81285035477')
		WebUI.delay(2)
		WebUI.setText(findTestObject('Object Repository/Object Kereta/input_Nomor Ponsel_emailAddress'), 'testingtiket@gmail.com')
		WebUI.delay(2)
	}

	@Then("user mengisi data penumpang")
	def user_mengisi_data_penumpang() {
		WebUI.click(findTestObject('Object Repository/Object Kereta/div_Sama dengan pemesan_lever'))
		WebUI.delay(2)
		WebUI.setText(findTestObject('Object Repository/Object Kereta/input_Titel_identityNumber'), '321794230890')
		WebUI.delay(2)
	}

	@And("user memilih kursi kereta")
	def user_memilih_kursi_kereta() {
		WebUI.click(findTestObject('Object Repository/Object Kereta/button_Pilih Kursi'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Object Kereta/div_C_seat                                 _937d92'))
		WebUI.delay(2)
	}

	@And("user melanjutkan ke pembayaran kereta")
	def user_melanjutkan_ke_pembayaran_kereta() {
		WebUI.click(findTestObject('Object Repository/Object Kereta/button_Lanjutkan ke Pembayaran'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Object Kereta/button_YA, LANJUTKAN'))
		WebUI.delay(2)
	}
}
