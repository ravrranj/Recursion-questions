

public class Keypad{
    
    public static String[] keypad = {
        ".",    // 0
        "",     // 1 (No letters mapped in old phones)
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

   public static void printComb(String str, int idx, String combination) {
    if(idx == str.length()) {
      System.out.println(combination);
      return;

    }   
 
    char currChar = str.charAt(idx);
    String mapping = keypad[currChar - '0'];

    for(int i = 0 ; i < mapping.length() ; i++){
       printComb(str, idx + 1, combination + mapping.charAt(i));
    }

   }
    public static void main(String args[]){

    String str ="23";
    printComb(str, 0, "");
   }

}