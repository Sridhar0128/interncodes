public class Main {
    public static void main(String[] args) {
        long a=400;
        long b=250;
        long c=(byte)a;
        long d=(byte)b;
        //data loss occur
        System.out.println(c);
        System.out.println(d);
    }
}