public class Invoice {
    public int id;
    Customer customer;
    double amount;

  Invoice(int id,Customer customer, double amount)
  {
      this.id=id;
      this.customer = customer;
      this.amount=amount;
  }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String toString()
    {
        return String.format("Invoice[id = %s ,"+ this.customer.toString()+ ", amount = %s ]",this.id , this.amount);

    }
}
