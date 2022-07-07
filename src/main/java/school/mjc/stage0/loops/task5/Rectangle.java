package school.mjc.stage0.loops.task5;

public class Rectangle {
    private static final String EIGHT = "8";
    private static final String SPACE = " ";

    public void printRectangleFrom8s(int length, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                if ((i == 0) || (i == height - 1)
                        || ((j == 0)) || (j == length - 1)) {
                    System.out.print(EIGHT);
                } else {
                    System.out.print(SPACE);
                }
            }
            System.out.println();
        }
    }
}
