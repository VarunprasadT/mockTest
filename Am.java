class Am{
public static void main(String []args){
int n = 3;
int num = 123;
int lastDigit=0;
int count = 0;
for(;num>0;num=num/10){
	count++;
lastDigit = num%10;
int sum = lastDigit*count;
System.out.println(sum);
}
}
}