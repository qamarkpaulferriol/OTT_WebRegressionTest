import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.clearText(findTestObject('Login_Objects/input_username'))

WebUI.clearText(findTestObject('Login_Objects/input_Password'))

WebUI.click(findTestObject('Login_Objects/a_Forgot Kapamilya Name'))

WebUI.waitForPageLoad(0)

WebUI.navigateToUrl('https://ott-web-prod.azurewebsites.net/forgot-kapamilya-name')

'Account does not exist'
WebUI.setText(findTestObject('Login_Objects/input_EMail'), '012345678978')

WebUI.submit(findTestObject('Login_Objects/input_ott-page__submit-button'))

WebUI.verifyElementPresent(findTestObject('Login_Objects/ValidationMessage/label_Account does not exist.'), 0)

WebUI.verifyElementText(findTestObject('Login_Objects/ValidationMessage/label_Account does not exist.'), 'Account does not exist.')

WebUI.clearText(findTestObject('Login_Objects/input_EMail'))

'Email is incorrect'
WebUI.setText(findTestObject('Login_Objects/input_EMail'), 'dm')

WebUI.submit(findTestObject('Login_Objects/input_ott-page__submit-button'))

WebUI.verifyElementPresent(findTestObject('Login_Objects/ValidationMessage/label_Sorry the number you ent'), 0)

WebUI.verifyElementText(findTestObject('Login_Objects/ValidationMessage/label_Sorry the number you ent'), 'Sorry, the number you entered is invalid or incomplete. Please check and try again.')

WebUI.click(findTestObject('Login_Objects/Go Back/a_GO BACK'))

