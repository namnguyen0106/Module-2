package lesson17;

public class Main {
    private static final String PATH = "D:\\CODEGYM\\Code\\Module-2\\src\\lesson17\\productInfo.txt";

    public static void main(String[] args) {
        Service service = new Service();
        int option = -1;
        do {
            option = service.menu();
            switch (option) {
                case 1:
                    service.getAll(PATH);
                    break;
                case 2:
                    Product product = service.input();
                    service.create(PATH, product);
                    break;
                case 3:
                    service.search(PATH);
                    break;
            }
        } while (option != 0);
    }
}
