from selenium import webdriver
import time
import os
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.common.action_chains import ActionChains

browser = webdriver.Firefox()
# 警告框 text
# browser.get('file:///' + os.path.abspath("D:\\程序\\HTML\\alert.html"))
# browser.find_element_by_id("tooltip").click()
# time.sleep(6)
# alert = browser.switch_to.alert
# print(alert.text)
# time.sleep(2)
# alert.dismiss()
# time.sleep(2)


# 2，accept send_keys
browser.get('file:///' + os.path.abspath("D:\\程序\\HTML\\send.html"))
browser.find_element_by_xpath("/html/body/input").click()
time.sleep(2)
browser.switch_to.alert.send_keys("Sehun")
time.sleep(3)
# browser.switch_to.alert.accept()
browser.switch_to.alert.dismiss()
time.sleep(4)
browser.quit()
