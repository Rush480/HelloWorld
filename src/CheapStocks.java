import java.util.Arrays;

public class CheapStocks {
    public String getCheapStocks(String[] stocks) {
        String result = " ";
        for (int i = 0; i < stocks.length; i++) {
            String[] parts = stocks[i].split(" ");
            //System.out.println(Arrays.toString(parts));
            if (Integer.parseInt(parts[1]) < 200) {

                result = result + parts[0] + " ";
            }

        }
        return result;
    }


    public static void main(String[] args) {
        CheapStocks cheapStocks = new CheapStocks();
        System.out.println(cheapStocks.getCheapStocks(new String[]{"gun 500", "firebow 70", "pixboom 200", "pixel 100", "pixelboom 150"}));
    }
}
