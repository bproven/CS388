//---------------------------------------------------------------------------
//
// Homework 1
// Problem 3 g) F.6 Page 526
// Bob Provencher
//
//---------------------------------------------------------------------------

public class Date {
	
	// fields
	
	int month;
	int day;
	int year;
	
	// properties
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth( int m ) {
		month = m;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay( int d ) {
		day = d;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear( int y ) {
		year = y;
	}
	
	public String getMonthName() {
		String result = "";
		Month mon = Month.monthByNumber( getMonth() );
		if ( mon != null ) {
			result = mon.getName();
		}
		return result;
	}
	
	public void setMonthName( String monthName ) {
		Month mon = Month.monthByName( monthName );
		if ( mon != null ) {
			setMonth( mon.getNumber() );
		}
	}
	
	public boolean getIsLeapYear() {
		int year = getYear();
		return ( year % 400 == 0 ) || ( year % 4 == 0 && year % 100 != 0 );
	}
	
	public int getDayOfYear() {
		int dayOfYear = 0;
		boolean isLeapYear = getIsLeapYear();
		for ( int i = 1; i < getMonth(); i++ ) {
			Month mon = Month.monthByNumber( i );
			if ( mon != null ) {
				dayOfYear += mon.getDays( isLeapYear );
			}
		}
		dayOfYear += getDay();
		return dayOfYear;
	}
	
	public void setDayOfYear( int dayOfYear ) {
		boolean isLeapYear = getIsLeapYear();
		for ( int i = 1; i <= 12; i++ ) {
			Month mon = Month.monthByNumber( i );
			if ( mon != null ) {
				int days = mon.getDays( isLeapYear );
				//String s = String.format( "year %d leap %s %s doy %d days %d", getYear(), isLeapYear ? "yes" : "no", mon.getName(), dayOfYear, days );
				//System.out.println( s );
				if ( dayOfYear <= days ) {
					setMonth( mon.getNumber() );
					setDay( dayOfYear );
					break;
				}
				else {
					dayOfYear -= days;
				}
			}
		}
	}
	
	// constructors
	
	public Date() {
		setYear( 1900 );
		setMonth( 1 );
		setDay( 1 );
	}
	
	public Date( int m, int d, int y ) {
		setYear( y );
		setMonth( m );
		setDay( d );
	}
	
	public Date( String n, int d, int y ) {
		setYear( y );
		setMonthName( n );
		setDay( d );
	}
	
	public Date( int doy, int y ) {
		setYear( y );
		setDayOfYear( doy );
	}
	
	// methods
	
	public void OutputDateFormat1() {
		String result = String.format( "%02d/%02d/%04d", getMonth(), getDay(), getYear() );
		System.out.println( result );
	}
	
	public void OutputDateFormat2() {
		String result = String.format( "%s %02d, %04d", getMonthName(), getDay(), getYear() );
		System.out.println( result );
	}
	
	public void OutputDateFormat3() {
		String result = String.format( "%03d %04d", getDayOfYear(), getYear() );
		System.out.println( result );
	}
	
}
