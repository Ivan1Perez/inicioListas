package TAD;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.addHead(4);
        lista.addHead(5);
        lista.addHead(22);
        lista.addHead(-2);
        lista.addTail(0);

        System.out.println(lista);
        lista.addAll(lista);
        System.out.println(lista);
//        System.out.println(lista.contains(6));
//        System.out.println(lista.contains(-2));
//
//        System.out.println(Arrays.toString(lista.toArray()));
    }


}
