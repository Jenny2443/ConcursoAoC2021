import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Dia2_1 {

    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("/Users/jenny2443/UPM/AoC/ConcursoAoC2021/Dia02/src/input.txt");
        Scanner scan = new Scanner(myFile);
        List<String> text = new ArrayList<>();
        while (scan.hasNext()) {
            text.add(scan.next());
        }
        System.out.println(text.size());

        int abajo = 0;
        int hor = 0;
        int aim = 0;
        for (int i = 0; i < text.size(); i = i + 2) {
            switch (text.get(i)) {
                case "forward":
                    hor += Integer.parseInt(text.get(i + 1));
                    abajo += aim * Integer.parseInt(text.get(i + 1));
                    break;
                case "up":
                    aim -= Integer.parseInt(text.get(i + 1));
                    break;
                case "down":
                    aim += Integer.parseInt(text.get(i + 1));
                    break;

            }
        }
        System.out.println(aim);
        System.out.println(hor);
        System.out.println(abajo * hor);


    }
}
