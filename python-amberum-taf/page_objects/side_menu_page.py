from selenium.webdriver.common.by import By
from selenium.webdriver.remote.webelement import WebElement
from selenium.webdriver.support import expected_conditions as ec
from selenium.webdriver.support.ui import WebDriverWait


class SideMenuPage:

    def __init__(self, driver):
        self.driver = driver

    def go_to_production_setting(self):
        settings: WebElement = WebDriverWait(self.driver, 10).until(ec.element_to_be_clickable((By.ID, "settings")))
        settings.click()
        WebDriverWait(self.driver, 10).until(ec.element_to_be_clickable((By.ID, "settings-production"))).click()
