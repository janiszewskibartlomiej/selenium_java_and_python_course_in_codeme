# Komendy linuxowe, które mogą się przydać na warsztatach
* `mkdir <DIRNAME>` - utworzenie katalogu
* `pwd` - wyświetlenie obecnej lokalizacji pliku
* `cd <DIRNAME>` - wejście do katalogu o podanej nazwie
* `ls` - wyświetlenie zawartości bieżącego katalogu
    * `ls -al` - wyświetlenie zawartości katalogu w formacie listy włącznie z plikami i katalogami ukrytymi, których nazwa rozpoczyna się od `.`, np. `.git`
* `rm <FILENAME>` - usunięcie pliku
  * `rm -r <DIRNAME>` - usunięcie katalogu rekursywnie
  * `rm -rf *` - **OSTROŻNIE!** usunięcie wszystkich plików i katalogów z bieżącej lokalizacji
* `echo` - wyświetlenie tekstu na ekranie
  * `echo $PATH`
* `touch <FILENAME>` utworzenie pustego pliku