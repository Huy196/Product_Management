import java.util.Scanner;

public class Product_Management {
    public static void main(String[] args) {
        Store store = new Store();


        store.addProduct(new Product("motorbike", 20, 3));
        store.addProduct(new Product("Bike", 6, 1));
        store.addProduct(new Product("Laptop", 30, 2));
        store.addProduct(new Product("Mobiphone", 22, 5));
        store.addProduct(new Product("Car", 100, 10));
        store.addProduct(new Product("Home", 400, 2));
        store.addProduct(new Product("Girl", 50, 10));
        store.addProduct(new Product("Boy", 50, 5));

        Scanner input = new Scanner(System.in);
        System.out.println("Menu Sản Phẩm : ");
        store.sortProductByPrice(true);
        System.out.println(store);

        while (true) {


            System.out.println("1. ADD");
            System.out.println("2. Detele");
            System.out.println("3. price of the product");
            System.out.println("4. increase and decrease");
            System.out.println("5. Total Value");

            System.out.println("Hãy nhập lựa chọn của bạn");
            int num = input.nextInt();
            switch (num) {
                case 1:
                    Scanner input2 = new Scanner(System.in);
                    System.out.println("Please fill in the product name : ");
                    String name = input2.nextLine();
                    System.out.println("enter price : ");
                    double price = input.nextDouble();
                    System.out.println("Enter quantity : ");
                    int stt = input.nextInt();
                    store.addProduct(new Product(name, price, stt));
                    System.out.println(store);
                    break;

            }


            System.out.println("Price of Car: " + store.findPriceByName("Car"));

            store.remoteProductByName("Boy");

            store.sortProductByPrice(true);
            System.out.println("Products sorted by ascending price: \n" + store);

            store.sortProductByPrice(false);
            System.out.println("Products sorted by descending price: \n" + store);

            System.out.println("Total value of store:\n " + store.calculateTotalValue());
        }
    }
}
