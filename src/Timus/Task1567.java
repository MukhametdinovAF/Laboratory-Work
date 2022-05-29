package Timus;
import java.util.*;
public class Task1567 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String smsReklama = in.nextLine();
        char [] array = new char[smsReklama.length()];
        array = smsReklama.toCharArray();
        int count1=0;
        int count2=0;
        int count3=0;
        for(int i=0;i< array.length;i++){
            if(array[i]=='a'||array[i]=='d'||array[i]=='g'||array[i]=='j'||
                    array[i]=='m'||array[i]=='p'||array[i]=='s'||array[i]=='v'||array[i]=='y'||array[i]=='.'||array[i]==' '){
                count1++;
            }
            else if(array[i]=='b'||array[i]=='e'||array[i]=='h'||array[i]=='k'||
                    array[i]=='n'||array[i]=='q'||array[i]=='t'||array[i]=='w'||array[i]=='z'||array[i]==','){
                count2+=2;
            }
            else if(array[i]=='c'||array[i]=='f'||array[i]=='i'||array[i]=='l'||
                    array[i]=='o'||array[i]=='r'||array[i]=='u'||array[i]=='x'||array[i]=='!'){
                count3+=3;
            }
        }
        System.out.println(count1+count2+count3);
    }
}
