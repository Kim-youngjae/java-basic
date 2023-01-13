//package javajungsuk.youtube;
//
//import java.util.ArrayList;
//import java.util.List;
//
//class Product { }
//class Tv extends Product{}
//class Audio extends Product{}
//
//public class GenericsEx2 {
//    public static void main(String[] args) {
//        ArrayList<Product> productList = new ArrayList<Product>();
//        ArrayList<Tv> tvList = new ArrayList<Tv>();
////        ArrayList<Product> tvList = new ArrayList<Product>(); // error
////        List<Tv> tvList = new ArrayList<Tv>(); // Ok 다형성 때문에
//        // List - ArrayList 간 조상 자손 관계이기 때문에 성립
//
//        productList.add(new Tv()); // 타입 변수가 <Product> 이므로 Product와 그 자손은 다 OK.
//        productList.add(new Audio());
//
//        tvList.add(new Tv());
//        tvList.add(new Tv());
////        tvList.add(new Audio()); // error -> Tv 또는 그 자손만 가능한데 Audio는 아무 관련이 없기 때문에
//
//        printAll(productList);
////        printAll(tvList); // 매개변수 타입과 일치하지 않아서 에러
//
//    }
//
//    private static void printAll(ArrayList<Product> productList) { // 매개 변수 타입이 ArrayList<Product>만 가능하기 때문
//        for (Product p : productList) {
//            System.out.println(p);
//        }
//    }
//}
