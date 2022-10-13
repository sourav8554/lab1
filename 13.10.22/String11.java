package operators1;
import java.util.*;
public class String11 {
public static void main(java.lang.String[] args) {
		String s1="Welcome to Java World";//string initialization
System.out.println("5th position index is :  "+s1.charAt(5));//getting 5th position character
String s2="welcome";//another string.
System.out.println(s1.compareToIgnoreCase(s2));//ignoring case and display output
System.out.println(s1.concat(" Let us learn"));
System.out.println(s1.indexOf("a"));
System.out.println(s1.replace('a','e'));
System.out.println(s1.substring(4,10));
System.out.println(s1.toLowerCase());
StringBuffer sb=new StringBuffer("This is StringBuffer ");//initialization of string buffer
System.out.println(sb.append("This is a sample program"));//adding strings
System.out.println(sb.insert(21, " Object "));//inserting
System.out.println(sb.replace(14,20,"Builder"));
System.out.println(sb.reverse());//reversing the string
StringTokenizer s3= new StringTokenizer("C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE");
System.out.println("drive :"+s3.nextToken("\\")+"\\");
System.out.print("Folders : "+s3.nextToken("\\")+"||");
System.out.print(s3.nextToken("\\")+"||");
System.out.print(s3.nextToken("\\"));
System.out.println();
System.out.println("File :"+s3.nextToken("\\"));


}}