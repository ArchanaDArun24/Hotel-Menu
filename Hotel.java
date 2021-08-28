package Hotel;
import java.util.*;
class Bill{
	String itemname;
	float price;
	float subtotal;
	int quanity;
	Bill(String a,float b,float c,int d){
		itemname=a;
		price =b;
		subtotal=c;
		quanity=d;
	}
	public String toString() {
		return itemname+" "+price+" "+quanity+" "+subtotal;
	}
	
}
public class Hotel {

	public static void main(String[] args) {
		ArrayList<Bill> itemList=new ArrayList<Bill>();
		Scanner sc =new Scanner(System.in);
		Scanner sc1 =new Scanner(System.in);
		String itemname="";
		float price=0,subtotal=0;
		float grandtotal=0;
		char opinion='y';
		float total=0;
		System.out.println("           Menu");
		System.out.println("\n*****************************\nSln0\titeamname\tPrice\n1\tIdle\t\t30\n2\tvada\t\t20\n3\tcoffee\t\t10\n4\ttea\t\t8\n5\twater\t\t20");
		while(opinion=='Y'||opinion=='y') {
			System.out.println("Enter the choice");
			int choice=sc.nextInt();
			System.out.println("Enter the quanity");
			int quanity=sc.nextInt();
			System.out.println("Do u want more");
			String ch =sc1.next();
			opinion=ch.charAt(0);
			switch(choice)
			{
			case 1:itemname="idle";
					price=30;
					subtotal=price*quanity;
					break;
			case 2:itemname="voda";
			price=20;
			subtotal=price*quanity;
			break;
			case 3:itemname="coffee";
			price=10;
			subtotal=price*quanity;
			break;
			case 4:itemname="tea";
			price=8;
			subtotal=price*quanity;
			break;
			case 5:itemname="water";
			price=20;
			subtotal=price*quanity;
			break;
			default:System.out.println("No Item");
				
			}
			total+=subtotal;
			itemList.add(new Bill(itemname,price,subtotal,quanity));
		}
		for(Bill b:itemList)
		{
			System.out.println(b);
		}
		System.out.println("--------------------------------");
		System.out.println("Total before tax:"+total);
		grandtotal =(float)(total +0.18*total);
		System.out.println("Total after tax:"+grandtotal);
	}

}
