class Operators{
	public static void main(String args[]){
		int A = 10;
		int B = 20;
		System.out.println("Shift Operators");
		System.out.println("Left Shift => A<<B => (10*(2^20)) =>"+(A<<B));
		System.out.println("Right Shift => A>>B => (10/(2^20)) =>"+(A>>B));
		 //For positive number, >> and >>> works same  
    		System.out.println(20>>2);
		System.out.println(20>>>2);  
    		//For negative number, >>> changes parity bit (MSB) to 0  
    		System.out.println(-20>>2);  
    		System.out.println(-20>>>2);
		
		System.out.println("Relational Operators");
		System.out.println("A > B ="+(A>B));
		System.out.println("A < B ="+(A<B));
		System.out.println("A <= B ="+(A<=B));
		System.out.println("A >= B ="+(A>=B));
		System.out.println("A == B ="+(A==B));
		System.out.println("A != B ="+(A!=B));

		System.out.println("Bitwise Operators");
		System.out.println("A & B = "+(A&B));
		System.out.println("A | B = "+(A|B));
		System.out.println("A ^ B = "+(A^B));

		/**
		System.out.println("Logical Operators");
		System.out.println("A && B = "+(A&&B));
		System.out.println("A || B = "+(A||B));
		**/

		System.out.println("Ternary Operators");
		System.out.println("Min(A,B) => (A<B) ? A :B => Ans:"+((A<B)?A:B));
		
		System.out.println("Unary Operators");
		System.out.println("A++ =>"+(A++));
		System.out.println("++A =>"+(++A));
		System.out.println("A =>"+A);
		System.out.println("B-- =>"+(B--));
		System.out.println("--B =>"+(--B));

		System.out.println("Assignment Operators");
		int C = 30;

		A=C;
		System.out.println("A = C => Printing Value of A => "+A);

		A += C;
		System.out.println("A += C => Printing Value of A => "+A);
		
		A *= C;
		System.out.println("A *= C => Printing Value of A => "+A);
		
		A -= C;
		System.out.println("A -= C => Printing Value of A => "+A);

		A /= C;
		System.out.println("A /= C => Printing Value of A => "+A);

		A %= C;
		System.out.println("A %= C => Printing Value of A => "+A);
		
		A &= C;
		System.out.println("A &= C => Printing Value of A => "+A);
		
		A ^= C;
		System.out.println("A ^= C => Printing Value of A => "+A);
		
		A |= C;
		System.out.println("A |= C => Printing Value of A => "+A);
		
		A <<= C;
		System.out.println("A <<= C => Printing Value of A => "+A);
		
		A >>= C;
		System.out.println("A >>= C => Printing Value of A => "+A);
		
		A >>>= C;
		System.out.println("A >>>= C => Printing Value of A => "+A);
		
	}
}