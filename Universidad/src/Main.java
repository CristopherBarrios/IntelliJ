import java.util.Scanner;

public class Main {
    public static String getMenu(boolean isTurnedOn) {
        if (!isTurnedOn) {
            return "Menu:\n" +
                    "\t1. Encender\n" +
                    "\t2. Salir\n";
        }

        return "Menu:\n" +
                "\t1. Nivel\n" +
                "\t2. Grado\n" +
                "\t3. Estudiante\n" +
                "\t4. Ver Nivel\n" +
                "\t5. Ver Grado\n" +
                "\t6. Ver Estudiante\n" +
                "\t7. Salir\n";
    }

    public static void main (String[] args) {
        boolean wantsToContinue = true;
        uni myRadio = new uni();

        do {
            System.out.println(myRadio);

            System.out.println(getMenu(myRadio.isTurnedOn()));

            System.out.print("Ingrese una opcion: ");
            Scanner input = new Scanner(System.in);
            int option = input.nextInt();

            if (myRadio.isTurnedOn()) {
                switch (option) {
                    case 1:
                        myRadio.turnOff();
                        break;
                    case 2:
                        myRadio.volumeUp();
                        break;
                    case 3:
                        myRadio.volumeDown();
                        break;
                    case 4:
                        myRadio.stationUp();
                        break;
                    case 5:
                        myRadio.stationDown();
                        break;
                    case 6:
                        if (myRadio.isInFM()) {
                            myRadio.changeToAM();
                        } else {
                            myRadio.changeToFM();
                        }
                        break;
                    case 7:
                        wantsToContinue = false;
                        break;
                    default:
                        System.out.println("Esta opcion no es valida!");
                        break;
                }
            } else {
                switch (option) {
                    case 1:
                        myRadio.turnOn();
                        break;
                    case 2:
                        wantsToContinue = false;
                        break;
                    default:
                        System.out.println("Esta opcion no es valida!");
                        break;
                }
            }

        } while (wantsToContinue);

        System.out.println("Adios");
    }
}
