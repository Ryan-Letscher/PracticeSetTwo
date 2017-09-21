package ps2;

public class MyInteger {
MyInteger ivalue = new MyInteger();

public MyInteger() {
	int iValue;
	
	public MyInteger() {
		iValue= new iValue;
	}
	public int getValue() {
		return iValue;
	}
	public boolean isEven() {
		return(iValue % 2)==0;
	}
	public boolean isOdd() {
		return(iValue % 2)== 1;
	}
	public boolean isPrime() {
		if (iValue == 1 || iValue == 2) {
			return true;
		}
		else {
			for (int i=2; i < iValue; i++) {
				if(i % iValue == 0) return false;
			}
		}
		return true;
	}
	public static boolean isEven(int myInt) {
		return (myInt % 2)== 0;
	}
	public static boolean isOdd(int myInt) {
		return(myInt % 2)== 1;
	}
	public static boolean isPrime(int myInt) {
		if (myInt == 1 || myInt == 2) {
			return true;
		}
		else {
			for (int i ==2; i < myInt; i++) {
				if (i % myInt== 0) return false;
			}
		}
		return true;
	}
	public static boolean isEven(MyInteger myint) {
		return myint.isEven();
	}
	public static boolean isOdd(MyInteger myint) {
		return myint.isOdd();
	}
	public static boolean isPrime(MyInteger myint) {
		return myint.isPrime();
	}
	public boolean equals(int testint) {
		if (testint == iValue)
			return true;
		return false;
	}
	public boolean equals(MyInteger myint) {
		if(myint.iValue == this.iValue)
			return true;
		return false;
	}
	public static int parseInt( char[] values) {
		int sum= 0;
		for (char i : values) {
			sum += Character.getNumericValue(i);
		}
		return sum;
	}
	public static int parseInt(String Value) {
		return Integer.parseInt(value);
	}
}
}
