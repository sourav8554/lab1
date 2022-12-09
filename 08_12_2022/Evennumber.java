package com.bookutil;
import java.util.*;
import java.util.Map.Entry;
/*
 Problem Statement 1:
1.	Develop a java class with a method storeEvenNumbers(int N) using ArrayList to store even numbers from 2 to N, where N is a integer which is passed as a parameter to the method storeEvenNumbers().  The method should return the ArrayList (A1) created. 
2.	In the same class create a method printEvenNumbers()which iterates through the arrayList A1 in step 1,  and It should multiply each number with 2 and display it in format 4,8,12….2*N. and add these numbers in a new ArrayList (A2). The new ArrayList (A2) created needs to be returned.
3.	Create a method retrieveEvenNumber(int N)  parameter is a number N. This method should search the arrayList (A1) for the existence of the number ‘N’ passed.  If exists it should return the Number else return zero.
Hint:  Use instance variable for storing the ArrayList A1 and A2.
NOTE: You can test the methods using a main method.
Problem Statement 2:
1.	Develop a java class with a instance variable Country  HashSet (H1)  add a method storeCountryNames(String CountryName) , the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).
2.	Develop a method retrieveCountry(String CountryName) which iterates through the HashSet and returns the country if exist else return null.
NOTE: You can test the methods using a main method.
Problem Statement 3:
1.	Develop a java class with a instance variable CountryMap  HashMap (M1)  add a method storeCountryCapital(String CountryName, String capital) , the method should add the passed country and capital as key/value in the map M1 and return the Map (M1).
Key- Country	Value - Capital
India	Delhi
Japan	Tokyo
2.	Develop a method retrieveCapital(String CountryName) which returns the capital for the country passed from the Map M1 created in step 1.
3.	Develop a method retrieveCountry(String capitalName) which returns the country for the capital name passed from the Map M1 created in step 1.
4.	Develop a method which iterates through the map M1 and creates another map M2 with Capital as the key and value as Country and returns the Map M2.
Key - Capital	Value – Country
Delhi	India
Tokyo	Japan
1.	Develop a method which iterates through the map M1 and creates a ArrayList with all the Country names stored as keys. This method should return the ArrayList.
NOTE: You can test the methods using a main method.
 */

class Evennumber {
		ArrayList<Integer> num1 = new ArrayList<Integer>();      //  arraylists are create
		ArrayList<Integer> num2 = new ArrayList<Integer>();      
	  
		public ArrayList<Integer>   storeEvenNumbers(int N){      // 1st store method
			for (int i = 2; i<N ; i = i+2)
				num1.add(i);                                     
			return num1;	
		}
		public ArrayList<Integer> printEvenNumbers()  {          // 2nd store method
			for(int i : num1)
				num2.add(i*2);
			return num2;
		}
		public int retrieveEvenNumbers(int N) {                    // 3rd method 
			int n = 0;
			for (int i : num1) {
				if(i==N)
					n = N;
			}
			return n;
		}
		public static void main (String []koushik) {                       // main method
			Evennumber obj = new Evennumber();
			System.out.println(obj.storeEvenNumbers(25));
			System.out.println(obj.printEvenNumbers());
			System.out.println(obj.retrieveEvenNumbers(15));
			System.out.println(obj.retrieveEvenNumbers(22));
		}
	}


class Hashset {
	public static void main(String[] koushik) {
		Country countries = new Country();
		countries.storeCountryNames("India");
		countries.storeCountryNames("USA");
		countries.storeCountryNames("Pakistan");
		countries.storeCountryNames("Bangladesh");
		countries.storeCountryNames("China");

		System.out.println("China: " + countries.retrieveCountry("China"));
		System.out.println("Japan: " + countries.retrieveCountry("Japan"));		
	}
}
class Country {
	HashSet<String> H1 = new HashSet<>();
	public HashSet<String> storeCountryNames(String CountryName) {
		H1.add(CountryName);
		return H1;
	}
	public String retrieveCountry(String CountryName) {
		Iterator<String> it = H1.iterator();	
		while (it.hasNext()) {
			if (it.next().equals(CountryName))
				return CountryName;
		}
		return null;
	}
}



class MapSet {
	public static void main(String[] koushik) {
		CountryMap countryMap = new CountryMap();

		countryMap.storeCountryCapital("India", "Delhi");
		countryMap.storeCountryCapital("Japan", "Tokyo");
		
		System.out.println(countryMap.getCapital("India"));
		System.out.println(countryMap.getCountry("Tokyo"));
		System.out.println(countryMap.toArrayList());
		
		HashMap<String, String> M2 = countryMap.swapKyeValue();
		System.out.println(M2);
	}
}
class CountryMap {
	private HashMap<String, String> M1;
	
	public CountryMap() {
		M1 = new HashMap<String, String>();
	}
	
	public HashMap<String, String> storeCountryCapital(String CountryName, String capital) {
		M1.put(CountryName, capital);
		return M1;
	}
	
	public String getCapital(String CountryName) {
		return M1.get(CountryName);
	}
	
	public String getCountry(String capitalName) {
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			
			if (me.getValue().equals(capitalName))
				return me.getKey();
		}
		
		return null;
	}
	
	public HashMap<String, String> swapKyeValue() {
		HashMap<String, String> M2 = new HashMap<String, String>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			M2.put(me.getValue(), me.getKey());
		}
		
		return M2;
	}
	
	public ArrayList<String> toArrayList() {
		ArrayList<String> list = new ArrayList<>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			list.add(me.getKey());
		}
		return list;
	}
}
