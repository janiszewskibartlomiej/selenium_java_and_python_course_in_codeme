import resources.constansts as const

from page_objects.login_page import LoginPage
from page_objects.production_page import ProductionPage
from tools.webdriver_factory import WebdriverFactory


class TestProductionPage:

    def setup_method(self, method):
        self.driver = WebdriverFactory().get_webdriver()
        self.driver.get("https://test.amberum.com")
        LoginPage(driver=self.driver).login()

    def teardown_method(self, method):
        self.driver.quit()

    def test_production_submenu(self):
        # Given
        self.production_page = ProductionPage(driver=self.driver)
        self.production_page.go_to_production_page()

        # When
        production_button = self.production_page.get_production_button()
        submenu_dictionary: dict = self.production_page.get_production_submenu_dictionary()
        submenu_names = [el for el in submenu_dictionary.keys()]

        # Then
        assert self.driver.title == const.PRODUCTION_PAGE_TITLE

        assert production_button["Text"] == const.PRODUCTION
        assert production_button["Url"] == self.production_page.PRODUCTION_URL

        # When
        index = 0
        for submenu_element in submenu_dictionary.values():
            url = submenu_element.get_attribute("href")
            expect_name = submenu_names[index]

            # Then
            assert submenu_element.is_enabled()

            assert submenu_names[index] == submenu_element.text

            assert url == const.SUBMENU_URL_DICTIONARY[f"{expect_name}"]

            index += 1
