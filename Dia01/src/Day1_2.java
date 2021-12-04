import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day1_2 {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("/Users/jenny2443/UPM/AoC/ConcursoAoC2021/Dia01/src/input.txt");

        Scanner scan = new Scanner(myFile);

        ArrayList<Integer> conjuntos = new ArrayList<>();
        while(scan.hasNext()){
            conjuntos.add(scan.nextInt());
        }

        ArrayList<Integer> conjuntos3 = new ArrayList<>();
        for(int i = 2; i<conjuntos.size();i++){
            conjuntos3.add(conjuntos.get(i) + conjuntos.get(i-1) + conjuntos.get(i-2));
        }

        int contador = 0;
            for(int i=1;i<conjuntos3.size();i++){
                if(conjuntos3.get(i - 1) < conjuntos3.get(i)){
                    contador = contador +1;
                }
                else{
                    contador = contador;
                }
            }
        System.out.println(contador);

    }
}
//1743