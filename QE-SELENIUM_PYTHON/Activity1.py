from selenium import webdriver
from selenium.webdriver.common.by import By
import time


with webdriver.Firefox() as driver:
    driver.get("https://training-support.net")

    print (driver.title)

    driver.find_element(By.LINK_TEXT, "About Us").click()

    time.sleep(1)

    print(driver.title)


    driver.quit()