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

WebUI.clearText(findTestObject('Registration_Objects/input_Password'))

WebUI.setText(findTestObject('Registration_Objects/input_Password'), '!qazxsw2')

WebUI.clearText(findTestObject('Registration_Objects/input_email'))

WebUI.setText(findTestObject('Registration_Objects/input_email'), 'dmdqa.210@gmail.com')

WebUI.submit(findTestObject('ValidationMessage_Objects/input_regSubmitButton'))

WebUI.verifyElementPresent(findTestObject('ValidationMessage_Objects/AlreadyRegistered/label_Oops The Email or Kapami'), 
    0)

WebUI.verifyElementText(findTestObject('ValidationMessage_Objects/AlreadyRegistered/label_Oops The Email or Kapami'), 'Oops! The Email or Kapamilya Name you provided is currently registered on iWantNOW.')

