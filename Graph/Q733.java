package Graph;

import java.util.Arrays;

public class Q733 {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1;
        int sc = 1;
        int color = 2;

        System.out.println(Arrays.deepToString(floodFill(image, sr, sc, color)));
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int ini = image[sr][sc];
        if (ini == color) return image;

        image[sr][sc] = color;

        if (sr - 1 >= 0 && image[sr - 1][sc] == ini) {
            floodFill(image, sr - 1, sc, color);
        }
        if (sc - 1 >= 0 && image[sr][sc - 1] == ini) {
            floodFill(image, sr, sc - 1, color);
        }
        if (sr + 1 < image.length && image[sr + 1][sc] == ini) {
            floodFill(image, sr + 1, sc, color);
        }
        if (sc + 1 < image[sr].length && image[sr][sc + 1] == ini) {
            floodFill(image, sr, sc + 1, color);
        }

        return image;
    }
}
