public class TimSar{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of Flowers");
int flowerNumber=sc.nextInt();
System.out.println("Enter the First Flowers Number");
int flower1=sc.nextInt();
System.out.println("Enter the Second Flower Number");
int flower2=sc.nextInt();
boolean love=false;
if(flower1%2==0 || flower2%2!=0){
	if(flower2%2!=0 || flower1%2==0){
		love=true;
	}
}
if(love==true){
	System.out.println("They are in love");
}
else{
	System.out.println("They aren't");
}
}
}