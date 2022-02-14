package Programming.laba8.hometask4;

public class Example4 { // КЛАСС – СТРУКТУРА ЭЛЕМЕНТА СПИСКА
        public int value; // значение
        public Example4 next; // поле – ссылка (указатель) на следующий узел
        Example4(int value, Example4 next) { // конструктор класса
            this.value = value;
            this.next = next;
        }
    }

