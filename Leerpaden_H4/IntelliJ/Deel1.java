import java.util.HashMap;

public class Deel1 {
    public static void main(String[] args) {
        Deel1 a = new Deel1();

    }
    public void printLarger(int a, int b){
        System.out.print(a > b ? a : b);
    }

    public void conditioneleOperator(){
        /*
    x >= 5 ? x : -x

        x > y ? x : y

         */
    }


    public void printAttitude(int paramter){
        /*
        if (paramter == 1){
            System.out.println("disagree");
        } else if (paramter == 2){
            System.out.println("no opinion");
        } else if (paramter == 3){
            System.out.println("agree");
        }

         */


        HashMap<Integer, String> hm = new HashMap<>() {
            {
                put(1, "disagree");
                put(2, "no opinion");
                put(3, "agree");
            }
        };
        if (hm.containsKey(paramter)){
            System.out.println(hm.get(paramter));
        }

    }

    public void deel3(){
        /*
        int speed = 5;
        if (speed < 0){
            reverseDrivers++;
        } else if (speed < 1){
            parkedDrivers ++;
        } else if (speed < 40){
            slowDrivers++;
        } else if (speed <= 65){
            safeDrivers++;
        } else {
            speeders++;
        }


        if (pH < 7.0){
            acid = 1;
            neutral = 0;
            base = 0;
        } else if (pH == 7.0){
            acid = 0;
            neutral = 1;
            base = 0;
        } else {
            acid = 0;
            neutral = 0;
            base = 1;
        }

         */
    }

    public void deel2(){
        /*
        if (age >= 65){
            seniorCitizens++;
        } else {
            nonSeniors++;
        }

        if (soldYesterday>soldToday ){
            salesTrend = -1;
        } else {
            salesTrend = 1;
        }


        if (x>y){
            max = x;
        } else {
            max = y;
        }

        boolean workedOvertime;
        int hoursWorked = 5;
        if (hoursWorked > 40){
            workedOvertime = true;
        } else {
            workedOvertime = false;
        }

         */
    }

    public void deel1(){
        /*
        int goodsSold = 450000;
        int bonus;
        if (goodsSold > 500000){
            bonus = 10000;
        }

        int shelfLife = 9;
        int outsideTemperature = 80;
        if (outsideTemperature > 90){
            shelfLife -= 4;
        }

        double gpa,  deansList,  studentName;
        gpa = 3.6;
        studentName = 9.0;
        deansList = 1.0;
        if (gpa > 3.5){
            deansList++;
            System.out.println(studentName);
        }

        int x=2, y=1, z=5, min;
        if (x>y){
            if (y>z){
                min = z;
            } else {
                min = y;
            }
        } else{
            if (x>z){
                min = z;
            } else {
                min = x;
            }
        }

         */
    }
}
