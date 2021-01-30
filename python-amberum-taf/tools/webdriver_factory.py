import os

from selenium import webdriver


class WebdriverFactory:

    def get_webdriver(self):
        return self.get_chromedriver()
        # return self.get_firefoxdriver()
        # return self.get_edgedriver()

    def get_chromedriver(self):
        driver_path = os.environ.get("WEBDRIVER_CHROME_PATH")
        return webdriver.Chrome(executable_path=driver_path)

    def get_firefoxdriver(self):
        driver_path = os.environ["WEBDRIVER_FIREFOX_PATH"]
        return webdriver.Firefox(executable_path=driver_path)

    def get_edgedriver(self):
        driver_path = os.environ["WEBDRIVER_EDGE_PATH"]
        return webdriver.Edge(executable_path=driver_path)
