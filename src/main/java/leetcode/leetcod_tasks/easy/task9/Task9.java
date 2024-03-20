package leetcode.leetcod_tasks.easy.task9;

public class Task9 {

    public static boolean isPalindrome(int x) {
        String stt = new StringBuilder(String.valueOf(x)).reverse().toString();
        System.out.println(stt);
        return String.valueOf(x).equals(new StringBuilder(x).reverse().toString());


    }

    public static void main(String[] args) {

        isPalindrome(121);
    }

}

