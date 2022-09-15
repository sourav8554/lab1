package operators1;


	class Bank{  
		int Interest(){return 8;}  
	}  
		  
	class SBI extends Bank{  
		int Interes(){return 8;}  
		} 
		  
		class ICICI extends Bank{  
		int Interest(){return 7;}  
		}  
		class AXIS extends Bank{  
		int Interest(){return 9;}  
		}  
		
		class Bank_interest{  
		public static void main(String args[]){  
		SBI s=new SBI();  
		ICICI i=new ICICI();  
		AXIS a=new AXIS();  
		System.out.println("SBI Interest: "+s.Interest());  
		System.out.println("ICICI Interest: "+i.Interest());  
		System.out.println("AXIS Interest: "+a.Interest());  
		}  
		}  

