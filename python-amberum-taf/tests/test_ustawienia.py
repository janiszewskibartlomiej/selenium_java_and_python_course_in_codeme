from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as ec
from selenium.webdriver.support.ui import WebDriverWait

from page_objects.login_page import LoginPage
from tools.webdriver_factory import WebdriverFactory


class TestLogin:

    def setup_method(self, method):
        self.driver = WebdriverFactory().get_webdriver()
        self.driver.get("https://test.amberum.com")
        LoginPage(driver=self.driver).login()

    def teardown_method(self, method):
        self.driver.quit()

    def test_ustawienia(self):
        self.driver.find_element(By.XPATH, "// *[ @ id = 'settings'] / span[1]").click()
        nazwa = self.driver.find_element(By.XPATH, "//h2").text

        assert nazwa == "Lokacje"

    def test_ustawienia_lokacje(self):
        self.driver.find_element(By.XPATH, "// *[ @ id = 'settings'] / span[1]").click()
        WebDriverWait(self.driver, 10).until(
            ec.element_to_be_clickable((By.XPATH, "// *[ @ id = 'location']")))
        self.driver.find_element(By.XPATH, "// *[ @ id = 'location']").click()
        nazwa = self.driver.find_element(By.XPATH, "//h2").text

        assert nazwa == "Lokacje"

    def test_ustawienia_produkcja(self):
        self.driver.find_element(By.XPATH, "// *[ @ id = 'settings'] / span[1]").click()
        WebDriverWait(self.driver, 10).until(
            ec.element_to_be_clickable((By.XPATH, "// *[ @ id = 'settings-production']")))
        self.driver.find_element(By.XPATH, "// *[ @ id = 'settings-production']").click()
        nazwa = self.driver.find_element(By.XPATH, "//h2").text

        assert nazwa == "Produkcja"

    def test_ustawienia_stawki(self):
        self.driver.find_element(By.XPATH, "// *[ @ id = 'settings'] / span[1]").click()
        WebDriverWait(self.driver, 10).until(
            ec.element_to_be_clickable((By.XPATH, "// *[ @ id = 'settings-rates']")))
        self.driver.find_element(By.XPATH, "// *[ @ id = 'settings-rates']").click()
        nazwa = self.driver.find_element(By.XPATH, "//h2").text

        assert nazwa == "Stawki pracy"
