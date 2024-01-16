public class StringOps {
    ////////////////////////////////////////////////////////////
    ////// ///////
    ////// Reminder: ///////
    ////// allowed methods ///////
    ////// ///////
    ////// 1.charAt(int index) ///////
    ////// 2.length() ///////
    ////// 3.substring(int start) ///////
    ////// 4.substring(int start,int ends) ///////
    ////// 5.indexOf(String str) ///////
    ////// ///////
    ////// The rest are not allowed ! ///////
    ////// if you want to use a different ///////
    ////// method, and you can implement ///////
    ////// it using material from the course ///////
    ////// you need to implement a version of ///////
    ////// the function by yourself. ///////
    ////// ///////
    ////// see example for substring ///////
    ////// in Recitation 3 question 5 ///////
    ////// ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {

    }

    public static String capVowelsLowRest(String string) {
        // Write your code here:
        char[] result = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch += 32; // Convert to lowercase
            }
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ch -= 32; // Convert to uppercase
            }
            result[i] = ch;
        }
        return new String(result);
    }

    public static String camelCase(String string) {
        String result = "";
        boolean newWord = true;
        int wordCount = 0;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch == ' ') {
                newWord = true;
                continue;
            }
            if (newWord) {
                if (wordCount == 0 && ch >= 'A' && ch <= 'Z') {
                    ch += 32; // Convert first letter of the first word to lowercase
                } else if (wordCount > 0 && ch >= 'a' && ch <= 'z') {
                    ch -= 32; // Convert first letter of each word (except the first word) to uppercase
                }
                newWord = false;
                wordCount++;
            } else if (ch >= 'A' && ch <= 'Z') {
                ch += 32; // Convert remaining letters to lowercase
            }
            result += ch;
        }
        return result;
    }

    public static int[] allIndexOf(String string, char chr) {
        // Write your code here:
        int sum = 0, j = 0;
        // this for loop to know how big is the array
        for (int i = 0; i < string.length(); i++) {
            if (chr == string.charAt(i))
                sum++;
        }
        int[] arr = new int[sum];
        for (int i = 0; i < string.length(); i++) {
            if (chr == string.charAt(i)) {
                arr[j] = i;
                j++;
            }
        }
        return arr;
    }
}
