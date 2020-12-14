import java.util.Scanner;

public class Lesson_3{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите чесло: ");

        String b = (scanner.hasNextInt()) ? "Вы ввели = " + scanner.nextInt() : "Error.";

        System.out.println(b);



    }
}