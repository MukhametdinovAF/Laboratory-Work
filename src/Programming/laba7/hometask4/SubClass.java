package Programming.laba7.hometask4;

public class SubClass extends SuperClass {
    public String str1;

    public SubClass(char ch1) {
        super(ch1);
    }

    public SubClass(char ch1, String str1) {
        super(ch1);
        this.str1 = str1;
    }

    public SubClass (SubClass clone){
        this(clone.ch1, clone.str1);

    }
}
