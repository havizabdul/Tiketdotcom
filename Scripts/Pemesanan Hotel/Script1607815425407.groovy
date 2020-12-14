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

CucumberKW.runFeatureFile('include/features/Tiket/PencarianHotel.feature')
CucumberKW.runFeatureFile('include/features/Tiket/PemesananHotel.feature')
CucumberKW.runFeatureFile('include/features/Tiket/LoginFacebook.feature')
CucumberKW.runFeatureFile('include/features/Tiket/DetailPemesanan.feature')
CucumberKW.runFeatureFile('include/features/Tiket/DetailPembayaran.feature')
CucumberKW.runFeatureFile('include/features/Tiket/Logout.feature')

