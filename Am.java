class Am{
	public static void main(String []args){
		int num=123;
		int r=1;
		int sum;
		for(int i=0;i>0;i++){
			num=num%10;
			r=num;
			r=(r*r*r);
		}
		System.out.println(r);
	}
}
