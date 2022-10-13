class Solution {
    public static void main(String[] args){
        int n=5;
        printnum(8);

    }
    static void printnum(int n){
        if (n==0)
            return;
        System.out.println(n);
        printnum(n-1);

    }

    }
