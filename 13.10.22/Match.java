package operators1;





public class Match {
public static String match(String input) {
	if(input.matches("[a-z]+_[a-z]+")) {
		return "match found";
		}
	else {
		return "match not found";
	}
}
public static void main(String[] args) {
	System.out.println(match("ss_ch"));
	System.out.println(match("ss_ch"));
	System.out.println(match("ss_ch"));
}
}