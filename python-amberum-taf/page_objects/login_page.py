import os

from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as ec
from selenium.webdriver.support.ui import WebDriverWait


class LoginPage:

    def __init__(self, driver):
        self.driver = driver

    def login(self):
        login_box = WebDriverWait(self.driver, 10).until(
            ec.element_to_be_clickable((By.ID, "login"))
        )

        login_box.send_keys(os.environ["LOGIN_USER"])
        self.driver.find_element(By.ID, "password").send_keys(os.environ["LOGIN_PASSWORD"])
        self.driver.find_element(By.ID, "doLogin").click()

        menu = WebDriverWait(self.driver, 5).until(
            ec.visibility_of_element_located((By.ID, "side-menu"))
        )