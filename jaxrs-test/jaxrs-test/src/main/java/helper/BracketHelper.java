package helper;

public class BracketHelper {
    private static int counter = 0;
    private static void calculateParanthesis(char str[], int pos, int n, int open, int close)
    {
        if(close == n)
        {
            // print the possible combinations
            for(int i=0;i<str.length;i++)
                System.out.print(str[i]);
            System.out.println();
            counter++;
            return;
        }
        else
        {
            if(open > close) {
                str[pos] = ')';
                calculateParanthesis(str, pos+1, n, open, close+1);
            }
            if(open < n) {
                str[pos] = '(';
                calculateParanthesis(str, pos+1, n, open+1, close);
            }
        }
    }

    // Wrapper over _printParenthesis()
    public static int calcuateParenthesis(char str[], int n)
    {
        counter = 0;
        if(n > 0)
            calculateParanthesis(str, 0, n, 0, 0);
        return counter;
    }
}
