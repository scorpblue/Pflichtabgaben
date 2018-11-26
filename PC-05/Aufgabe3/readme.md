# Lastrada-Beispiel

Dieses Beispiel soll zeigen, wie man eine kleine Java-Anwendung organisieren kann, die aus mehreren "Domänenklassen" und eine Hauptklasse (bei uns: ```CMain```) besteht.

## Worum geht es?
*  Wir modellieren mehrere Autos, die am Anfang eines (gedachten) Straßenabschnitts stehen. 
*  Die Autos unterscheiden sich z.B. in der maximalen Geschwindigkeit
*  Jedes Auto hat einen Fahrer
*  Jeder Fahrer hat einen Fahrertyp (z.B. normal, entspannt, sportlich) und eine Wunschgeschwindigkeit
*  Fahrertyp und Wunschgeschwindigkeit bestimmen das Verhalten der Fahrer (in der Basisimplementierung beschleunigen wir nur, aber unterschiedlich stark)
*  Die Klasse CMain simuliert das Fahren der Autos über mehrere Zeitschritte und gibt die Geschwindigkeit und Position der Fahrzeuge zu verschiedenen Zeitpunkten aus

## Domänenklassen

*  CAuto: Wie in der Vorlesung gezeigt
*  CFahrer: Wird einem Auto zugeordnet und implementiert die Fahrstrategie 
*  EFahrerTyp: Enum Klasse, definiert unterschiedliche Fahrertypen
*  CMain: Ausführbare Klasse mit main()-methode

## Aufgabe
1. Compiliere das Beispiel und führe es aus
2. Versuche (beginnend mit der Klasse ```CMain.java```) die Struktur und die Logik des Programms zu verstehen
3. Ändere das Programm, so dass die Beschleunigung nicht nur vom Fahrertyp, sondern auch vom Auto abhängt
4. Entwickle eine Klasse ```CLkw```, die von ```CAuto``` erbt, eine Nutzlast (Maximalbeladung) und eine tatsächliche Beladung hat. Definiere das Fahrverhalten von ```CLkw```!
in der Methode ```CFahrer.fahre()``` unter Berücksichtigung der tatsächlichen Beladung (geringere Höchstgeschwindigkeit, langsamere Beschleunigung)
5. @Profis: Denk Dir eine Erweiterung des Fahrverhaltens (z.B. mit Nutzung von Schalten und Bremsen) aus und erweitere das Programm entsprechend.
6. @Profis: 
    * Informiert Euch über den professionellen Aufbau einer [Verzeichnisstruktur für Java-Projekte](https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html).
    * Organisiert den Beispiel-Code so um, dass alle Klassen zu einer Package ```lastrada``` gehören, der Quellcode in einem Unterverzeichnis ```src``` und die ```.class``` Dateien in einem Unterverzeichnis ```target``` liegen.

		
