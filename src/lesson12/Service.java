package lesson12;

import java.util.*;

public class Service {
    List<Product> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public int menu() {
        int input = -1;
        System.out.println("1. Danh sách sản phẩm");
        System.out.println("2. Tạo sản phẩm");
        System.out.println("3. Sửa sản phẩm");
        System.out.println("4. Xóa sản phẩm");
        System.out.println("5. Tìm kiếm sản phẩm (theo tên)");
        System.out.println("6. Sắp xếp sản phẩm theo id (Tăng: ASC, Giảm: DESC)");
        System.out.println("0. Thoát chương trình");
        input = scanner.nextInt();
        return input;
    }

    public Product input() {
        System.out.println("Tên sản phẩm:");
        String name = scanner.nextLine();
        System.out.println("Giá sản phẩm:");
        Double price = scanner.nextDouble();
        System.out.println("Loại sản phẩm");
        String type = scanner.nextLine();
        return new Product(name, price, type);
    }

    public String create(Product product) {
        product.setId(list.size() + 1);
        list.add(product);
        return "Thành công!";
    }

    public String update(Product product) {
        if (Objects.isNull(list.get(product.getId()))) {
            return "Id sản phẩm không tồn tại!";
        }
        list.set(Math.toIntExact(product.getId()), product);
        return "Thành công";
    }

    public String delete() {
        System.out.println("Nhập id sản phầm cần xóa:");
        int id = scanner.nextInt();
        if (Objects.isNull(list.get(id))) {
            return "Id sản phẩm không tồn tại!";
        }
        list.remove(id);
        return "Xóa thành công!";
    }

    public void getAll() {
        for (Product product : list) {
            System.out.println(product);
        }
    }

    public void getByName() {
        System.out.println("Nhập từ khóa tìm kiếm: ");
        String name = scanner.nextLine();
        for (Product product : list) {
            if (product.getName().contains(name)) {
                System.out.println(product);
            }
        }
    }

    public List<Product> sort() {
        System.out.println("Kiểu sắp xếp:");
        String type = scanner.nextLine();
        if (type.equals("ASC")) {
            Collections.sort(list);
        } else if (type.equals("DESC")) {
            list.sort(Collections.reverseOrder());
        }
        return list;
    }
}
