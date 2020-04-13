from selenium import webdriver
import time
import os
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.common.action_chains import ActionChains
browser = webdriver.Firefox()



# 对话框处理
# browser.get('file:///' + os.path.abspath("D:\\程序\\HTML\\modal.html"))
# browser.find_element_by_id("show_modal").click()
# time.sleep(2)
# browser.find_element_by_class_name("modal-body").find_element_by_id("click").click()
# time.sleep(3)
# buttons = browser.find_element_by_class_name("modal-footer").find_element_by_tag_name('button')
# buttons.click()
# time.sleep(2)
# browser.quit()




browser.get('file:///' + os.path.abspath("D:\\程序\\HTML\\upload.html"))
browser.find_element_by_name("file").send_keys("D:\\程序\\CESHI\\20200321\\src\\src0411\\041203.py")
time.sleep(3)
browser.quit()

