package Programming.laba8.hometask6;



public class Example6 {
    public int value;
    public Example6 next;



    public Example6(int value, Example6 next) {
        this.value = value;
        this.next = next;
    }



    public void createHead(Example6 node) {
        Example6 head = new Example6(0, null);
        Example6 tail = head;

        for (int i = 0; i < value; i++) {
            tail.next = new Example6(i + 1, null);
            tail = tail.next;
        }
        Example6 ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
        }

    public void createTail(Example6 node){
              Example6 head = null;
            for (int i = value; i >= 0; i--) {
                head = new Example6(i,head);
        }
        Example6 ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
            }


    public String toString(Example6 node){
        return null;
        }



    public void AddFirst(int val) {
        Example6 head = new Example6(0, null);
        Example6 tail = head;

        for (int i = 0; i < value; i++) {
            tail.next = new Example6(i + 1, null);
            tail = tail.next;
        }
        Example6 newhead = new Example6(val, head);
        if (head.next != null) {
            head=newhead;
            newhead.next = head.next;

        }

        Example6 ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
    public void AddLast(int val){
        Example6 head = new Example6(0, null);
        Example6 tail = head;

        for (int i = 0; i < value; i++) {
            tail.next = new Example6(i + 1, null);
            tail = tail.next;
        }
        Example6 newtail = new Example6(val, null);
        Example6 ref = head;
        while (ref.next != null) {
            ref = ref.next;

        }
        ref.next=newtail;
        ref=head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }

    public void Insert(int val,int position){
        Example6 head = new Example6(0, null);
        Example6 tail = head;

        for (int i = 0; i < value; i++) {
            tail.next = new Example6(i + 1, null);
            tail = tail.next;
        }

        int index=0;
        if(position>=0&&position<=value){
            Example6 ref = head;
            while(index!=position){
                ref=ref.next;
                index++;
            }
            Example6 newposition = new Example6(val, null);
            newposition.next=ref.next;
            ref.next=newposition;
        }
        Example6 ref =head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }

    }
    public void RemoveFirst(){
        Example6 head = new Example6(0, null);
        Example6 tail = head;

        for (int i = 0; i < value; i++) {
            tail.next = new Example6(i + 1, null);
            tail = tail.next;
        }

        if (head.next != null) {
            head=head.next;
        }

        Example6 ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }

    public void RemoveLast(){
        Example6 head = new Example6(0, null);
        Example6 tail = head;

        for (int i = 0; i < value; i++) {
            tail.next = new Example6(i + 1, null);
            tail = tail.next;
        }

        Example6 ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }

        ref.next=null;
        ref=head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
    public void Remove(int position){
        Example6 head = new Example6(0, null);
        Example6 tail = head;

        for (int i = 0; i < value; i++) {
            tail.next = new Example6(i + 1, null);
            tail = tail.next;
        }

        int index=0;
        if(position>=0&&index<position){
            Example6 ref = head;
            while(index!=position){
                ref=ref.next;
                index++;
            }

            ref.next=ref.next.next;

        }
        Example6 ref =head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }

    }
    public void createHeadRec(Example6 node){
        Example6 head = new Example6(value, null);
        Example6 tail = head;
        if(value>0){
            tail.next = new Example6(value+1, null);
            tail = tail.next;
            value--;
            createHeadRec(node);

        }
        Example6 ref =head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }

    public void createTailRec(Example6 node){
        Example6 head = null;
        if(value>0){
//        for (int i = value; i >= 0; i--) {
            head = new Example6(value,head);
            value--;
            createTailRec(node);
        }
        Example6 ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
    public String toStringRec(){
        return null;
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
