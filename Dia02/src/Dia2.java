import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Spliterator;

public class Dia2 {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("/Users/jenny2443/UPM/AoC/ConcursoAoC2021/Dia02/src/input.txt");
        Scanner scan = new Scanner(myFile);
        List<String> text = new ArrayList<>();
        while(scan.hasNext()){
            text.add(scan.next());
        }

        /*int inicioAbajo = 0;
        int inicioHor = 0;

        for(int i = 1;i<=text.size();i = i+2){
            int abajo = inicioAbajo;
            int horizontal = inicioHor;
            if(text.get(i-1) == "forward"){
                horizontal = horizontal + ((Integer.parseInt(text.get(i))));
                inicioHor = horizontal;
                inicioAbajo = abajo;

            }
            else if(text.get(i-1) == "down"){
                abajo = abajo + (Integer.parseInt(text.get(i)));
                inicioHor = horizontal;
                inicioAbajo = abajo;
            }
            else if(text.get(i-1) == "up"){
                abajo = abajo - (Integer.parseInt(text.get(i)));
                inicioHor = horizontal;
                inicioAbajo = abajo;
            }
            else{
                i = i+2;
                inicioHor = horizontal;
                inicioAbajo = abajo;
            }
            System.out.println(abajo);
            System.out.println(horizontal);
        }*/

        int abajo = 0;
        int hor = 0;
        for(int i = 0; i<text.size();i= i+2) {
            switch(text.get(i)){
                case "forward":
                    hor += Integer.parseInt(text.get(i+1));
                    break;
                case "up":
                    abajo -= Integer.parseInt(text.get(i+1));
                    break;
                case "down":
                    abajo += Integer.parseInt(text.get(i+1));
                    break;

            }


        }

        System.out.println(abajo * hor);
        


    }
}
//1728414