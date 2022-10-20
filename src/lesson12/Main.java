package lesson12;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        int option;

        do {
            option = service.menu();
            switch (option) {
                case 1:
                    service.getAll();
                    break;
                case 2:
                    Product product = service.input();
                    service.create(product);
                    break;
                case 3:
                    Product productUpdate = service.input();
                    service.update(productUpdate);
                    break;
                case 4:
                    service.delete();
                    break;
                case 5:
                    service.getByName();
                    break;
                case 6:
                    service.sort();
                    break;
            }
        } while (option != 0);
    }
}
