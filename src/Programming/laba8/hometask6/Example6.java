package Programming.laba8.hometask6;



public class Example6 {
    public int value;
    public Example6 next;




    public Example6(int value, Example6 next) {
        this.value = value;
        this.next = next;
    }
            
    public static Example6 createHead(int size) {
        Example6 head = new Example6(1, null);
        Example6 tail = head;

        for (int i = 1; i < size; i++) {
            tail.next = new Example6(i + 1, null);
            tail = tail.next;
        }
        return head;
    }

    public static Example6 createTail(int size){
              Example6 head = null;
            for (int i = size; i >0; i--) {
                head = new Example6(i,head);
        }
        return head;
    }

    public static void toStringMethod(String Message, Example6 head){
        Example6 ref = head;
        System.out.println(Message);
        while(ref!=null){
            System.out.println("value= "+ ref.value);
            ref=ref.next;
        }
    }

    public static Example6 AddFirst(Example6 head,int value) {
        return new Example6(value,head);
    }

    public static void AddLast(Example6 head, int value){
        Example6 ref = head;
        while (ref.next != null) {
            ref = ref.next;

        }
        ref.next=new Example6(value,null);
    }

    public static void Insert(Example6 head,int value,int position){
        Example6 newposition = new Example6(value, null);
        int index=1;
        Example6 ref = head;

            while(ref.next!=null&&index<position){
                ref=ref.next;
                index++;
            }
            newposition.next=ref.next.next;
            ref.next=newposition;
        }

    public static Example6 RemoveFirst(Example6 head) {
        head = head.next;
        return head;
    }


    public static void RemoveLast(Example6 head) {
        Example6 ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
    }
    public static void Remove(Example6 head, int position){
        int index=1;
        Example6 ref = head;
            while(ref.next!=null&&index<position){
                ref=ref.next;
                index++;
            }

            ref.next=ref.next.next;
        }

    public static void createHeadRec(Example6 head,Example6 tail,int value){
        if(head!=null) {
            tail = head;
        }
        if(value!=1){
            tail.next = new Example6(value - 1, null);
            tail = tail.next;
            createHeadRec(null,tail,value-1);
        }
    }

    public static Example6 createTailRec(Example6 head,int value){
        if(value!=1){
            head = new Example6(value + 1, null);
            head = createTailRec(head,value-1);
        }
        return head;
    }
    public void toStringRec(Example6 node){
        Example6 head = null;
        if(value>=0){
            head = new Example6(value,head);
            value--;
            toStringRec(node);
        }
        Example6 ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }

    public int getLength(Example6 node){
        int length=0;
        Example6 head = new Example6(value,null);
        Example6 tail = head;

        for (int i = 0; i < value; i++) {
            tail.next = new Example6(i + 1, null);
            tail = tail.next;
        }
        Example6 ref=head;
        while(ref.next!=null){
            ref=ref.next;
            length++;
        }
        return length;
    }
    public void getLengthForThree(Example6 node){
        Example6 head = new Example6(value,next);
        Example6 tail = head;
        for (int i=0;i<value;i++){
            tail.next=new Example6(i+1,null);
            tail=tail.next;
        }
        Example6 ref=head;
        int counter=0;
        int sum=0;
        int middle=0;
        while(ref.next!=null){
            ref=ref.next;
            if(ref.value%3==0){
            counter++;
            sum=sum+ref.value;
            middle=sum/counter;
            }
        }
        System.out.println("Количество чисел последовательности, делящихся на 3 = "+counter);
        System.out.println("Сумма этих чисел = "+sum);
        System.out.println("Среднее арифметическое этих чисел = "+middle);
    }

    public void getMinAndMaxForThree(Example6 node){
        Example6 head = new Example6(value,next);
        Example6 tail = head;
        for(int i = 0; i<value; i++){
            tail.next = new Example6(i+1,null);
            tail = tail.next;
        }
        Example6 ref = head;
        int min=0;
        int max=0;
        while (ref.next!=null){
            ref=ref.next;
            if (ref.value%3==0 && ref.value<4) {
                min = ref.value;
            }
            else if (ref.value % 3 == 0 && ref.value > min) {
                    max = ref.value;
                }
        }
        ref=head;
        Example6 setmax = new Example6(max,null);
        Example6 setmin = new Example6(min,null);
        System.out.println("Список элементов выглядит следующим образом ");
        while (ref.next!=null){
            ref=ref.next;

            if (ref.value==min){

                ref.value=setmax.value;
                setmax.next=ref.next;

            }
            else if (ref.value==max){
                ref.value=setmin.value;
                setmin.next=ref.next;

            }
        }
        Example6 refout =head;
        while (refout.next!=null){
            refout=refout.next;
            System.out.print(" "+refout.value);
        }


    }





}
//        Разработать проект, в котором для ввода, вывода и изменения
//        односвязного линейного списка создать следующие методы:
//        а) с использованием цикла:
//        – ввод с головы createHead();
//        – ввод с хвоста createTail();
//        – вывод (возвращается строка, сформированная из элементов
//        списка) toString();
//        – добавление элемента в начало списка AddFirst();
//        – добавление элемента в конец списка AddLast();
//        – вставка элемента в список с указанным номером Insert();
//        – удаление элемента с головы списка RemoveFirst();
//        – удаление последнего элемента списка RemoveLast();
//        – удаление из списка элемента с указанным номером
//        Remove();
//        а) с использованием рекурсии:
//        – ввод с головы createHeadRec();
//        – ввод с хвоста createTailRec();
//        – вывод (возвращается строка, сформированная из элементов
//        списка) toStringRec().
