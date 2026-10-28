package pre04mini;
import java.util.regex.Pattern;
public class Validator {private static final Pattern MOBILE=Pattern.compile("[6-9][0-9]{9}"), EMAIL=Pattern.compile("^[\\w.+-]+@[\\w.-]+\\.[A-Za-z]{2,}$"), PAN=Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]"), IFSC=Pattern.compile("[A-Z]{4}0[A-Z0-9]{6}");
 public static boolean isValidMobile(String s){return MOBILE.matcher(s).matches();}public static boolean isValidEmail(String s){return EMAIL.matcher(s).matches();}public static boolean isValidPan(String s){return PAN.matcher(s).matches();}public static boolean isValidIfsc(String s){return IFSC.matcher(s).matches();}}
