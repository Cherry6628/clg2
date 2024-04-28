import java.io.*;
import java.util.Scanner;
public class ElectricityBill
{
public static void main(String[] args) throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader (System.in)); System.out.println("Enter Your Name : ");
String nm=br.readLine(); System.out.println("Enter the units consumed : "); int units=Integer.parseInt(br.readLine());
double charges=0,fbill=0; System.out.println("Please enter your choice:");
Scanner in = new Scanner(System.in);
System.out.println("Domestic for 1 && Consumer for 2 "); 
int choice= in.nextInt();
switch (choice)
{
case 1:
if(units<=100) charges=units*1;
else if(units<=101&&units>=200) charges=(100*1)+(units-100)*2.50; else if(units<=201&&units>=500)
charges=(100*1)+(100*2.50)+(units-500)*4; else
charges=(100*1)+(100*2.50)+(500*4)+(units-500)*6; fbill=charges+250;
System.out.println("\f"); break;
case 2:
if(units<=100) charges=units*2;
else if(units<=101&&units>=200) charges=(100*2)+(units-100)*4.50; else if(units<=201&&units>=500)
charges=(100*2)+(100*4.50)+(units-500)*6; else
charges=(100*2)+(100*4.50)+(500*6)+(units-500)*7; fbill=charges+250;
System.out.println("\f"); break;
}
//printing the bill
System.out.println("Your Electricity Bill"); System.out.println("*********************"); System.out.println(); System.out.println("Costumers Name : "+nm); System.out.println("Units Consumed : "+units); System.out.println("Charges : "+charges); System.out.println("Rent Charges : 250 Rs."); System.out.println("Total Bill : "+fbill);
}
}
