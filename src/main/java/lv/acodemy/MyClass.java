package lv.acodemy;

public class MyClass {
    public static void main(String[] args) {

        //sout  systemoutprintln
        System.out.println("Ja u mami programist!");
        // Your text is here (one-line comment)

        /*
        First line
        Second line
        Third line
         */

        //byte 8-bit
        byte age = 30;
        System.out.println(age);

        //Naming convention:
        // Camel Case: MyClass for classes (Capital Camel Case)
        // Camel Case: currentYear for variables (Lower Camel Case)

        //short 16-bit god temperatura distancija
        short currentYear = 2025;
        short temperature = -273;
        short distance = 1600;
        System.out.println(currentYear);

        //int 32-bit
        int score = 9000;
        int population = 15000000;
        int result = (10 * 10) - 42;
        System.out.println(result);

        //long 64-bit
        long starstInGalaxy = 100_000_000_000L; // L - musthave 10000000 (boxing type)
        long bigNumber = 92929298388383239L;
        long currentMillis = System.currentTimeMillis();
        System.out.println(currentMillis);

        //float 32-bit

        float pi = 3.14f;
        float piNumber = (float) Math.PI; //casting
        float discount = 25.5f;
        System.out.println(piNumber);

        //double 64-bit
        double accountBalance = 999.999934;
        double piNumberd = (double) Math.PI;
        System.out.println(piNumberd);


        //char(symbol)

        char initial = 'N';
        char digit = '7';
        char symbol = '#';

        //Unicod
        char smiley = '\u263A';
        System.out.println(smiley);


        //boolean (T/F)
        boolean isJavaFun = true;
        boolean isTired = true;
        boolean passed = (40>60); //false
        System.out.println(passed);

        //int z; -> create z
        //z = roomCount int roomCount


        //string
        String myFullName = "Santana Staselune"; //immutable
            }
}
