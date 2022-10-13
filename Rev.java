class Rev{
public static void main(String[] args){
int num = 234, reverse = 0, lastDigit;
for(;num>0;num=num/10){
	lastDigit = num%10;
	reverse=reverse*10+lastDigit;
}
System.out.println(reverse);
}
}