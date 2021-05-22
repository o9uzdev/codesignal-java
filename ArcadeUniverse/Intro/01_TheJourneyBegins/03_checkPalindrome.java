/*
Given the string, check if it is a palindrome.

Example

For inputString = "aabaa", the output should be
checkPalindrome(inputString) = true;
For inputString = "abac", the output should be
checkPalindrome(inputString) = false;
For inputString = "a", the output should be
checkPalindrome(inputString) = true.
Input/Output

[execution time limit] 3 seconds (java)

[input] string inputString

A non-empty string consisting of lowercase characters.

Guaranteed constraints:
1 ≤ inputString.length ≤ 105.

[output] boolean

true if inputString is a palindrome, false otherwise.
*/

boolean checkPalindrome(String inputString) {
    String filteredText = filterText(inputString);
    String reversedText = reverseText(filteredText);
    return filteredText.equalsIgnoreCase(reversedText);
}

public  String reverseText(String text){
    StringBuilder reversedText = new StringBuilder(text);
    reversedText.reverse();
    return reversedText.toString();
}

public String filterText(String text){
    StringBuilder filteredText = new StringBuilder(text.length());
    for(int i=0; i<text.length(); i++){
        if(Character.isLetterOrDigit(text.charAt(i))){
            filteredText.append(text.charAt(i));
        }
    }
    return filteredText.toString();
}