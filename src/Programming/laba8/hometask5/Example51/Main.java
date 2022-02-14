package Programming.laba8.hometask5.Example51;

public class Main {
    public static void main(String[] args) {
        Example51 head=new Example51(0, null);
        Example51 tail=head;
        for (int i = 0; i <9; i++) {
            tail.next=new Example51(i+1, null);
            tail=tail.next;
        }
        Example51 ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}

