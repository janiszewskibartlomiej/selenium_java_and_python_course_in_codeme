# Wyrażenia regularne

Do przećwiczenia na stronie https://regex101.com

## Numer NIP

**Dane testowe**

```
-- poprawne
22-333-444-11
234-233-11-33
22-33-423-455
44-322-33-444
2344334484

-- niepoprawne
444-555-666-777
22-22-22-22
1-2233-222-33-2
```

Przykładowe rozwiązanie:

`^(\d{10}|\d{3}\-\d{3}\-\d{2}\-\d{2}|\d{2}\-\d{3}\-\d{3}\-\d{2}|\d{2}\-\d{2}\-\d{3}\-\d{3}|\d{2}\-\d{3}\-\d{2}\-\d{3})$`


## Imię i nazwisko

**Dane testowe**

```
Anna Kowalska
Zuzanna Malinowska-Dąbrowska

AnnaKowalska
Zuzanna
Zuzanna Malinowska-Dąbrowska1
```

## Numer telefonu

**Dane testowe**

```
+48 123222222
+48123222222
0048(52)2343342
(504)123456
504-123-456
```

# Numery PESEL

Utwórz testy generujące numer pesel oraz sprawdzające poprawność wygenerowanego numeru uwzględniając:

- osoby urodzone po 2000 roku
- osoby urodzone po roku 1900 i przed rokiem 2000
- poprawną cyfrę oznaczającą płeć

Rozwiązanie zadania powinno zawierać przynajmniej 4 test-case'y (po jednym dla kobiety i mężczyzny ze wskazanych przedziałów daty.

Reguły dla numeru pesel: https://pl.wikipedia.org/wiki/PESEL




