import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("/Users/jenny2443/UPM/AoC/ConcursoAoC2021/Dia01/src/input.txt");

        Scanner scan = new Scanner(myFile);

        int contador1 = 0;

        int inicio = 137;

        while (scan.hasNext()) {
            int prev = inicio;
            int sig = scan.nextInt();
            if (prev < sig) {
                contador1 = contador1 + 1;
                inicio = sig;
            }
                else{
                    contador1 = contador1;
                inicio = sig;
                }
            }


        System.out.println(contador1);
        }

    }

//1711

