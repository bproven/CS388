//---------------------------------------------------------------------------
//
// Homework 1
// Problem 3 g) F.6 Page 526
// Bob Provencher
//
//---------------------------------------------------------------------------

public class Month {
	
	String name;
	int number;
	int days;
	int leapYearDays;
	
	static Month[] months = {
		new Month( "January", 1 ),
		new Month( "February", 2, 28, 29 ),
		new Month( "March", 3 ),
		new Month( "April", 4, 30 ),
		new Month( "May", 5, 30 ),
		new Month( "June", 6 ),
		new Month( "July", 7 ),
		new Month( "August", 8 ),
		new Month( "September", 9, 30 ),
		new Month( "October", 10 ),
		new Month( "November", 11, 30 ),
		new Month( "December", 12 )
	};
	
	public String getName() {
		return name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public int getDays() {
		return days;
	}
	
	public int getDays( boolean isLeapYear ) {
		return isLeapYear ? getLeapYearDays() : getDays();
	}
	
	public int getLeapYearDays() {
		return  leapYearDays > 0 ? leapYearDays : days; 
	}
	
	public Month( String n, int num ) {
		name = n;
		number = num;
		days = 31;
		leapYearDays = 0;
	}
	
	public Month( String n, int num, int d ) {
		name = n;
		number = num;
		days = d;
		leapYearDays = 0;
	}
	
	public Month( String n, int num, int d, int l ) {
		name = n;
		number = num;
		days = d;
		leapYearDays = l;
	}
	
	public static Month monthByName( String monthName ) {
		Month month = null;
		for ( int i = 0; i < months.length; i++ ) {
			if ( monthName.toLowerCase().equals( months[ i ].getName().toLowerCase() ) ) {
				month = months[ i ];
				break;
			}
		}
		return month;
	}

	public static Month monthByNumber( int monthNumber ) {
		Month month = null;
		for ( int i = 0; i < months.length; i++ ) {
			if ( monthNumber == months[ i ].getNumber() ) {
				month = months[ i ];
				break;
			}
		}
		return month;
	}
	
}
