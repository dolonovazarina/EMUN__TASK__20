import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String soz = scanner.nextLine();
        Nedelia nedelian = Nedelia.valueOf(soz.toUpperCase());
        switch (nedelian) {
            case MONDAY -> System.out.println(" Duishimbu kunu java okuim");
            case TUESDAY -> System.out.println("SHieshembi kun anglis tili sabagin okuim");
            case WEDNESDAY -> System.out.println("SHarshembi");
            case Thursday -> System.out.println("Paishambi");
            case FRIDAY -> System.out.println("Juma");
            case SATUDAY -> System.out.println("Ishembi");
            case SUNDDAY -> System.out.println("Jekshembi");

        }


    }

    @Override
    public String toString() {
        System.out.println("Nedelia");
        return null;
    }
}