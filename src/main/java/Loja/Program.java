package Loja;

import Loja.Entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product data:");
        System.out.println("Name:");
        String name = sc.nextLine();
        System.out.println("Price : ");
        double price = sc.nextDouble();
        System.out.println("Quantity: ");
        int quantity = sc.nextInt();
        Product product = new Product(name, price, quantity);

        System.out.println("Product data: "+ product.toString());
        System.out.println();
        System.out.println("Enter the number of products to be added in stock: " );
        quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("Product DATA : "+ product.toString());
        System.out.println();
        System.out.println("Enter the number of products to be remove in stock");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Product DATA : " + product.toString());

        sc.close();


    }
}

