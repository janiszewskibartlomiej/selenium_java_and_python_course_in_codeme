from selenium.webdriver import Chrome
from selenium.webdriver.common.by import By


class ProductionSettingsPage:
    GRIDERY_SUBMENU = (By.XPATH, "//*[@id='accordion']/div[1]/div[1]/h5/a")
    GRIDERY_WORKING_TIMECARD_DELAY = (
        By.XPATH,
        "//label[contains(text(), 'szlifowania uznawana jest za opóźnioną')]/following-sibling::input",
    )

    def __init__(self, driver):
        self.driver: Chrome = driver

    def get_grindery_working_timecard_delay_days(self):
        self.driver.find_element(*self.GRIDERY_SUBMENU).click()
        days = self.driver.find_element(*self.GRIDERY_WORKING_TIMECARD_DELAY).get_attribute("value")
        return days
