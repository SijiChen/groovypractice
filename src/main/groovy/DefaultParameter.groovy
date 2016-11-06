/**
 * Created by sjchen on 11/5/16.
 */
class DefaultParameter {
    static int sum(int a,int b = 5) {
        int c = a+b;
        return c;
    }

    static void main(String[] args) {
        println(sum(6));
    }
}
