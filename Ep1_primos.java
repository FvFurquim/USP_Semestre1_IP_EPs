// Ep1_primos.java

import java.util.Scanner;

public class Ep1_primos{
	public static void main( String[] args ) {
		Scanner input = new Scanner( System.in );
		int M, N, divisor, primo, resto, restoZero;

		primo = 0;
		restoZero = 0;

		N = input.nextInt();
		M = input.nextInt();

		if ( M >= N ) {
		    while( M >= N ) {
		    	divisor = 1;
				while( N > divisor ) {
					resto = N % divisor;
					divisor++;
					if( resto == 0 ) 
					restoZero++;
				}
				
				N++;
				if( restoZero == 1 )
					primo++;
				restoZero = 0;	   
		    }
		    System.out.printf( "%d\n", primo );
		}

		else if ( M < N ) {
		    while( M <= N ) {
		    	divisor = 1;
				while( M > divisor ) {
					resto = M % divisor;
					divisor++;
					if( resto == 0 ) 
						restoZero++;
				}
				M++;
				if( restoZero == 1 )
					primo++;
				restoZero = 0;	   
			}

		    System.out.printf( "%d\n", primo );
		}
	}
}
