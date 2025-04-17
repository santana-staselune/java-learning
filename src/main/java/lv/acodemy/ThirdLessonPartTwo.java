package lv.acodemy;

public class ThirdLessonPartTwo {
    public static void main(String[] args) {

        int summa = add(10,30);
        System.out.println(summa);
        System.out.println(add(20,10));

        greet("Santana");
        int summa2 = add(10,20, 40);
        System.out.println(summa2);

    int bolwe = maxOfTwo(15,20);
        System.out.println(bolwe);



    }
    public static int add(int a, int b) {
        int result = a+b;
        return result;
    }
    //method overloading
    public static int add(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }
    //maxOfTwo, accepts: inta, int b, return the biggest number
    public static int maxOfTwo(int a, int b) {
        if (a>b)
            return a; else return b;

    }

    //maxOfThree, accepts: inta, int b, int c return the biggest number
    public static int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));}



        public static void greet (String name){
        System.out.println("Hello," + name + "!");
    }
}
