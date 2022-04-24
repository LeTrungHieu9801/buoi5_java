public class Person {
    private String name;
    private String address;

    public Person(String name , String address)
    {
        this.name=name;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String toString()
    {
        return String.format(" Person [ name= %s ,address= %s ]",this.name,this.address);
    }

//    public static void main(String[] args) {
//        Person a = new Person("hieu","hai boi");
//        System.out.println(a.toString());
//    }
}