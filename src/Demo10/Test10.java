package Demo10;

import java.util.ArrayList;
import java.util.Arrays;

public class Test10 {
    public static void main(String[] args) {
        Fruit<String> fruit = new Fruit<String>(String.class, 3);
        fruit.put(0, "Apple");
        fruit.put(1, "Watermelon");
        fruit.put(2, "Banana");

        System.out.println(Arrays.toString(fruit.getArray()));

        String s = fruit.get(2);
        System.out.println(s);

    }
}
