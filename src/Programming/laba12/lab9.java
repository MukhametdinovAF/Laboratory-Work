package Programming.laba12;
import java.util.*;
public class lab9 {
        public static void main(String[] args) {
            List<Integer> arrayList = new ArrayList<>();
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
            HashSet<Integer> hashSet = new HashSet<>();

            System.out.println("Время выполнения операции добавления arrayList = " + getRunningTime(arrayList));
            System.out.println("Время выполнения операции добавления hashSet = " + getRunningTime(hashSet));
            System.out.println("Время выполнения операции добавления treeMap = " + getRunningTime(treeMap));
        }
        private static long getRunningTime(List<Integer> list){
            // точка начала отсчета времени выполнения программы
            long start = System.currentTimeMillis();
            // блок кода в котором выполняется операция добавления
            for (int i = 0; i < 12000000; i++) {
                list.add(i);
            }
            // точка окончания отсчета времени выполнения программы
            long end = System.currentTimeMillis();
            // вывод в консоль времени выполнения блока кода содержащего операцию
            return end - start;
        }
        private static long getRunningTime(HashSet<Integer> hashSet){
            long start = System.currentTimeMillis();
            for (int i = 0; i < 12000000; i++) {
                hashSet.add(i);
            }
            long end = System.currentTimeMillis();
            return end - start;
        }
        private static long getRunningTime(TreeMap<Integer,Integer> treeMap){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 12000000; i++) {
            treeMap.put(i,i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    }

