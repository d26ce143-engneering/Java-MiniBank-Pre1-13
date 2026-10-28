package pre03mini;
public class Customer implements Cloneable { private final String customerId; private String name,email,mobile; private Address address;
 public Customer(String id,String name,String email,String mobile,Address address){this.customerId=id;this.name=name;this.email=email;this.mobile=mobile;this.address=address;}
 public Address getAddress(){return address;} public String getName(){return name;}
 @Override public Customer clone(){try{return (Customer)super.clone();}catch(CloneNotSupportedException e){throw new AssertionError(e);}}
 public static class Address {private String line,city,pincode;public Address(String l,String c,String p){line=l;city=c;pincode=p;}public String getLine(){return line;}public String getCity(){return city;}public String getPincode(){return pincode;}}
}
