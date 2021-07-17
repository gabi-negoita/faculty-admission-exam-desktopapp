package rowsgenerator;

public class CandidatRowsGenerator {

    public static void main(String[] args) {

        int cod = 10001;
        
        String[] an = {"97", "98", "99"};
        
        String[] luna = {"01", "02", "03", "04", "05",
            "06", "07", "08", "09", "10", "11", "12"};
        
        String[] ziua = {"01", "02", "03", "04", "05",
            "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17",
            "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        
        String[] jud = {"01", "02", "03", "04", "05",
            "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17",
            "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31",
            "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45",
            "46", "47", "48", "49", "50", "51", "52"};
        
        String[] nume = {
            "Popescu",
            "Ionescu",
            "Bololoi",
            "Danciu",
            "Petrescu",
            "Chiciroiu",
            "Haidu",
            "Mocanu",
            "Bejan",
            "Sandu",
            "Negoita",
            "Stratulat",
            "Popa",
            "Serea",
            "Craciun",
            "Neagu",
            "Nitu",
            "Vasilescu",
            "Cojocaru",
            "Grigore",
            "Anastasiu",
            "Ciofu",
            "Stoica",
            "Gavrila",
            "Dinu"};

        char[] init = {'A', 'B', 'C', 'D', 'E', 'F', 'G',
            'H', 'I', 'J', 'L', 'M', 'N', 'O', 'P', 'R',
            'S', 'T', 'U', 'V'};

        String[] prenume_b = {
            "Mihai",
            "Dorin",
            "Ion",
            "Daniel",
            "Gabriel",
            "Iulian",
            "Paul",
            "Andrei",
            "Bogdan",
            "Dragos",
            "Rares",
            "Alexandru",
            "Catalin",
            "Aurelian",
            "Cristian",
            "Marian",
            "Manuel",
            "Sorin",
            "George",
            "Adrian",
            "Madalin",
            "Raul",
            "Valentin",
            "Razvan",
            "Niculae"};
        
        String[] prenume_f = {
            "Mihaela",
            "Madalina",
            "Ioana",
            "Daniela",
            "Ionela",
            "Iuliana",
            "Paula",
            "Andreea",
            "Bianca",
            "Adelina",
            "Alina",
            "Corina",
            "Catalina",
            "Elisa",
            "Marina",
            "Gabriela",
            "Cristina",
            "Monica",
            "Elena",
            "Adriana",
            "Andra",
            "Raluca",
            "Valentina",
            "Oana",
            "Maria"};

        String[] liceu = {
            "Colegiul National M. Kogalniceanu",
            "Colegiul National C. Negri",
            "Colegiul National V. Alecsandri",
            "Colegiul National Al. I. Cuza",
            "Colegiul National Spiru Haret",
            "Liceul Teoretic E. Racovita",
            "Colegiul National C. Hogas",
            "Liceul Teoretic M. Eliade",
            "Liceul Teoretic Dunarea",
            "Colegiul Economic"};

        for (int i = 0; i < 50; i++) {
            int index;

            System.out.print("INSERT INTO candidat VALUES (");

            // cod
            System.out.print(cod + ", '");

            // nume
            index = Randomizer.generate(0, nume.length - 1);
            System.out.print(nume[index] + "', '");

            // initiala tata
            index = Randomizer.generate(0, init.length - 1);
            System.out.print(init[index] + "', '");

            if (Math.round(Math.random()) > 0.5) {
                // prenume baiat
                index = Randomizer.generate(0, prenume_b.length - 1);
                System.out.print(prenume_b[index] + "', '");

                //cnp baiat
                System.out.print("1");
            } else {
                // prenume fata
                index = Randomizer.generate(0, prenume_f.length - 1);
                System.out.print(prenume_f[index] + "', '");

                // cnp fata
                System.out.print("2");
            }

            // cnp - an
            index = Randomizer.generate(0, an.length - 1);
            String a = an[index];
            System.out.print(a);

            // cnp - luna
            index = Randomizer.generate(0, luna.length - 1);
            String l = luna[index];
            System.out.print(l);

            switch (l) {
                case "01":
                    l = "01";
                    index = Randomizer.generate(0, ziua.length - 1);
                    break;
                case "02":
                    l = "02";
                    index = Randomizer.generate(0, ziua.length - 4); // intre 0 si 27 (pozitia 27 are valoarea "28")
                    break;
                case "03":
                    l = "03";
                    index = Randomizer.generate(0, ziua.length - 1);
                    break;
                case "04":
                    l = "04";
                    index = Randomizer.generate(0, ziua.length - 2);
                    break;
                case "05":
                    l = "05";
                    index = Randomizer.generate(0, ziua.length - 1);
                    break;
                case "06":
                    l = "06";
                    index = Randomizer.generate(0, ziua.length - 2);
                    break;
                case "07":
                    l = "07";
                    index = Randomizer.generate(0, ziua.length - 1);
                    break;
                case "08":
                    l = "08";
                    index = Randomizer.generate(0, ziua.length - 1);
                    break;
                case "09":
                    l = "09";
                    index = Randomizer.generate(0, ziua.length - 2);
                    break;
                case "10":
                    l = "10";
                    index = Randomizer.generate(0, ziua.length - 1);
                    break;
                case "11":
                    l = "11";
                    index = Randomizer.generate(0, ziua.length - 2);
                    break;
                case "12":
                    l = "12";
                    index = Randomizer.generate(0, ziua.length - 1);
                    break;
            }

            // cnp - ziua
            String z = ziua[index];
            System.out.print(z);

            // cnp - cod judet
            index = Randomizer.generate(0, jud.length - 1);
            System.out.print(jud[index]);

            // cnp - numar de 3 cifre random (calculat intr-un fel, dar nu conteaza)
            System.out.print(Randomizer.generate(100, 999));

            // cnp - numar de 1 cifra random (calculat intr-un fel, dar nu conteaza)
            System.out.print(Randomizer.generate(0, 9) + "', '");

            // data nastere - an
            System.out.print("19" + a + "-");
            
            // data nastere - luna
            System.out.print(l + "-");
            
            // data nastere - zi
            System.out.print(z + "', '");

            // nume liceu
            index = Randomizer.generate(0, liceu.length - 1);
            System.out.print(liceu[index] + "', ");

            // medie liceu
            System.out.print(String.format("%.2f", 7 + (Math.random() * ((10 - 7)))) + ", ");

            // medie bac
            System.out.print(String.format("%.2f", 7 + (Math.random() * ((10 - 7)))) + ");");

            cod++;
            System.out.println();
        }

    }

}

class Randomizer {

    public static int generate(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
