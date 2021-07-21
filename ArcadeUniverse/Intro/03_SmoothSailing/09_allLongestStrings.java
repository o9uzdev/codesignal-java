/*
Given an array of strings, return another array containing all of its longest strings.

Example

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
allLongestStrings(inputArray) = ["aba", "vcd", "aba"].

Input/Output

[execution time limit] 3 seconds (java)

[input] array.string inputArray

A non-empty array.

Guaranteed constraints:
1 ≤ inputArray.length ≤ 10,
1 ≤ inputArray[i].length ≤ 10.

[output] array.string

Array of the longest strings, stored in the same order as in the inputArray.

[Java] Syntax Tips

// Prints help message to the console
// Returns a string
// 
// Globals declared here will cause a compilation error,
// declare variables inside the function instead!
String helloWorld(String name) {
    System.out.println("This prints to the console when you Run Tests");
    return "Hello, " + name;
}
*/

String[] allLongestStrings(String[] inputArray) {

    ArrayList<String> arrlist = new ArrayList<String>();

    int longest = 0;

    for (String a : inputArray) {
        if (a.length() > longest)
            longest = a.length();
    }

    for (String a : inputArray) {
        if (a.length() == longest)
            arrlist.add(a);
    }

    return arrlist.toArray(new String[0]);
}