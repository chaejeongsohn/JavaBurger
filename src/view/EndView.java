package view;

import dto.Product;

import java.util.List;

public class EndView {
    public static void printProductList(List<Product> productList) {
        System.out.println("-----상품 " + productList.size() + "개 -------------");
        for (Product product : productList) {
            System.out.println(product);
        }
        System.out.println();
    }

}
