### Lokalizatory XPath i indeksowanie

**Jak działa indeksowanie z nawiasem i bez nawiasu**

http://the-internet.herokuapp.com/challenging_dom

![image](/uploads/c50adb14d15daff2d203419a449ee68b/image.png)

* `(//td)[2]`  (kolor czerwony)

Tworzy listę wszystkich elementów td pasujących do xpath, czyli w tym wypadku wszystkich na stronie - 70 - i wybiera drugi z nich 

* `//td[2]`    (kolor niebieski)

Tworzy listy składające się z węzłów w relacji *rodzeństwo* - *sibling* i wybiera drugi na każdej z tych list. W tym wypadku mamy 10 wierszy `tr` po 7 elementów `td`, dlatego otrzymamy 10 wyników, zawierających 2 komórkę w każdym wierszu.

### Wykorzystanie Postman do przeprowadzania testów API

**Postman** to bardzo wygodne narzędzie do wykonywania operacji na protokole HTTP, w tym tworzenia zapytań *REST Api*.

Proponowane przypadki użycia:

1. Jako narzędzie pomocnicze do analizowania ruchu sieciowego wysyłanego i odbieranego z serwera. Pozwala na analizowanie niektórych problemów napotykanych w czasie pisania testów np. w Selenium.
2. Tworzenia zapytań REST i eksportowanie ich do wybranego języka programowania, wykorzystujemy do tego funkcję *Code snippet*, np:

    * Java
    
        ![image](/uploads/f2aee8802c403bda5ec193944738a54e/image.png)
 
    * Python
   
        ![image](/uploads/4aa4e806655f7cdada33452e3e3780a1/image.png)

    Testy piszemy w wybranym języku i frameworku testowym.
3. Jako platformę do pisania testów w języku **JavaScript**. 

    ![image](/uploads/111c7ee1097753ab154e6f403da84e59/image.png)

    Utworzone testy możemy wykonać z poziomu *command line*, korzystając z narzędzia **Newman**. Opis można znaleźć w dokumentacji Postmana: https://learning.postman.com/docs/running-collections/using-newman-cli/command-line-integration-with-newman/

    ![image](/uploads/71fe427fe29c64abe67c09e6e326ff30/image.png)
