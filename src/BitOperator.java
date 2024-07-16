
public class BitOperator {

	public static void main(String[] args) {
		
		byte n1 = 5;	//00000101
		byte n2 = 3;	//00000011
		byte n3 =-1;	//11111111
		
		byte r1 = (byte)(n1 & n2); 		//00000001
		byte r2 = (byte)(n1 | n2);		//00000111
		byte r3 = (byte)(n1 ^ n2);		//00000110
		byte r4 = (byte)(~n3);			//00000000
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println((r4)+ "" + '\n');
		
		byte num;
		num = 2; 	//00000010
		System.out.println((byte)(num << 1) + "");			//00000100
		System.out.println((byte)(num << 2) + "");			//00001000
		System.out.println((byte)(num << 3) + "" + '\n');	//00010000
		
		
		num = 8;	//00001000
		System.out.println((byte)(num >> 1) + "");			//00000100
		System.out.println((byte)(num >> 2) + "");			//00000010
		System.out.println((byte)(num >> 3) + "" + '\n');	//00000001
		
		num = -8; 	//1111000
		System.out.println((byte)(num >> 1) + "");			//1111100
		System.out.println((byte)(num >> 2) + "");			//1111110
		System.out.println((byte)(num >> 3) + "" + '\n');	//1111111
		
		
	}

}


