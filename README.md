# sum-java
Projekt jest roawiązaniem zadania „Suma ciągu jedynkowego” z V Olimpiady Informatycznej (rok 1997/98).
Ciąg liczbowy o wartościach będących liczbami całkowitymi nazywamy jedynkowym, jeżeli 2
dowolne jego sąsiednie wyrazy różnią się od siebie dokładnie o 1 oraz jego pierwszy wyraz jest
równy 0.

## Opis metod i klas
Klasa publiczna Sequence zawiera metodę ciag, która odpowiada za konstrukcję ciągu jesynkowego, jeśli podane przez
użytkownika parametry są poprawne. Metoda najpierw sprawdza, czy taki ciąg istnieje, a
jesli tak to przypisuje wartość 0 dla a1 i konstruuje pozostałą część łańcucha, który na końcu
zostaje wypisany.

W klasie main następuje inicjacja zmiennych, przypisanie im wartości oraz wywołanie metody ciag, 
odpowiedzialnej za wygenerowanie ciągu jedynkowego na podstawie danychpodstawionych przez użytkownika. 
W klasie main uwzględniono też mechanizm obsługi błęędów i wyjątków, aby podawane zmienne były zgodne z założeniami.

## Schemat blokowy
<img src="https://github.com/NcnKuba13/sum-java/blob/main/screens/schem.png" width="444">

## Przykładowe zrzuty ekranu

#### Przykładowo wygenerowany ciąg.
<img src="https://github.com/NcnKuba13/sum-java/blob/main/screens/git.png" width="444">

#### Ciąg o podanych parametrach nie istnieje.
<img src="https://github.com/NcnKuba13/sum-java/blob/main/screens/nima.png" width="444">

#### Wprowadzenie błędnych wartości zmiennej S.
<img src="https://github.com/NcnKuba13/sum-java/blob/main/screens/zles1.png" width="444">
