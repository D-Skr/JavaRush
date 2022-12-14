public class Level11Lecture2task2 {
	/**
	 * Package com.javarush.task.pro.task09.task0906;
	 * convert decimal number to binary
	 */
		public static void main(String[] args) {
	        int decimalNumber = Integer.MAX_VALUE;
	        System.out.println("Decimal number " + decimalNumber + " equals binary number " + toBinary(decimalNumber));
	        String binaryNumber = "1111111111111111111111111111111";
	        System.out.println("Binary number " + binaryNumber + " equals decimal number " + toDecimal(binaryNumber));
	    }

	    public static String toBinary(int decimalNumber) {
	        String result = "";
	        if(decimalNumber > 0){
	            while(decimalNumber != 0){
	                result = decimalNumber % 2 + result;
	                decimalNumber /= 2;
	            }
	        }
	        return result;
	    }

	    public static int toDecimal(String binaryNumber) {
	        int result = 0;
	        for(int i = 0; i < binaryNumber.length(); i++){
	            int index = binaryNumber.length() - 1 - i;
	            result += Character.getNumericValue(binaryNumber.charAt(index)) * Math.pow(2,i);
	        }
	        return result;
	    }
	}
