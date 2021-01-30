from selenium.webdriver import Chrome
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as ec
from selenium.webdriver.support.ui import WebDriverWait


class ProductionPage:
    PRODUCTION_URL = "https://test.amberum.com/app/production/summary"
    PRODUCTION_LIST = (By.CSS_SELECTOR, "ul[class='nav nav-second-level collapse in'] > li > a")
    PRODUCTION_BUTTON = (By.ID, "production")

    def __init__(self, driver):
        self.driver: Chrome = driver

    def go_to_production_page(self):
        self.driver.get(self.PRODUCTION_URL)

    def get_production_submenu_dictionary(self) -> dict:
        elements = WebDriverWait(self.driver, 10).until(ec.visibility_of_all_elements_located(self.PRODUCTION_LIST))
        submenu = {
            "Woskownia": elements[0],
            "Odlewnia": elements[1],
            "Szlifiernia": elements[2],
            "Montaż": elements[3],
            "Galwanizacja": elements[4],
            "Mycie": elements[5],
            "Pakowanie": elements[6],
            "Bursztyn": elements[7]
        }
        return submenu

    def get_production_button(self) -> dict:
        button = WebDriverWait(self.driver, 10).until(ec.element_to_be_clickable(self.PRODUCTION_BUTTON))

        button_information = {
            "Text": button.text,
            "Url": button.get_attribute("href")
        }
        return button_information
