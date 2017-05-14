package ds.Stack;

public class App {

    public static void main(String[] args) {
        Stack theStack = new Stack(10);
//        theStack.push(20);
//        theStack.push(40);
//        theStack.push(60);
//        theStack.push(80);
//        theStack.push(40);
//        theStack.push(60);
//        theStack.push(80);
//        theStack.push(40);
//        theStack.push(60);
//        theStack.push(80);
//        theStack.push(40);
//        theStack.push(60);
//        theStack.push(80);
//
//        while(!theStack.isEmpty()) {
//            long value = theStack.pop();
//            System.out.println(value);
//        }

        System.out.println(reverseString("Hello"));
    }

    public static String reverseString(String str) {
        int length = str.length();
        String returnStr = "";

        Stack strStack = new Stack(length);

        for(int i = 0; i < length; i++) {
            strStack.push(str.charAt(i));
        }

        while(!strStack.isEmpty()) {
            char value = strStack.pop();
            returnStr += value;
        }
        return returnStr;
    }
}
