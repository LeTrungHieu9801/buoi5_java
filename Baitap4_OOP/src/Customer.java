public class Customer {
   private int id;
    private String name;
    private int discount;

    Customer( int id,String name,int discount)
    {
          this.id = id;
          this.name=name;
          this.discount=discount;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public String toString()
    {
        return String.format("Customer[ name = %s , id =%s, discount = %s]",this.name,this.id,this.discount);
    }
}
