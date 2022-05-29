package Timus;
import java.util.*;
public class Task1585 {
        public static void main(String[] args) {

            Scanner in = new Scanner (System.in);
            int n = in.nextInt();
            in.nextLine();
            List <String> veryPopularPinguin=new ArrayList<>();
            for(int i=0;i<n;i++) {
                String pinguin = in.nextLine();
                veryPopularPinguin.add(pinguin);
            }
            int count1=0;
            int count2=0;
            int count3=0;
            String [] pinguins=new String[n];
            veryPopularPinguin.toArray(pinguins);
            for(int i=0;i<pinguins.length;i++){
                if (pinguins[i].equals("Emperor Penguin")){
                    count1++;
                }
            }
            for(int i=0;i<pinguins.length;i++){
                if (pinguins[i].equals("Little Penguin")){
                    count2++;
                }
            }
            for(int i=0;i<pinguins.length;i++){
                if (pinguins[i].equals("Macaroni Penguin")){
                    count3++;
                }
            }

            if(count3>count2&count3>count1) {
                System.out.println("Macaroni Penguin");
            }
            else if (count1>count2&count1>count3) {
                System.out.println("Emperor Penguin");
            }
            else if (count2>count1&count2>count3) {
                System.out.println("Little Penguin");
            }

        }
    }

