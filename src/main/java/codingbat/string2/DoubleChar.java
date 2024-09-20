package codingbat.string2;

public class DoubleChar {

    public String doubleChar(String str) {
        String str2 = "";
        int i;
        for ( i = 0; i< str.length(); i++ ){
            str2 += String.valueOf(str.charAt(i)) + String.valueOf(str.charAt(i));
        }
        return str2;
    }
}
