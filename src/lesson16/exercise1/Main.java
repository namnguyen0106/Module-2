package lesson16.exercise1;

import java.io.*;

public class Main {
    final static String SOURCE_PATH_FILE = "D:\\CODEGYM\\Code\\Module-2\\src\\lesson16\\exercise1\\from.txt";
    final static String TARGET_PATH_FILE = "D:\\CODEGYM\\Code\\Module-2\\src\\lesson16\\exercise1\\to.txt";
    public static void main(String[] args) {
        System.out.println(readFile(SOURCE_PATH_FILE));
        writeFile(TARGET_PATH_FILE, readFile(SOURCE_PATH_FILE));
    }

    private static String readFile(String filePath){
        StringBuilder str = new StringBuilder();
        String line = "";
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null) {
                str.append(line+ "\n");
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return str.toString();
    }

    public static void writeFile(String filePath, String content) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(content);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
