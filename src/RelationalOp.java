
public class RelationalOp {

	public static void main(String[] args) {

		System.out.println("3 >= 2 : " + (3 >= 2));
		System.out.println("3 <= 2 : " + (3 <= 2));
		System.out.println("7.0 == 7 : " + (7.0 == 7));
		System.out.println("7.0 != 7 : " + (7.0 != 7));
		
		boolean bool = true&&true;
		System.out.println(bool);
		
		bool =false&&true;
		System.out.println(bool);
		
		bool =true&&false;
		System.out.println(bool);
		
		bool =true&&true&& false;
		System.out.println(bool);
		
		bool=(10<0)&&(10>0);
		System.out.println(bool);
		
		bool =false||false;
		System.out.println(bool);
		
		bool =false||true;
		System.out.println(bool);
		
		bool=(10<0)||(10>0);
		System.out.println(bool);
		
		bool =!true;
		System.out.println(bool);
		
		bool =!false;
		System.out.println(bool);
		
		
	}

}


