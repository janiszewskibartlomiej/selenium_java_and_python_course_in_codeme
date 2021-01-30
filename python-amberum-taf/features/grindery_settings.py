import pytest
from pytest_bdd import scenario, given, when, then

from page_objects.login_page import LoginPage
from page_objects.production_settings_page import ProductionSettingsPage
from page_objects.side_menu_page import SideMenuPage
from tools.webdriver_factory import WebdriverFactory


@pytest.fixture()
def driver():
    driver = WebdriverFactory().get_webdriver()
    yield driver
    driver.close()


@scenario('grindery_settings.feature', 'User changes grindery settings, providing correct values')
def test_user_changes_grindery_settings_correct(driver):
    pass


@given("User is logged in")
def test_step_impl(driver):
    driver.get("https://test.amberum.com")
    LoginPage(driver=driver).login()


@given("User is in Production Settings section")
def test_step_impl(driver):
    SideMenuPage(driver).go_to_production_setting()


@given("User reads current value for gridery working time card is expired")
def test_step_impl(driver):
    days = ProductionSettingsPage(driver).get_grindery_working_timecard_delay_days()
    print("\nLiczba dni obecnie ustawiona to: ", days)


@when("User enters 5 days for gridery working time card is expired")
def test_step_impl(driver):
    pass


@then("After page reload the value is different from reference value")
def test_step_impl(driver):
    pass


@given("Stores this value for references")
def step_impl():
    pass
