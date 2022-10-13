class Remove{
public static void main (String []args){
int [] values = {34,78,90,53,34,11,53,15,78,91,8,4,67,11};
int index;
for (index = 0; index<values.length; index++)
{
	if (values[index]==values[index++]){
	values[index] = 0;
System.out.println("The Values are : "+values[index]);
}
else{
	System.out.println("The Values are : "+values[index]);
}
	
}
}
}
