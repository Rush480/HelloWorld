import java.util.*;

public class SaveStarShip {
    public int calculateDistance(int distance) {
        if (distance < 0) {
            return distance * -1;
        }

        return distance;
    }

    public String[] getPlanets(String galaxy) {
        if (galaxy.equals("Miaru")) {
            return new String[]{"Maux", "Reux", "Piax"};
        }
        if (galaxy.equals("Milkyway")) {
            return new String[]{"Earth", "Mars", "Jupiter"};
        }
        if (galaxy.equals("DangerBanger")) {
            return new String[]{"Fobius", "Demius"};
        }
        return new String[0];

    }

    public String choosePlanet(long distanceToEarth) {

        if (distanceToEarth < 45677) {
            return "Earth";
        }
        return "Pern";
    }

    public int calculateFuelPrice(String fuel, int count) {

        if (fuel.equals("STAR100")) {
            return count * 70;
        }
        if (fuel.equals("STAR500")) {
            return count * 120;
        }
        if (fuel.equals("STAR1000")) {
            return count * 200;
        }
        return count * 50;
    }
  /*  public int roundSpeed(int speed) {
        int result = speed % 10;
        if (speed >= 10 && speed <= 100) {
            if (result >= 5) {
                return speed + (10 - result);
            }else{
                return speed - result;
            }
        }
        return speed;
    }*/

    public int roundSpeed(int speed) {
        int firstDigit = speed / 10;
        int lastDigit = speed % 10;

        if (lastDigit >= 5) {
            firstDigit++;
        }

        return firstDigit * 10;
    }

    public void calculateMaxPower() {

        Scanner scanner = new Scanner(System.in);
        float[] input = new float[3];
        for (int i = 0; i < 3; i++) {
            // System.out.println("Enter engine number " + (i + 1) + ": ");
            input[i] = scanner.nextInt();
        }
        float max = input[0];
        for (int i = 0; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
            }
        }

        if (max < 10) {
            System.out.println(max * 0.7f);
        } else if (max >= 10 && max <= 100) {
            System.out.println(max * 1.2f);
        } else {
            System.out.println(max * 2.1f);

        }
        scanner.close();
    }

    public int calculateNeededFuel(int distance) {
        int diff = distance - 20;
        if (distance > 20) {
            return (diff * 5) + 1000;
        }
        return 1000;
    }

    public String getMyPrizes(int ticket) {
        String str = "";
        if (ticket % 10 == 0) {
            str = "crystall";
        }
        if ( ticket % 10 == 7) {
            str = str.concat("chip");
        }
        if (ticket > 200) {
            str = str.concat(" coin");
        }

    return str;
    }
    public boolean isHangarOk(int side1, int side2, int price) {
        int bigger = 0;
        int smaller = 0;
        if (side1 > side2){
            bigger = side1;
            smaller = side2;
        }else{
            bigger = side2;
            smaller = side1;
        }
        return (side1 * side2) >= 1500 && bigger <= (2 * smaller) && price / (side1 * side2) <= 1000;
    }

    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));

        //Should be [Fobius, Demius]
        System.out.println(Arrays.toString(ship.getPlanets("Miari")));

        System.out.println(ship.choosePlanet(10));

        System.out.println(ship.calculateFuelPrice("STAR100", 10));

        System.out.println(ship.roundSpeed(13));

        System.out.println(ship.calculateNeededFuel(45));

        //Test stdin data - 1 3 5.
        //Console ouput should be 3.5
        ship.calculateMaxPower();

        System.out.println(ship.getMyPrizes(57));

        System.out.println(ship.isHangarOk(100, 75, 1000000));
    }
}

