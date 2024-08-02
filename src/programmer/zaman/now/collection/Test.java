package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public class ArrayHelper{
        public static <T> int count (T[] array){
            return array.length;
        }
    }

    public static void main(String args[]) {


        Integer[] number = {99,98,97,80,81,79,3,2,1,4,7,5};
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));

        //List integers = new ArrayList();
        List<Integer> integers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            integers.add(i);
        }

        System.out.println(integers);

        /*integers.stream().min(number);*/
        for (var value : integers){
            System.out.println(value);
        }

        System.out.println(
                ArrayHelper.count(number)
        );
    }
}
