

//// opgave 1
//
//
//import java.util.Scanner;
//
//public class Main {
//
//    Scanner scan = new Scanner(System.in);
//
//    public int promptNumber(String msg) {
//        System.out.println(msg);
//        try {
//            return Integer.parseInt(scan.nextLine());
//        } catch (NumberFormatException e) {
//            System.out.println(" Didnt prompt number! ");
//return promptNumber(msg);
//        }
//    }
//
//
//}


// opgave 4
import java.util.ArrayList;
public class Main {

    void main(){

    ArrayList<String> data = new ArrayList<>();
data.add("Espresso, En kraftfuld og koncentreret kaffe, 25.0");
data.add("Latte, Espresso med dampet mælk, 45.0");
data.add("Cola, Kold og brusende, 30.0");
        data.add("Vand, Stille kildevand, gratis");

double samletPris = 0.0;
for ( String s : data){
    String[] values = s.split(",");
    String name = values[0].trim();
    String beskrivelse = values[1].trim();
    double pris = Double.parseDouble(values[2].trim());
    samletPris+= pris;
    System.out.println( name + " - " +  beskrivelse +  " " + " " + pris + "Kr" );
try {
    data.add("Vand, Stille kildevand, gratis");
}


}
}
}




