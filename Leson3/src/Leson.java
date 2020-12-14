import java.util.Scanner;

public class Leson{
    public static void main(String[] args) {



      gin();



    }
    public static void gin(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите чесло: ");

        if (scanner.hasNextInt()){
            System.out.println("Вы вели = " + scanner.next());
        } else {
            System.out.println("Error");

        }

        //String b = (scanner.hasNextInt()) ? "Вы ввели = " + scanner.nextInt() : "Error.";


    }
}

