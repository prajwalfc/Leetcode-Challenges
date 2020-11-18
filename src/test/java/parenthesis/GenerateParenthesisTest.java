package parenthesis;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GenerateParenthesisTest {

    List<String> input1;
    List<String> input2;
    List<String> input3;
    List<String> input4;
    List<String> input5;
    List<String> input6;
    @Before
    public void setup(){
        input1 = Arrays.asList("()");
        input2 = Arrays.asList("(())","()()");
        input3 = Arrays.asList("((()))","(()())","(())()","()(())","()()()");
        input4 = Arrays.asList("(((())))","((()()))","((())())","((()))()","(()(()))","(()()())","(()())()","(())(())","(())()()","()((()))","()(()())","()(())()","()()(())","()()()()");
        input5 = Arrays.asList("((((()))))","(((()())))","(((())()))","(((()))())","(((())))()","((()(())))","((()()()))","((()())())","((()()))()","((())(()))","((())()())","((())())()","((()))(())","((()))()()","(()((())))","(()(()()))","(()(())())","(()(()))()","(()()(()))","(()()()())","(()()())()","(()())(())","(()())()()","(())((()))","(())(()())","(())(())()","(())()(())","(())()()()","()(((())))","()((()()))","()((())())","()((()))()","()(()(()))","()(()()())","()(()())()","()(())(())","()(())()()","()()((()))","()()(()())","()()(())()","()()()(())","()()()()()");
    }
    @Test
    public void gerenerateParenthesisTest(){
        assertEquals(0,GenerateParenthesis.generateParenthesis(0).size());
        assertEquals(input1,GenerateParenthesis.generateParenthesis(1));
        assertEquals(input2,GenerateParenthesis.generateParenthesis(2));
        assertEquals(input3,GenerateParenthesis.generateParenthesis(3));
        assertEquals(input4,GenerateParenthesis.generateParenthesis(4));
        assertEquals(input5,GenerateParenthesis.generateParenthesis(5));
    }
}