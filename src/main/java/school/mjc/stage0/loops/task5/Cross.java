package school.mjc.stage0.loops.task5;

public class Cross {
    private static final String EIGHT = "8";
    private static final String SPACE = " ";

    public void printCross(int sideLength) {
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if ((i == sideLength / 2) || (j == sideLength / 2)) {
                    System.out.print(EIGHT);
                } else {
                    System.out.print(SPACE);
                }
            }
            System.out.println();
        }
    }
}
