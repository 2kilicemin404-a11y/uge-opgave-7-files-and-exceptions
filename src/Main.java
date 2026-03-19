import java.util.Scanner;

public class Main {

    Scanner scan = new Scanner(System.in);

    public int promptNumber(String msg) {
        System.out.println(msg);
        try {
            return Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(" Didnt prompt number! ");
return promptNumber(msg);
        }
    }


}


