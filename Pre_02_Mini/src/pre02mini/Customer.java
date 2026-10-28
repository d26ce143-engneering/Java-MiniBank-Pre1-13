package pre02mini;
public class Customer {
 private static long customerCounter=100; private final String customerId; private String name,email,mobile;
 public Customer(String name,String email,String mobile){this.customerId="CUST"+(++customerCounter);this.name=name;this.email=email;this.mobile=mobile;}
 public String getCustomerId(){return customerId;} public String getName(){return name;} public String getEmail(){return email;} public String getMobile(){return mobile;}
}
