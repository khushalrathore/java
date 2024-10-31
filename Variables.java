public class Variables {
    public static void main(String[] args) {
        //let n be the size of the primitive type in bits (8bits = 1byte)
        //signed MAX_VALUE = ((2^(n-1)) -1)
        boolean conditionType = false; // n = 8bits
        
        byte smallestNumberType = Byte.MAX_VALUE; // n = 8bits
        short smallerTypeNumberType = Short.MAX_VALUE; // n = 16bits
        int NumberType = Integer.MAX_VALUE; // n = 32bits
        long bigNumberType = Long.MAX_VALUE; // n = 64bits

        double bigDecimalNumberType = Double.MAX_VALUE; // n = 64bits
        float decimalNumberType = Float.MAX_VALUE; // n = 32bits

        char letterType = Character.MAX_VALUE; // n = 16bits

        System.out.println("\nBOOLEAN\t\t:\t" + conditionType + ", " + !conditionType
                            +"\nMAX_BYTE\t:\t" + smallestNumberType
                            +"\nMAX_SHORT\t:\t" + smallerTypeNumberType 
                            + "\nMAX_INT\t\t:\t" + NumberType 
                            + "\nMAX_LONG\t:\t" + bigNumberType 
                            + "\nMAX_FLOAT\t:\t" + decimalNumberType 
                            + "\nMAX_DOUBLE\t:\t" + bigDecimalNumberType 
                            + "\nMAX_CHAR\t:\t" + letterType
        );

        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        
    }
}
