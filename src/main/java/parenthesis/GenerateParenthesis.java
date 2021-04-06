package parenthesis;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

public static List<String> generateParenthesis(int n){
        List<String> lst = new ArrayList<>();
        if(n == 0) return lst;
        generateHelper(lst,n,"",0,0);
        return lst;
    }
    private static void generateHelper(List<String> lst, int n, String s, int open, int close) {

        if(open < close) return;

        if(open>n) return;
        if(close == n){
            lst.add(s);
            return;
        }
        generateHelper(lst,n,s+"(",open+1,close);
        generateHelper(lst,n,s+")",open,close+1);
        return;
    }
}
