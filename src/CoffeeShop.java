import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CoffeeShop {

    private static int nextCustomerNumber = 1;

    public int assignCustomerNumber() {
        return nextCustomerNumber++;
    }

    public static void main(String[] args) {
        CoffeeShop shop = new CoffeeShop();
        for (int i = 1; i <= 1; i++) {
            System.out.println("Customer " + i + " assigned number: " + shop.assignCustomerNumber());
        }
    }
}
