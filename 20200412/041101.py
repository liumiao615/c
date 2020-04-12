from selenium import webdriver
import time
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.action_chains import ActionChains
browser = webdriver.Firefox()
browser.get("http://www.baidu.com")
# 1,前进后退打印
# print(browser.title)
# print(browser.current_url)
# second_url = "https://www.cnblogs.com/richard-g/p/3592877.html"
# browser.get(second_url)
# print(browser.title)
# browser.back()
# time.sleep(2)
# browser.forward()
# time.sleep(2)


# 2，滚动条
# browser.find_element_by_id("kw").send_keys("吴世勋")
# browser.find_element_by_id("su").click()
# time.sleep(1)
# js = "var q=document.documentElement.scrollTop=10000"
# browser.execute_script(js)
# time.sleep(2)
# js = "var q=document.documentElement.scrollTop=0"
# browser.execute_script(js)
# time.sleep(2)


# 3,键盘
# 禅道登录
# browser.get("http://127.0.0.1:80/index.php")
# browser.find_element_by_link_text("企业版").click()
# browser.find_element_by_id("account").send_keys("admin")
# browser.find_element_by_id("account").send_keys(Keys.TAB)
# time.sleep(3)
# browser.find_element_by_name("password").send_keys("lmlmlm.615")
# time.sleep(3)
# browser.find_element_by_name("password").send_keys(Keys.ENTER)
# time.sleep(9)

# 全选 剪贴
# browser.find_element_by_id("kw").send_keys("slenium")
# time.sleep(2)
# browser.find_element_by_id("kw").send_keys(Keys.CONTROL, 'a')
# time.sleep(2)
# browser.find_element_by_id("kw").send_keys(Keys.CONTROL, 'x')
# time.sleep(5)
# browser.find_element_by_id("kw").send_keys("吴世勋")
# browser.find_element_by_id("su").click()
# time.sleep(4)


# 4,鼠标事件 (右键，双击，拖动)
browser.find_element_by_id("kw").send_keys("吴世勋")
browser.find_element_by_xpath("//*[@id='su']").click()
time.sleep(2)
qqq = browser.find_element_by_id("kw")
ActionChains(browser).context_click(qqq).perform()
ActionChains(browser).double_click(qqq).perform()
time.sleep(2)

begin = browser.find_element_by_id("kw")
time.sleep(2)
end = browser.find_element_by_link_text("吴世勋_百度百科")
time.sleep(2)
ActionChains(browser).drag_and_drop(end,begin).perform()
time.sleep(4)

browser.quit()