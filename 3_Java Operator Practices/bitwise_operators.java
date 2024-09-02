class bitwise_operators
{
		public static void main(String args[])
		{
			/* Bitwise Operators
			   Bitwise And  & (if all bits are 1 then it give 1)otherwise 0
			   Bitwise Or 	| (if either of bit is 1 then you will get 1) else 0
			   Bitwise XOR	^ (if bits are DIFF then you get 1 or if they are SAME then 0)
			   Bitwise Not	~ (ulta)(0 ka 1) (1 ka 0)(complier will return 2's complement of a number)
			*/
			System.out.println(15&6);
			System.out.println(15|6);
			System.out.println(15^6);
			System.out.println(~6);
		}
}
/*
Rapid tables (decimal to binary)
 
For & 
15		1111
6       0110  (6 binary value is 110)
-------------------
		0110  : 6
		
For |
15      1111
6       0110
-------------------		
		1111 : 15
	
For ^
15      1111    
6       0110
-------------------
		1001 : 9
		
For ~
~6 (complier will return 2's complement of a number)
 6  0000 0000 0000 0110 (total 16)
 
~6  1111 1111 1111 1001
-----------------------
         :  -7 
*/