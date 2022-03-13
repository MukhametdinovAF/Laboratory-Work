package Programming.laba8.hometask5.Example52;

import Programming.laba8.hometask5.Example51.Example51;

public class Main {
    public static void main(String[] args) {
//        Example52 head=new Example52(9, null);
//        Example52 tail = head;
        Example52 head = null;
        for (int i = 9; i > 0; i--) {
//            tail.next = new Example52(i-1, null);
//            tail=tail.next;
            head = new Example52(i,head);
        }
        Example52 ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
