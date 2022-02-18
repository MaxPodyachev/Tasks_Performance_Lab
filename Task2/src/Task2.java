import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {

        File file1 = new File("file1");
        File file2 = new File("file2");

        Scanner scanner1 = new Scanner(file1);
        Scanner scanner2 = new Scanner(file2);

        String[] centre = (scanner1.nextLine()).split(" ");
        int diameter = scanner1.nextInt();

        int x = Integer.parseInt(centre[0]);
        int y = Integer.parseInt(centre[1]);

        while (scanner2.hasNextLine()) {
            String[] coordinates = (scanner2.nextLine()).split(" ");
            int x2 = Integer.parseInt(coordinates[0]);
            int y2 = Integer.parseInt(coordinates[1]);
            double v1 = Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2);
            double v2 = Math.pow(diameter, 2);

            if (v1 < v2) {
                System.out.println(1);
            } else if (v1 == v2) {
                System.out.println(0);
            } else {
                System.out.println(2);
            }
        }
        scanner1.close();
        scanner2.close();
    }
}
