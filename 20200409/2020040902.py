from selenium import webdriver
import time
browser = webdriver.Firefox()
browser.get("https://www.baidu.com/")

# data = browser.find_elements_by_id("cp").text
# print(data)
browser.find_element_by_name("wd").send_keys("吴世勋")
# browser.find_element_by_xpath("//*[@id='su']").click()
browser.find_element_by_xpath("//*[@id='su']").submit()
# browser.find_element_by_css_selector("#kw").send_keys("吴世勋")
# browser.find_element_by_css_selector("#su").click()
browser.implicitly_wait(5)
browser.maximize_window()
time.sleep(3)
browser.minimize_window()
time.sleep(3)
browser.back()
browser.forward()
browser.set_window_size(800,1000)
time.sleep(3)
browser.find_element_by_link_text("吴世勋_百度百科").click()
# browser.find_element_by_partial_link_text("新闻").click()
print(browser.title)
print(browser.current_url)
time.sleep(5)
browser.quit()
