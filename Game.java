import java.util.*;
import java.util.stream.IntStream;
import java.lang.StringBuilder;
public class Game{
static Scanner mom= new Scanner(System.in);
public static void main(String args[]){
Random random= new Random();
int chance1= 0;
int chance2= 0;
int chance3= 0;
int number= 0;
String name= "";
int bracket= 0;
System.out.println("The game is start!");
System.out.println("Answer these questions and for each question you have just 3 chance: ");
System.out.println("\nLevel 1");
System.out.println("Enter the code to open the door.");
System.out.println("The code is: 3 Number sum of them is a odd number but \nif multiply it will be 1 more than the sum of them.");
do{
number= mom.nextInt();
chance1++;
}while(number!=124 && chance1!=3);

if(number==124){
System.out.println("\nLevel 2");
System.out.println("\nTell me name of a Animal that we can make it pet and that eat fish?");
do{
name= mom.next().toLowerCase();
chance2++;
}while(!name.equals("cat") && chance2!=3);
}

if(name.equals("cat")){
System.out.println("\nLevel 3");
System.out.println("\nIf you think like a programmer how many open and close square brackets in here?");
do{
System.out.println("[] [] [] []");
bracket= mom.nextInt();
chance3++;
}while(bracket!=3 && chance3!=3);
if(number==124 && name.equals("cat") && bracket==3)
System.out.println("You win the Game!");
}
if(number!=124 || !name.equals("cat") || bracket!=3)
System.out.println("You loss!");
}
}











































