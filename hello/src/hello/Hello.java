package hello;

public class Hello {
	public static void main(String[] args) {
			
		int a;
		int b;
		
			for(b=1;b<10;b++){
				for(a=2; a<6;a++){
					System.out.print(a+"x"+b+"="+a*b+"\t");
				}
				System.out.println("");
			}
			System.out.println("\r");
			for(b=1;b<10;b++){
				for(a=6; a<10;a++){
					System.out.print(a+"x"+b+"="+a*b+"\t");
				}
				System.out.println("");
			}
	}
}