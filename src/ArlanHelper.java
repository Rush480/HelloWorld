public class ArlanHelper {
    public String drawQuad(int n){
        String result = "";
        while (n > 0){
            result = result.concat("*"  + "\n");
            n--;
        }
        return result;
    }
    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //**
        //**
        System.out.println(helper.drawQuad(4));
    }
}
