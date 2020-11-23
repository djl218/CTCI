class Insertion {
    public static void main(String[] args) {
        int n = 1000000000;
        int m = 10011;
        int i = 2;
        int j = 6;
        System.out.println("\n" + "The result is " + insertBinary(n, m, i, j) + "\n"); 

    }

    public static Integer insertBinary(int n, int m, int i, int j) {
        if (i > j || i < 0 || j >= 32) {
            return 0;
        }

        int allOnes = ~0;
        int left = j < 31 ? (allOnes << (j + 1)) : 0;
        int right = ((1 << i) - 1);
        int mask = left | right;
        n = n & mask;
        m = m << i;
        return n | m;        
    }
}