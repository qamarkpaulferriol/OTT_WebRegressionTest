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

WebUI.callTestCase(findTestCase('TC01_RegistrationEmail/TC01.1 Verify that email entered is invalid'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('TC01_RegistrationEmail/TC01.2 Verify that email entered reach maximum character'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('TC01_RegistrationEmail/TC01.3 Verify that Kapamilya Name entered have minimum character'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('TC01_RegistrationEmail/TC01.4 Verify that Kapamilya Name entered have maximum character'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('TC01_RegistrationEmail/TC01.5 Verify that kapamilya name does not accepts value that are all numeric'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('TC01_RegistrationEmail/TC01.6 Verify that kapamilya name does not accepts value in an email format'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('TC01_RegistrationEmail/TC01.7 Verify the maximum characters of FirstName'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('TC01_RegistrationEmail/TC01.8 Verify the maximum characters of LastName'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('TC01_RegistrationEmail/TC01.9 Verify the minimum character of Password'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('TC01_RegistrationEmail/TC01.10 Verify the maximum character of Password'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('TC01_RegistrationEmail/TC01.11 Verify when email is Registered'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('TC01_RegistrationEmail/TC01.12 Verify when kapamilya is Registered'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('TC01_RegistrationEmail/TC01.13 Verify a successful registration via Email'), [:], FailureHandling.CONTINUE_ON_FAILURE)

