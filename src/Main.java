/*

Napravi klasu student sa osnovnim informacijama (ime, prezime, broj indeksa)

Napravi 3 studenta unutar maina, te zapiši sve informacije o svakom studentu u datoteku koja
se naziva studenti.txt

Ispisi sve podatke u datoteku uredno strukturirano.

Nakon upisa podataka u datoteku prebroji koliko je slova zapisano u datoteci te ispisi tu informaciju korisniku.

*/


import java.io.*;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) throws IOException{
        Student student1 = new Student("Bruno", "Petković", 125);
        Student student2 = new Student("Angelina", "Jolie", 325);
        Student student3 = new Student("Donald", "Trump", 34);


        FileWriter writer = new FileWriter("Studenti.txt");
        writer.write(student1.toString() + "\n");
        writer.write(student2.toString() + "\n");
        writer.write(student3.toString() + "\n");
        writer.close();

        FileReader reader = new FileReader("Studenti.txt");
        int brojSlova = 0;
        int c;
        while ((c = reader.read()) != -1) {
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                brojSlova++;
            }
        }
        reader.close();
        
        System.out.println("Broj slova u datoteci je: " + brojSlova);
    }
}