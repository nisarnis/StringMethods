package org.cts;
//String Methods
public class Samples {
public static void main(String[] args) {
	String t="nisar";
	String t1="NISAR";
	String t3="             Nisar Fathima          ";
//1 to find the length of the string
			int len = t.length();
	System.out.println(len);
//2 to convert the lowercase into Uppercase
	String UC = t.toUpperCase();
	System.out.println(UC);
//3 to convert the Uppercase into lowercase
	String lc = t.toLowerCase();
	System.out.println(lc);
	
//4 to get a index position of particular letter(first occured)
	
	int rep = t1.indexOf('I');
	System.out.println(rep);
//5to get a index position of particular letter(last occured)
	int las = t.lastIndexOf('s');
	System.out.println(las);
	
	
//6to get a particular character from String by using index
	
	char e = t.charAt(3);
	System.out.println(e);
	
//7 to compare the 2 string with case sensitive
	
	boolean i = t.equals(t1);
	System.out.println(i);
	
//8 to check the 2 string without case sensitive
	
	System.out.println(t.equalsIgnoreCase(t3));
	
	
//9 to check whether the given value is present or not 
	
	
	
//10 to replace the values
System.out.println(t.replace("Nisar", "saalaa"));

//11 to check whether our string starts with the particular value r not
	
	boolean a = t1.startsWith("Fa");
	System.out.println(a);
	
//12 to check whether our string ends with the particular value or not
	
	boolean d = t.endsWith("ar");
	System.out.println(d);
//13 to check whether our string is empty or not
	
	
	
	
//to remove the unwanted spaces from the string
	String l = t3.trim();
	System.out.println(l);
	
	
//to split the string values
	
	
	
//to get the value from specific index(substring)
	
	String eee = t3.substring(19);
	System.out.println(eee);
	
//to get the value b/w the specific index(substring)
	
	String gg = t3.substring(8,17);
	System.out.println(gg);

	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
