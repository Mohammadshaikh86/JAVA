class a{
    int a = 10;
    void displaya(){
        System.out.println("A is :"+a);
    }
}

class b extends a{
    int b = 5;
    void displayb(){
        System.out.println("B is :"+b);
    }
}

class c extends b{
    int c = a+b;
    void displayc(){
        System.out.println("Addition of A+B is :"+c);
    }
}

public class classes{
    public static void main(String[] args) {
        c sum = new c();
        sum.displaya();
        sum.displayb();
        sum.displayc();
    }
}