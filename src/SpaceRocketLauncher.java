public class SpaceRocketLauncher {

    private int bigRocketCount;
    private int smallRocketCount;

    public int getBigRocketCount() {
        return bigRocketCount;
    }

    public void setBigRocketCount(int bigRocketCount) {
        if (bigRocketCount < 0 || bigRocketCount >= 100) {
        } else {
            this.bigRocketCount = bigRocketCount;
        }
    }

    public int getSmallRocketCount() {
        return smallRocketCount;
    }

    public void setSmallRocketCount(int smallrocketCount) {
        if (smallrocketCount < 0 || smallrocketCount >= 100) {
        } else {
            this.smallRocketCount = smallrocketCount;
        }
    }
    public void launchBigRocket(){
        if (this.bigRocketCount > 0){
            --bigRocketCount;
            System.out.println("Launch big rocket");
        }
    }
    public void launchSmallRocket(){
        if (this.smallRocketCount > 0){
            --smallRocketCount;
            System.out.println("Launch small rocket");
        }
    }
    public int getTotalPower(){
        int big = this.bigRocketCount * 100;
        int small = this.smallRocketCount * 50;
        return big + small;
    }

    public static void main(String[] args) {
        SpaceRocketLauncher launcher = new SpaceRocketLauncher();
        launcher.setBigRocketCount(5);
        launcher.setSmallRocketCount(10);

        System.out.println("Power is " + launcher.getTotalPower());

        launcher.launchBigRocket();
        System.out.println("Big rocket count is " + launcher.getBigRocketCount());

        launcher.launchSmallRocket();
        System.out.println("Small rocket count is " + launcher.getSmallRocketCount());

        System.out.println("Power is " + launcher.getTotalPower());
    }
}
