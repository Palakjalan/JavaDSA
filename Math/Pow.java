
class Pow {

    public double myPow(double x, int n) {

        if (x == 1 || n == 1 || x == 0)
            return x;

        double pow = 1;

        if (n == 0)
            return 1;

        long N = n;

        if (N < 0) {
            N = -N;
            x = 1 / x;
        }

        while (N > 0) {

            if (N % 2 == 1) {
                pow *= x;
            }

            x *= x;
            N /= 2;
        }

        return pow;
    }
    public static void main(String[] args) {

        Pow obj = new Pow();

        double x = 2.0;
        int n = 10;

        double result = obj.myPow(x, n);

        System.out.println("Answer = " + result);
    }
}