

public String decodeString(String s) {
    Stack<Integer> stack=new Stack<>();
    Stack<StringBuilder> stack1=new Stack<>();


    int currentnumber=0;
    StringBuilder currentString = new StringBuilder();
    for(char c:s.toCharArray()){
        if(Character.isDigit(c)){
            currentnumber=currentnumber*10+(c-'0');
        } else if (Character.isLetter(c)) {
            currentString.append(c);
        } else if (c=='[') {
            stack.push(currentnumber);
            currentnumber=0;
            currentString=new StringBuilder();
        } else if (c==']') {
            int repeatCount= stack.pop();
            StringBuilder repeatedString=new StringBuilder();
            for (int i=0;i<repeatCount;i++){
                repeatedString.append(currentString);
            }
            StringBuilder prevString =stack1.pop();
            currentString=prevString.append(repeatedString);
        }

    }
    return currentString.toString();

}

void main() {
}