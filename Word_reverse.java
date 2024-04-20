import java.util.Scanner;

public class Word_reverse{

public static void main (String[]args){
Scanner input = new Scanner(System.in);
System.out.println("Game: Write a word and we will reverse it ");
System.out.println("Write a word ");
String name =input.nextLine();
int count = name.length()-1;
while(count>=0){
System.out.print(name.charAt(count));
count--;

}

}}