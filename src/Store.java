import java.util.ArrayList;
import java.util.Comparator;

public class Store {
    private ArrayList<Product> productList; //Tạo 1 mảng arraylisst từ 1 product

    public Store() {
        this.productList = new ArrayList<>(1000);
    }

    public boolean addProduct(Product product) {
        if (productList.size() < 1000) {
            productList.add(product);
            return true;
        } else {
            System.out.println("Store is full. Cannot add more products");
            return false;
        }
    }

    public Double findPriceByName(String name) {
        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product.getPrice();
            }
        }
        return null;
    }

    public boolean remoteProductByName(String name) {
        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase(name)) {
                productList.remove(product);
                return true;
            }
        }
        return false;
    }

    public void sortProductByPrice(boolean ascending) {
        if (ascending) {
            productList.sort(Comparator.comparingDouble(Product::getPrice));
        } else {
            productList.sort(Comparator.comparingDouble(Product::getPrice).reversed());
        }
    }

    public double calculateTotalValue() {
        double totalValue = 0;
        for (Product product : productList) {
            totalValue += product.getPrice() * product.getQuantity();
        }
        return totalValue;
    }

    public String toString() {
        return "Store { " + " ProductList = " + productList + " }";
    }
}
