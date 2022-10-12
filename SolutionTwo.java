

public class SolutionTwo {
    public static void main(String[] args) {
        int i, j, k, current, result, operation = 0;

        for (i = 0; i < 19683; i++) {
            if (i % 3 == 0)
                continue;
            current = 0;
            result = 0;
            for (j = 1; j < 10; j++) {
                k = findnumber(i, j);
                if (k == 0) {
                    current = current * 10 + j;
                } else {
                    result = result + (operation == 1 ? current : -current);
                    current = j;
                    operation = k;
                }
            }
            result = result + (operation == 1 ? current : -current);
            if (result == 100) {
                for (j = 1; j < 10; j++) {
                    k = findnumber(i, j);
                    if (k == 0)
                        System.out.print(j);
                    else {
                        if (k == 1)
                            System.out.print("+" + j);
                        else
                            System.out.print("-" + j);
                    }
                }
                System.out.println();
            }
        }
    }
    static int findnumber(int i, int j) {
        int k, n = 0;
        for (k = 0; k < j; k++) {
            n = i % 3;
            i = i / 3;
        }
        return n;
    }
}
