import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.tiket.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Object Kereta/a_Tiket Kereta Api'))

WebUI.click(findTestObject('Object Repository/Object Kereta/button_OK'))

WebUI.click(findTestObject('Object Repository/Object Kereta/input_Dari_input-airport'))

WebUI.click(findTestObject('Object Repository/Object Kereta/div_GMR'))

WebUI.scrollToElement(findTestObject('Object Repository/Object Kereta/div_JakartaGambir'), 3)

WebUI.click(findTestObject('Object Repository/Object Kereta/div_YK'))

WebUI.click(findTestObject('Object Repository/Object Kereta/div_21'))

WebUI.click(findTestObject('Object Repository/Object Kereta/button_Selesai'))

WebUI.click(findTestObject('Object Repository/Object Kereta/button_Cari Kereta Api'))

WebUI.click(findTestObject('Object Repository/Object Kereta/button_Pilih'))

WebUI.setText(findTestObject('Object Repository/Object Kereta/input_Daftar_fullName'), 'Haviz Abdul')

WebUI.setText(findTestObject('Object Repository/Object Kereta/input_Kode Negara_phone'), '81285035477')

WebUI.setText(findTestObject('Object Repository/Object Kereta/input_Nomor Ponsel_emailAddress'), 'testingtiket@gmail.com')

WebUI.click(findTestObject('Object Repository/Object Kereta/div_Sama dengan pemesan_lever'))

WebUI.setText(findTestObject('Object Repository/Object Kereta/input_Titel_identityNumber'), '321794230890')

WebUI.click(findTestObject('Object Repository/Object Kereta/button_Pilih Kursi'))

WebUI.click(findTestObject('Object Repository/Object Kereta/div_C_seat                                 _937d92'))

WebUI.click(findTestObject('Object Repository/Object Kereta/button_Lanjutkan ke Pembayaran'))

WebUI.click(findTestObject('Object Repository/Object Kereta/button_YA, LANJUTKAN'))

WebUI.click(findTestObject('Object Repository/Object Kereta/div_BCA Virtual Account'))

WebUI.click(findTestObject('Object Repository/Object Kereta/button_Lanjutkan'))

WebUI.click(findTestObject('Object Repository/Object Kereta/button_Lihat Daftar Pesanan'))

WebUI.click(findTestObject('Object Repository/Object Kereta/button_Ke My Order'))

WebUI.closeBrowser()

