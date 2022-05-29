package Timus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1197 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int number = in.nextInt();
            in.nextLine();
            List<String> strings = new ArrayList<>();
            String res="";
            char first;
            char second;
            int value;
            int count=0;
            for (int i=0;i<number;i++) {
                res=in.nextLine();
                strings.add(res);
            }
            String [] words = new String [number];
            strings.toArray(words);
            for (int i=0;i<words.length;i++) {
                first =words[i].charAt(0);
                second = words[i].charAt(1);
                if(first=='a'&second=='1'||first=='a'&second=='8') {
                    count=2;
                }
                else if (first=='a'&second=='2'||first=='a'&second=='7') {
                    count=3;
                }
                else if(first=='a'&second=='3'||first=='a'&second=='4'||first=='a'&second=='5'||first=='a'&second=='6') {
                    count=4;
                }
                else if(first=='b'&second=='1'||first=='b'&second=='8') {
                    count=3;
                }
                else if (first=='b'&second=='2'||first=='b'&second=='7') {
                    count=4;
                }
                else if(first=='b'&second=='3'||first=='b'&second=='4'||first=='b'&second=='5'||first=='b'&second=='6') {
                    count=6;
                }
                else if(first=='c'&second=='1'||first=='c'&second=='8') {
                    count=4;
                }
                else if (first=='c'&second=='2'||first=='c'&second=='7') {
                    count=6;
                }
                else if(first=='c'&second=='3'||first=='c'&second=='4'||first=='c'&second=='5'||first=='c'&second=='6') {
                    count=8;
                }
                else if(first=='d'&second=='1'||first=='d'&second=='8') {
                    count=4;
                }
                else if (first=='d'&second=='2'||first=='d'&second=='7') {
                    count=6;
                }
                else if(first=='d'&second=='3'||first=='d'&second=='4'||first=='d'&second=='5'||first=='d'&second=='6') {
                    count=8;
                }
                else if(first=='e'&second=='1'||first=='e'&second=='8') {
                    count=4;
                }
                else if (first=='e'&second=='2'||first=='e'&second=='7') {
                    count=6;
                }
                else if(first=='e'&second=='3'||first=='e'&second=='4'||first=='e'&second=='5'||first=='e'&second=='6') {
                    count=8;
                }
                else if(first=='f'&second=='1'||first=='f'&second=='8') {
                    count=4;
                }
                else if (first=='f'&second=='2'||first=='f'&second=='7') {
                    count=6;
                }
                else if(first=='f'&second=='3'||first=='f'&second=='4'||first=='f'&second=='5'||first=='f'&second=='6') {
                    count=8;
                }
                else if(first=='g'&second=='1'||first=='g'&second=='8') {
                    count=3;
                }
                else if (first=='g'&second=='2'||first=='g'&second=='7') {
                    count=4;
                }
                else if(first=='g'&second=='3'||first=='g'&second=='4'||first=='g'&second=='5'||first=='g'&second=='6') {
                    count=6;
                }
                else if(first=='h'&second=='1'||first=='h'&second=='8') {
                    count=2;
                }
                else if (first=='h'&second=='2'||first=='h'&second=='7') {
                    count=3;
                }
                else if(first=='h'&second=='3'||first=='h'&second=='4'||first=='h'&second=='5'||first=='h'&second=='6') {
                    count=4;
                }
                System.out.println(count);
                count=0;

            }
        }
    }
