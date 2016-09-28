//---------------------------------------------------------------------------
//
// Homework 1
// Problem 3 g) F.6 Page 526
// Bob Provencher
//
//---------------------------------------------------------------------------

public class HW1_3g_F6 {
	
	public static void main( String[] args ) {
		TestParta();
		TestPartb();
	}
	
	public static void TestParta() {
		
		System.out.println( "" );
		System.out.println( "Part a):" );
		
		Date date = new Date();
		Output( date );
		
		date.setMonth( 7 );
		Output( date );
		
		date.setDay( 15 );
		Output( date );
		
	}
	
	public static void TestPartb() {
		
		System.out.println( "" );
		System.out.println( "Part b):" );
		
		Date date = new Date( 7, 1, 1900 );
		Output( date );
		
		date = new Date( "August", 15, 1900 );
		Output( date );
		
		date = new Date( 196, 1900 );
		Output( date );
		
		date = new Date( 366, 2000 );
		Output( date );
		
		date = new Date( 365, 1900 );
		Output( date );
		
		date = new Date( 15, 2000 );
		Output( date );
		
		date = new Date( 60, 2000 );
		Output( date );
		
	}
	
	public static void Output( Date date ) {
		System.out.println( "" );
		date.OutputDateFormat1();
		date.OutputDateFormat2();
		date.OutputDateFormat3();
	}
	
}
