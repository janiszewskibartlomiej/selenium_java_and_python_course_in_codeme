# selenium

ryzyka w AT

1. paradoks pestycydow - at wykonuje w ciaz tak samo a mnualanie mozna wprowadzic drobne inne zachowania ktore wyryja blad. insekty uatparniaja sie na pestycydy. podobnie moze byc z przypadkiem testowym na AT bo zawsze 5+5 = 10 
2. falszywie przechodza lub negatywnie failuja


xpath - (//h2)[2]  drugi elemnet ze wszytskich h2  - nie jako lista wwszytskich h2 w () i drugi element - w tym wypadku indexowanie jest od 1 a nie jak w jezykach programowania od 0

bardzo ciekawa funkcjonalnosc xpath https://www.w3schools.com/xml/xpath_axes.asp  odnosnie relacji do parent, child and siblings

potomek to elemnet kilka zagniezdzen dalej

ciekawy przyklad https://pl.wikipedia.org/wiki/Gda%C5%84sk

//table//node()[contains(text(), 'Prezydent')]/ancestor::tr/child::td[2]

//table//node()[contains(text(), 'Prezydent')]/ancestor::tr/td[2]

ancestor::  - przodek [czyli nad rodzicem]

div > p - rodzicem el p jest div

div p  - potomkiem div jet p

dobra praktyka to jezeli mam test case na np wpisanie slamandry to tylko to sprawdzamy a nie poten np klik na link nie zwiazany z ttym testem

Regex  -- mozemy tworzyc grupy i wyciagac dane jako nazwa gruy

np  23-11-2021

(?<dzien>\d{2})\-(?<miesiac>\d{2})

Python implementation
m = re.match(r'(?P<first>\w+) (?P<last>\w+)', 'Jane Doe')
>>> m.groupdict()

negazja wyraznei (?!cos tam)

WebElement.get_attribute(".//")   '.' kropka oznacza bierzacy elemnt i poprzez taka skladnie mozn aodwolac si edo elementu w elemencie !!

/	Selects from the root node
//	Selects nodes in the document from the current node that match the selection no matter where they are
.	Selects the current node
..	Selects the parent of the current node
@	Selects attributes  //@lang


WAITY

Wait - Fluent wait
Podobny do explicit wait, tylko zamiast ExpectedConditions określamy jakie
wyjątki mają być ignorowane.

wait = WebDriverWait(driver, 10, poll_frequency=1,
ignored_exceptions=[ElemntNotVisibleException, ElemntNotSelectableException])

elemnet = wait.until(EC.elemt_to_be_clickable((By.XPATH, "/div")))

attr = driver.find_elemnt(By.CSS_SELECTOR, "h1").tag_name

rectangle =  driver.find_elemnt(By.CSS_SELECTOR, "h1").rect

WebElement.value_of_css_property("color")

FindElements - wykonuje sie duzo szybciej niz szukanie pojedynczego elemntu ! warto go stosowac

NIe boimy sie dlugich nazw metod testowych, nazwa powinna byc znaczaca, opisujaca przypadek testowy

NIE JEST DOBRA PRAKTYKA W KONSTRUKTORZE PRZEJSC NA DANA STRONE !!!

na obiektac ActionChains warto dodac pause

    @Test
    void  jQueryTest(){
        // Given
        driver.get(URL_JQUERY);

        // When

        WebElement menu = driver.findElement(By.id("menu"));

        Actions builder = new Actions(driver);
        Action action = builder.moveToElement(menu)
                .moveToElement(driver.findElement(By.xpath("//a[@id='ui-id-2']")))
                .pause(Duration.ofSeconds(2))
                .moveToElement(driver.findElement(By.xpath("//a[@id='ui-id-5']")))
                .click()
                .build();
        action.perform();

        // Then
        Assertions.assertEquals("http://the-internet.herokuapp.com/jqueryui", driver.getCurrentUrl());


warto zrobic procedure przed testem np utworzenei user - i jego przyfotowanie arz metode czyszczaca before + procedura nap w bazie zeby czyscic wszystko z prefixem np test_...


czy stepy z posczegulengo scenariusza lub feture rozbija sie na osobne pliki >> raczej nei bo sa wspolne czesci np logowanie.

SELENIUM GRID

sciagnac https://selenium.dev/downloads/

odpalic w konsoli server z danej lokalizacji pliku `java -jar selenium-server-standalone-3.141.59.jar -role hub`

nastepnie odpalamy klienta - node  `java -Dwebdriver.chrome.driver=D://GITHUB//selenium_java_and_python_course_in_codeme//chromedriver.exe -jar selenium-server-standalone-3.141.59.jar -role node`

powyzej podajemy lokalizacje drivera i uruchamiamy klienta
