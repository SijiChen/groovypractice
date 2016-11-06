/**
 * Created by sjchen on 11/6/16.
 */
class Closure {
    static void main(String[] args) {
        def clos = {param-> println("Hello ${param}") };
        clos.call("world");

        def lst = [11, 12, 13, 14];
        lst.each{num ->println num};
        lst.each{num -> if(num % 2 == 0) println num};
    }


}
