## Lokalizatory XPath 

1. Zlokalizuj tytuł artykułu w Wikipedii

    Przejdź do strony z dowolnym artykułem.

    XPath bezwzględny: `/html/body/div/h1`

    XPath względny: `//h1`

2. Zlokalizuj nazwę miasta w tabeli

    Przejdź do strony z informacjami o mieście, np. Gdańsk

    `(//tbody/tr/td/span)[1]`

3. Zlokalizuj imię i nazwisko prezydenta dla danego miasta

    Przejdź do strony z informacjami o mieście, które posiada prezydenta (nie burmistrza)

    `//table//node()[contains(text(), "Prezydent")]/ancestor::tr/td[2]`