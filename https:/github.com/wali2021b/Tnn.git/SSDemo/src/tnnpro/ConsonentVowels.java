package tnnpro;

import java.util.Scanner;



public class ConsonentVowels {

	public static void main(String[] args) {

		System.out.println("Enter a character to find consonent and vowels..");
		Scanner sc=new Scanner (System.in);
		String chr;
		chr=sc.next().toLowerCase();

		boolean ok=chr.charAt(0)<=122 && chr.charAt(0)>=97;
		boolean vowel=chr.equals("a")|| chr.equals("e") || chr.equals("i")||chr.equals("o") ||chr.equals("u");
		if(chr.length()>1)
		{
			System.out.println("Total characters : "+chr.length()+"\nInsert  single character..");
			
		}
		else if(!ok)
		{
		System.out.println("This is not a letter alphabet ");
		}
		else if(vowel)
		{
			System.out.println("It's a VoWel");
		}
		else {
			System.out.println("it's a consonent..");
		}
	}

}
