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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://shop.demoqa.com/')

WebUI.click(findTestObject('Object Repository/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/a_Dismiss'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/a_My Account'))

WebUI.setText(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input__username'), 'Andri58_')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input__password'), 'obuXuBMAvwtN8qCm3s7dgg==')

WebUI.click(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input__rememberme'))

WebUI.click(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/a_Checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_first_name'), 'Andri')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_last_name'), 'Yansyah')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input_(optional)_billing_company'), 'PT.KPI')

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/span_Indonesia'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_address_1'), 'Jl.Pondok')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_city'), 'Tangerang')

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/span_Banten'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_postcode'), '15158')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_phone'), '0899938338')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_email'), 'andriyansyah933@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/textarea_(optional)_order_comments'), 'sesui ukuran')

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input_privacy policy_terms'))

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/button_Place order'))

WebUI.closeBrowser()

