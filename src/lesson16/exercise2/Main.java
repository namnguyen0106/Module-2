package lesson16.exercise2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    private static final String PATH_FILE = "D:\\CODEGYM\\Code\\Module-2\\src\\lesson16\\exercise2\\text.csv";
    public static void main(String[] args) {
        readFile(PATH_FILE);
    }

    private static void readFile(String filePath) {
        String line = "";
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null) {
                String[] strArr = line.split(",");
                System.out.println(strArr[strArr.length-1]);
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }
}
