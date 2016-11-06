/**
 * Created by sjchen on 11/6/16.
 */
class StringExample {
//    Groovy offers a variety of ways to denote a String literal.
// Strings in Groovy can be enclosed in single quotes (’), double quotes (“), or triple quotes (“””).
// Further, a Groovy String enclosed by triple quotes may span multiple lines.
    static void main(String[] args) {
        String a = 'Hello Single';
        String b = "Hello Double";
        String c = "'Hello Triple" + "Multiple lines'";
        String str1="HELLO WORLD";
        String str2="Hello WORLD";
        String str3="Hello WORLD world";


        println(a);
        println(b);
        println(c);
        println(a + b);
        println(a*3);
        println(a.length());
        println(a.center(30));
//        This method returns a negative integer, zero, or a positive integer as the specified
// String is greater than, equal to, or less than this String, ignoring case considerations.
        println(str1.compareToIgnoreCase( str2 ));
        println(str2.compareToIgnoreCase( str3 ));
        println(str3.compareToIgnoreCase( str1 ));
        println(str1.equalsIgnoreCase(str2));
        println(a.getAt(2));
        println(a[2]);
        println(a.indexOf('e'));

        a.eachMatch(" "){
            ch->println ch
        }

    }
}
