/**
 * Created by sjchen on 11/5/16.
 */
class Example {

    static void main(String[] args) {
        // Using a simple println statement to print output to the console
        println('Hello World');
        //Example of a int datatype
        int x = 5;

        //Example of a long datatype
        long y = 100L;

        //Example of a floating point datatype
        float a = 10.56f;

        //Example of a double datatype
        double b = 10.5e40;

        //Example of a BigInteger datatype
        BigInteger bi = 30g;

        //Example of a BigDecimal datatype
        BigDecimal bd = 3.5g;

        println(x);
        println(y);
        println(a);
        println(b);
        println(bi);
        println(bd);

        // Defining a variable with the underscore in it's name
        //WHAT'S THE DIFFERENCE HERE? def as String looks the same
        def _Name = "Joe";
        println(_Name);

//        Range Operators
        def range = 5..10;
        println(range);
    }

}
