public class runner {

        public static void main(String[] args) {
            Author ha = new Author("hieu","ha@gamil.com",'n');
            Book a = new Book("hieu",ha,18000,30);
            System.out.println(ha.toString());
            System.out.println(a.toString());
        }
}
