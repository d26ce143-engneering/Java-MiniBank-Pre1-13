package pre13mini;
import pre13mini.annotation.Id;
public class Customer {@Id private final String customerId;private final String name;public Customer(String id,String n){customerId=id;name=n;}public String toString(){return customerId+" | "+name;}}
