package Programming.laba5.hometask3;

public class Main {
    public static void main(String[] args) {
        Constructors human1 = new Constructors(14);
        Constructors human2 = new Constructors(14,175);
        Constructors human3 = new Constructors(21,183,"Владислав");
        human1.sayAge();
        human2.sayAgeAndHeight();
        human3.sayAgeNameAndHeight();
        human1.setAge(34);
    }
}

