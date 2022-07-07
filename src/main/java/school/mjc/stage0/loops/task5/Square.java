package school.mjc.stage0.loops.task5;

public class Square {
    private static final String EIGHT = "8";
    private static final String SPACE = " ";

    public void printSquareFrom8s(int sideLength) {
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if (((i == 0) || (i == sideLength - 1))
                        || ((j == 0) || (j == sideLength - 1))) {
                    System.out.print(EIGHT);
                } else {
                    System.out.print(SPACE);
                }
            }
            System.out.println();
        }
    }
}
