package java32;

public class Persoana {

    public static String SPECIE = "homo-sapiens";

    //atribute
    String nume;
    int varsta;
    String adresa;
    //constrictor
    Persoana(){
        nume = "Maria";
        varsta = 25;
        adresa = "Str. Bucium, nr. 45";
    }
    Persoana(String nume, int varsta){
        this.nume = nume;
        this.varsta = varsta;
    }
    //metode
    void plimbare(){
        System.out.println("Eu ma plimb in parc");

    }
    void gateste(){
        System.out.println("Eu gatesc cina");
    }
    public static boolean respira(int dataDecedarii){
 //       if (dataDecedarii > 0){
//            return false;
//        }else {
//            return true;
//        }

        return dataDecedarii > 0? false :true;
    }

}
