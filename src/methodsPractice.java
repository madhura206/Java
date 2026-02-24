public class methodsPractice {
    static int logic(int x, int y) {
        if (x % 2 == 0)
            return x + y;
        else
            return x * y;
    }

    static int logic1(int x, int y) {
        if (x % 2 == 0)
            return x + y;
        else
            return x * y;
    }


    static int logic2(int x, int y) {
        // Reverse the bigger number
        int bigger;

        if (x > y)
            bigger = x;
        else
            bigger = y;

        int rev = 0;

        while (bigger > 0) {
            int digit = bigger % 10;
            rev = rev * 10 + digit;
            bigger = bigger / 10;
        }

        return rev;
    }
    public static void main(String[] args) {

        int a = 5;
        int b = 4;
        int c = 9;
        int d = 10;
        int x = 8;
        int y = 7;

        int result = logic1(a, b);
        int result1 = logic1(c,d);
        int result2 = logic2(x,y);


        System.out.println("Result = " + result);
        System.out.println("Result = " + result1);
        System.out.println("Result = " + result2);
    }


}

