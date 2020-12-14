import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://www.tiket.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/a_Hotel'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/input_Tujuan_destination'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/div_JakartaIndonesiaREGION5897 Properti'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/div_20'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/div_25'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/div_Tamu_btn-operation'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/button_Selesai'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/button_Cari Hotel'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/h3_Verse Luxe Hotel Wahid Hasyim'),3)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/div_Verse Luxe Hotel Wahid HasyimTanah Aban_874833'))

WebUI.delay(3)

WebUI.switchToWindowTitle('Verse Luxe Hotel Wahid Hasyim, Jakarta Pusat Booking Murah di tiket.com')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/button_LIHAT KAMAR'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/button_Pilih'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/a_Log in'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/div_Masuk dengan Facebook'))

WebUI.switchToWindowTitle('Facebook')

WebUI.setText(findTestObject('Object Repository/input_Email address or phone number_email'), 'imhalf@live.com')

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('Object Repository/input_Password_pass'), '4q2dMIDOsmwRCZIbCjxGCA==')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/label_Password_loginbutton'))

WebUI.switchToWindowTitle('Form Pemesanan - tiket.com')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/input_Detail Pemesan_primary'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/div_Tuan'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/div_Sama seperti pemesan_lever'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/button_LANJUT KE PEMBAYARAN'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/div_BCA Virtual Account'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/button_Lanjutkan'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/button_Lihat Daftar Pesanan'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/button_Ke My Order'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/button_OK (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/span_HA'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/div_Keluar'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/div_YA'))

WebUI.closeBrowser()

