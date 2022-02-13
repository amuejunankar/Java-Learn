public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {4,0,2,2,0};
        System.out.println(ans(arr));
    }
    public static int ans(int[] arr) {
        int unique=0;
        for (int n : arr) {
            unique ^= n;
        }
        return unique;
    }
}


// ? FIND UNIQUE NUMBER IN ARRAY