package operators1;


import java.util.Arrays;

public class CommonElement {
		public static void  method(int a[], int b[]) {
			 
	        for(int i = 0; i < a.length; i++) {
	 
	            for(int j = 0; j < b.length; j++) {
	 
	                     if(a[i] == b[j]) {
	                          System.out.println("the common elements are : "+a[i]);
	                      }
	                  }
	              }
	          }
		public static void main(String[] args) {
			int a[]={4,7,2,5,1};
			int b[]= {4,1,6,3,8};
			Arrays.sort(a);
			Arrays.sort(b);
			CommonElement ce=new CommonElement();
			ce.method(a, b);
		}
	 }

