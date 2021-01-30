import os
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as ec

from tools.webdriver_factory import WebdriverFactory


class TestLogin:

    def setup_method(self, method):
        self.driver = WebdriverFactory().get_webdriver()
        self.driver.get("https://test.amberum.com")

    def teardown_method(self, method):
        self.driver.quit()

    def test_login_successful(self):

        login_box = WebDriverWait(self.driver, 10).until(
            ec.element_to_be_clickable((By.ID, "login"))
        )

        login_box.send_keys(os.environ["LOGIN_USER"])
        self.driver.find_element(By.ID, "password").send_keys(os.environ["LOGIN_PASSWORD"])
        self.driver.find_element(By.ID, "doLogin").click()

        menu = WebDriverWait(self.driver, 5).until(
            ec.visibility_of_element_located((By.ID, "side-menu"))
        )

        assert menu.is_displayed()

