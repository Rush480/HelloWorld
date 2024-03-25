public class CaptainDisputeAgain {

    public int findMin(int[] triple) {

        int min = triple[0];
        for (int i = 0; i < triple.length; i++) {
            min = (triple[i] < min) ? triple[i] : min;
        }
        return min;

    }


    public static void main(String[] args) {
        CaptainDisputeAgain captainDisputeAgain = new CaptainDisputeAgain();
        captainDisputeAgain.findMin(new int[] {50, 4, 100});

    }
}
