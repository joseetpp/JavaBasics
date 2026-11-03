public class PowerFor2{
	public static void main(String[] args){
		for(int i = 1, quadrat = i; i<=10; i++, quadrat*=2){
			System.out.printf("%3d:%d", i, quadrat); 
		}
	}
}