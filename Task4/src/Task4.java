import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("test");
        Scanner scanner = new Scanner(file);
        List<Integer> array = new ArrayList<>();
        while (scanner.hasNext()) {
            array.add(scanner.nextInt());
        }
        scanner.close();

        int number = 0;
        for (int i = 0; i <= array.size() - 1; i++) {
            if (i == array.size() - 1) {
                number += array.get(i);
                number /= i + 1;
            } else {
                number += array.get(i);
            }
        }

        int[] arrNum = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            arrNum[i] = array.get(i);
        }

        int numSum = 0;
        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] < number) {
                while (arrNum[i] != number) {
                    arrNum[i]++;
                    numSum++;
                }
            } else {
                while (arrNum[i] != number) {
                    arrNum[i]--;
                    numSum++;
                }
            }
        }
        System.out.println(numSum);

    }
}
