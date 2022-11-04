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

WebUI.click(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/a_Search'))

WebUI.setText(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input_Type and Press Enter to Search_s'), 
    'Dress')

WebUI.sendKeys(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input_Type and Press Enter to Search_s'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Search Results for Dress  ToolsQA Demo Site/a_white milkmaid hook and eye bodycon midi dress'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_white milkmaid hook and eye bodycon mi_dddcd5/select_Choose an optionWhite'), 
    'white', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_white milkmaid hook and eye bodycon mi_dddcd5/select_Choose an optionMediumSmallX-Large'), 
    'x-large', true)

WebUI.click(findTestObject('Object Repository/Page_white milkmaid hook and eye bodycon mi_dddcd5/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_white milkmaid hook and eye bodycon mi_dddcd5/a_Search'))

WebUI.setText(findTestObject('Object Repository/Page_white milkmaid hook and eye bodycon mi_dddcd5/input_Type and Press Enter to Search_s'), 
    't shirt')

WebUI.sendKeys(findTestObject('Object Repository/Page_white milkmaid hook and eye bodycon mi_dddcd5/input_Type and Press Enter to Search_s'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Search Results for t shirt  ToolsQA Demo Site/a_nude satin pyjama style shirt'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_nude satin pyjama style shirt  ToolsQA_8a6b31/select_Choose an optionNude'), 
    'nude', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_nude satin pyjama style shirt  ToolsQA_8a6b31/select_Choose an option323436'), 
    '36', true)

WebUI.click(findTestObject('Object Repository/Page_nude satin pyjama style shirt  ToolsQA_8a6b31/button_Add to cart'))

WebUI.closeBrowser()

