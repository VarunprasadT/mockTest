class Am{
	public static void main(String []args){
		int num=123;
		int r=1;
		int sum=0;
		for(int i=0;i<4;i++){
			for(;num!=0;num=num/10){
			num=num%10;
			r=num;
			sum +=(r*r*r);
		}
		}
		if(sum==num){
			System.out.println("The number is Amstrong number");
		}
		else{
			System.out.println("The number is not an Amstrong number");
		}
	}
}
