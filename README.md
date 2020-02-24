# Java - Exam 1 

## Schreibe einen Primzahl-Checker (50 Punkte)

Schreib ein Programm, dass eine Zahl von der Konsole einliest und prüft ob es sich um eine Primzahl handelt oder nicht. 
Eine Primzahl ist eine Zahl, die nur durch sich selbst und 1 teilbar ist. 

Einige Beispiele:
11, 17, 37, 23, 89 sind Primzahlen. 
34, 66, 52 sind keine Primzahlen.

## Römische Zahlen (30 Punkte)

Schreibe ein Programm, dass eine positive Zahl zwischen 0 und 100 von der Konsole einliest und ihre Repräsentation im römischen Zahlensystem ausgibt. Im römischen Zahlensystem werden Zahlen als Summen dargestellt:

 I=1
 V=5
 X=10
 L=50
 C=100
 
 Einige Beispiele: 
 7 = VII
 8 = VIII
 9 = IX
 93 = XCIII

Einige Regeln für das Übersetzen 
* Zeichen dürfen maximal 3-mal nebeneinander verwendet werden (XXX = 30, III = 3)
* Steht eine kleinere Einheit vor einer größeren subtrathiert man diese (IV = 4 "eins vor fünf", XC = 90 "10 vor hundert")

## Programmauswertung (10 Punkte)

Wie sieht die Ausgabe dieses Programms aus? 

```java
int number = 12; 
System.out.println(number/5);
System.out.println(number/5.0);
number += 7; 
System.out.println(number);
```

* Antwort: 
```java
2
2.4
19
```

## Datentypen (5 Punkte)

Welche Datentypen kennst du? 
Gibt es Unterschiede bei der Verwendung zwischen einem `int` und einem `Integer`? 

* Antwort a: 
  * int = integer, ganze Zahlen bis zu einem gewissen Zahlenraum
  * double = Kommazahlen
  * long = langer integer, ebenfalls ganze Zahlen, aber mit einem größeren Zahlenraum
  * String = Zeichenkette, wird mit "..." initialisiert
  * char = einzelnes Zeichen, wird mit '...' initialisiert
  * float = ebenfalls Kommazahlen
  * boolean = kann 2 Werte haben, entweder true oder false
* Antwort b: `int` ist ein primitiver Datentyp, `Integer` ein komplexer, so wie `String` ein komplexer Datentyp ist. Komplexe Datentypen werden für Wrapperklassen verwendet.


## Scope (5 Punkte) 

Was ist der Scope einer Variable? 
Erkläre anhand eines kleinen Beispielprogramms.

* Antwort: Der Scope einer Variable ist der Lebensraum in welcher die Variable existiert. Variablen existieren immer nur innerhalb der geschwungenen Klammern, in denen sie deklariert werden. 
Wenn man zum Beispiel, eine Variable innerhalb einer for-Schleife deklariert, wird sie außerhalb dieser Schleife nicht erkannt.
* Beispiel: 
```java
public class Main {

     public static void main(String[] args) {

         for (int i = 0; i < 10; i++) {
             
         }

         System.out.println(i);
     }
}
```
Erklärung: in dieser for-Schleife wird die Variable `i` deklariert und initialisiert. wird dieses Programm ausgeführt, so wird für das ```System.out.println(i)``` außerhalb der Schleife ein Fehler angezeigt, da für das Programm die Variable `i` außerhalb der Schleife nicht existiert.
