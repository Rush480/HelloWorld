public class Rectangle {

    public static void main(String[] args) {
        int height = 2;
        int width = 5;
        char symbol = 'с';

        drawRectangle(height, width, symbol);
    }

    public static void drawRectangle(int height, int width, char symbol) {
        int i = 0;
        while (i < height) {
            int j = 0;
            while (j < width) {
                System.out.print(symbol);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
