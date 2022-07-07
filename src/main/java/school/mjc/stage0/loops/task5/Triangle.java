package school.mjc.stage0.loops.task5;

public class Triangle {
    private static final String EIGHT = "8";
    private static final String SPACE = " ";

    public void printTriangle(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
            for (int j = 0; j < cathetusLength; j++) {
                if (j <= i) {
                    System.out.print(EIGHT);
                } else {
                    System.out.print(SPACE);
                }
            }
            System.out.println();
        }
    }
}
