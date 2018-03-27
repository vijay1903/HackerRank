import java.util.LinkedList;
import java.util.Stack;
public class Solution {
    Queue<Character> qu = new LinkedList<Character>();
    Stack<Character> st = new Stack<Character>();
    
    public void pushCharacter(char ch){
        st.push(ch);
    }
    public char popCharacter(){
        return st.pop();
    }
    public void enqueueCharacter(char ch){
        qu.add(ch);
    }
    public char dequeueCharacter(){
        return qu.remove();
    }
