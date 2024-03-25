public class QuadDrawer {
    public String drawQuad(int n) {
        String quad = "";
        int row = 0;

        while (row < n) {
            int column = 0;
            while (column < n) {
                quad += "*";
                column++;
            }
            quad += "\n";
            row++;
        }

        return quad;
    }

    public static void main(String[] args) {
        QuadDrawer quadDrawer = new QuadDrawer();
        System.out.println(quadDrawer.drawQuad(6));
        String name = "lolo";
        name.matches("[0-9]+");
    }
}
