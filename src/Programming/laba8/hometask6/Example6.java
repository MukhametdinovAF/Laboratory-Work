package Programming.laba8.hometask6;

public class Example6 {
    public int value;
    public Example6 next;



    public Example6(int value, Example6 next) {
        this.value = value;
        this.next = next;
    }

    public Example6() {

    }

    public void createHead(Example6 node){
        Example6 tail=new Example6();
        tail=node;
        for (int i=0;i<value;i++){
            tail.next=new Example6(i+1,null);
            tail=tail.next;
        }
    }
    public void createTail(Example6 node){

    }
    public String toString(Example6 node){

        return null;

    }
    public void AddFirst(){

    }
    public void AddLast(){

    }
    public void Insert(){

    }
    public void RemoveFirst(){

    }
    public void Remove(){

    }
    public void createHeadRec(){

    }
    public void createTailRec(){

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
