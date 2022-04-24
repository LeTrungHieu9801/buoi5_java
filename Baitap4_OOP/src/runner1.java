public class runner1
{
    public static void main(String[] args) {
        Customer b = new Customer(123,"hieu",99);
        Invoice a = new Invoice(123,b,22);
        System.out.println(a.toString());
    }
}
