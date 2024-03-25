class Stars {
    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    private int count = 0;

    @Override
    public String toString() {
        int temp = count;
        String result = "";

        int[] digits = new int[String.valueOf(count).length()];
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        for (int i = 0; i < digits[0]; i++) {
            result = result.concat("X");
        }
        for (int i = 0; i < digits[1]; i++) {
            result = result.concat("Y");
        }
        for (int i = 0; i < digits[2]; i++) {
            result = result.concat("Z");
        }
        for (int i = 0; i < digits[3]; i++) {
            result = result.concat("*");
        }
        return result;
    }


    public static void main(String[] args) {
        Stars stars = new Stars();

        stars.setCount(9345);
        System.out.println(stars);
    }
}
