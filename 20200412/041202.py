from selenium import webdriver
import time, os
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.common.action_chains import ActionChains
browser = webdriver.Firefox()


# 定位一组元素
# browser.get('file:///' + os.path.abspath("D:\\程序\\HTML\\checkbox.html"))
# inputs = browser.find_elements_by_tag_name("input")
# time.sleep(3)
# for input in inputs:
#     if input.get_attribute('type') == "checkbox":
#         input.click()
# time.sleep(6)



# 多层框架/窗口定位
# browser.get('file:///' + os.path.abspath("D:\\程序\\HTML\\frame.html"))
# browser.implicitly_wait(10)
# browser.switch_to.frame("f1")
# browser.switch_to.frame("f2")
# browser.find_element_by_id("kw").send_keys("吴世勋")
# browser.find_element_by_id("su").click()
# browser.switch_to.default_content()
# browser.switch_to.frame("f1")
# browser.find_element_by_link_text("click").click()
# time.sleep(3)


# 3,层级定位
# browser.get('file:///' + os.path.abspath("D:\\程序\\HTML\\level_locate.html"))
# browser.find_element_by_link_text("Link1").click()
# time.sleep(3)
# 定义一个大的URL，再找Action
# menu = browser.find_element_by_id("dropdown1").find_element_by_link_text("Action")
# ActionChains(browser).move_to_element(menu).perform()
# time.sleep(4)



# 4, 下拉框处理
browser.get('file:///' + os.path.abspath("D:\\程序\\HTML\\drop_down.html"))
browser.find_element_by_id("ShippingMethod").click()
browser.find_element_by_xpath("/html/body/select/option[3]").click()
# ship = browser.find_element_by_id("ShippingMethod")
# # ship.find_element_by_xpath("//*[@ value = '10.69']").click()
# ship.find_element_by_xpath("//option[@ value = '10.69']").click()
time.sleep(4)
browser.quit()