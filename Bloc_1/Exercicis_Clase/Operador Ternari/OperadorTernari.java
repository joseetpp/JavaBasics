public class OperadorTernari{
	public static void main(String[] args){
		int result = 0;
		int x = 10;
		
		result = x>result ? 100 : -100;
		
		System.out.println("resolt = " + result);
		
		String solution = "";
		
		solution = x!=0 && x>100 ? "Equals to cero"  :"Diferent de 0";
		
		if(x>0)
			result = 100;
		else if (x==0)
			result = 0;
		else 
			result = -100;
		
		result = x>0 ? 100 :
				(x==0 ? 0 : 100;
				
		System.out.println(x!= 0 && x>100 ? "Equals to cero"  :"Diferent de 0");
	}
}