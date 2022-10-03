public class Level11Lecture1 {
	/**
	 * Package com.javarush.task.pro.task09.task0905;
	 * convert decimal number to octo and return back
	 */
		public static void main(String[] args) {
		 int decimalNumber = 21;
	        System.out.println("Decimal number " + decimalNumber + " equals octal number " + toOctal(decimalNumber));
	        int octalNumber = 25;
	        System.out.println("Octal number " + octalNumber + " equals decimal number " + toDecimal(octalNumber));
	    }

	    public static int toOctal(int decimalNumber) {
	        int result = 0;
	        if(decimalNumber > 0){
	            int power = 0;
	            while(decimalNumber != 0){
	                result += (decimalNumber % 8) * Math.pow(10, power++);
	                decimalNumber /= 8;
	            }
	        }
	        return result;
	    }

	    public static int toDecimal(int octalNumber) {
	        int result = 0;
	        if(octalNumber > 0){
	            int power = 0;
	            while(octalNumber != 0){
	                result += (octalNumber % 10) * Math.pow(8, power++);
	                octalNumber /= 10;
	            }
	        }
	        return result;
	}
}
