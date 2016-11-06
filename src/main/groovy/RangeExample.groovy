/**
 * Created by sjchen on 11/6/16.
 */
class RangeExample {
    static void main(String[] args) {
        // Example of an Integer using def
        def rint = 1..10;

        println(rint.contains(2));
        println(rint.get(2));
//Get the lower value of this Range
        println(rint.getFrom());
//        Get the upper value of this Range
        println(rint.getTo());
        println(rint.isReverse());
        println(rint.size());
        println(rint.subList(1,4));
    }

}
