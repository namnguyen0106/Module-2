package lesson17;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {
    List<Product> productList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Product input() {
        System.out.println("Tên sản phẩm:");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Hãng sản phẩm:");
        String company = scanner.nextLine();
        System.out.println("Giá sản phẩm:");
//        scanner.nextLine();
        Double price = scanner.nextDouble();
        System.out.println("Mô tả sản phẩm");
        scanner.nextLine();
        String des = scanner.nextLine();
        return new Product(name, company, price, des);
    }

    public int menu() {
        System.out.println("1. Danh sách sản phẩm");
        System.out.println("2. Tạo sản phẩm");
        System.out.println("3. Tìm kiếm sản phẩm (theo tên)");
        System.out.println("0. Thoát chương trình");
        int input = scanner.nextInt();
        return input;
    }

    public void create(String path, Product product) {
        productList = readDataFromFile(path);
        product.setId(productList.size() + 1);
        productList.add(product);
        writeToFile(path, productList);
        System.out.println("\n" + "==================" + "\n");
    }

    public void getAll(String path) {
        List<Product> products = readDataFromFile(path);
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("\n" + "==================" + "\n");
    }

    public void search(String path) {
        System.out.println("Nhập tên sản phẩm:");
        scanner.nextLine();
        String name = scanner.nextLine();
        List<Product> products = readDataFromFile(path);
        for (Product product : products) {
            if (product.getName().contains(name)) {
                System.out.println(product + "\n" + "==================" + "\n");
            }
        }
    }

    public void writeToFile(String path, List<Product> productList) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(productList);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Product> readDataFromFile(String path) {
        List<Product> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            System.out.println("File không tồn tại hoặc chưa có sản phẩm"
                    + "\n" + "==================" + "\n");
//            ex.printStackTrace();
        }
        return students;
    }
}
