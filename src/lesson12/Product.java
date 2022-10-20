package lesson12;

import java.util.Comparator;

public class Product implements Comparator<Product>, Comparable<Product> {
    private Integer id;
    private String name;
    private Double price;
    private String type;

    public Product(Integer id, String name, Double price, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public Product(String name, Double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return  "Id=" + id + '\n' +
                ", Tên= " + name + '\n' +
                ", Giá= " + price + '\n' +
                ", Loại= " + type;
    }

    @Override
    public int compareTo(Product o) {
        return 0;
    }

    @Override
    public int compare(Product o1, Product o2) {
        return 0;
    }
}
