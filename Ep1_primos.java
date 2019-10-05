// Ep1_primos.java
// Exercício dado em sala de aula - Felipe Furquim (11208030) e Lucas Freitas (11315061) - 02/04/19 9h35

import java.util.Scanner;

public class Ep1_primos
{
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
	            
	            if( resto == 0 ) {
	                restoZero++;
	            }
	            
	    }
	            N++;
	            if( restoZero == 1 ) {
	                primo++;
	            }  
	   
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
	            
	            if( resto == 0 ) {
	                restoZero++;
	            }
	            
	    }
	            M++;
	            if( restoZero == 1 ) {
	                primo++;
	            }  
	   
                restoZero = 0;	   
	    }
	    
	    System.out.printf( "%d\n", primo );
	    
	}
		
	}
}