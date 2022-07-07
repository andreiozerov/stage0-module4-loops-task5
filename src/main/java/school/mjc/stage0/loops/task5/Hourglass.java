package school.mjc.stage0.loops.task5;

public class Hourglass {
    private static final String EIGHT = "8";
    private static final String SPACE = " ";

    public void printHourglassOfGivenSize(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (((i == 0) || (i == height - 1))
                        || ((i <= (height - 1) / 2) && ((j >= i) && (j <= height - i - 1)))
                        || ((i > (height - 1) / 2) && ((j <= i) && (j >= height - i - 1)))) {
                    System.out.print(EIGHT);
                } else {
                    System.out.print(SPACE);
                }
            }
            System.out.println();
        }
    }
}
