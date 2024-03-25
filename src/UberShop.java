import java.util.*;

import static java.util.Arrays.*;

public class UberShop {
    public void printPrices(float[] prices) {
        for (float price : prices) {
            System.out.println(price + " jup.");
        }
    }

    public void multiplyPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            float price = prices[i];

            if (price < 1000) {
                price *= 2f;
            } else {
                price *= 1.5f;
            }

            prices[i] = price;
        }
    }

    public int[] findMinMaxPrices(int[] prices) {
        if (prices.length == 0) {
            return new int[0];
        }

        int min = prices[0];
        int max = prices[0];

        for (int price : prices) {
            if (price > max) {
                max = price;
            }

            if (price < min) {
                min = price;
            }
        }

        if (min == max) {
            return new int[]{min};
        }

        return new int[]{min, max};
    }

    public int getMinPriceCount(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        sort(prices);
        int count = 1;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] == prices[i + 1]) {
                count++;
            } else {
                break;
            }


        }
        return count;
    }

    public int[] removePrice(int[] prices, int toRemove) {
        int count = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == toRemove) {
                count++;
            }
        }
        int[] newPrices = new int[prices.length - count];
        int index = 0;
        for (int price : prices) {
            if (price != toRemove) {
                newPrices[index] = price;
                index++;
            }

        }
        return newPrices;
    }

    public int[] leavePrice9(int[] prices) {
        int count = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] % 10 == 9) {
                count++;
            }
        }
        int[] newPrices = new int[count];
            int index = 0;
            for (int i = 0; i < prices.length; i++) {
                if (prices[i] % 10 == 9) {
                    newPrices[index] = prices[i];
                    index++;
                }
            }

        return newPrices;
    }
    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks){

        String[] result = new String[showcaseStocks.length + warehouseStocks.length];
        System.arraycopy(showcaseStocks, 0, result, 0, showcaseStocks.length);
        System.arraycopy(warehouseStocks, 0, result, showcaseStocks.length, warehouseStocks.length);
        return result;
    }
    public int getPricesSum(int[] prices, int minPrice, int maxPrice) {
        int sum = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i]>= minPrice && prices[i]<= maxPrice){
                sum += prices[i];
            }else{
                sum += 0;
            }

        }
        return sum;
    }
    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be 144 - 20 + 50 + 40 + 34
        int[] prices = new int[] {10, 20, 50, 40, 34, 500};
        System.out.println(shop.getPricesSum(prices, 20, 50));
    }
}