package neu.jia.assignment01;


//Question 6: Write a program to calculate the monthly telephone bills as per the following rule:
// Minimum $ 200 for up to 100 calls.
//Plus $ 0.60 per call for next 50 calls.
//Plus $ 0.50 per call for next 50 calls.
//Plus $ 0.40 per call for any call beyond 200 calls.

public class TelephoneBill {

    public static void main(String[] args) {
        TelephoneBill tb = new TelephoneBill();
        double result = tb.calculatePhoneBill(200);
        System.out.println("Your Telephone Bill is: $" + result + ".");
    }

    public double calculatePhoneBill(int callNumberSum) {
        String callCategory = callCategory(callNumberSum);

        double result = 0;
        switch (callCategory) {
            case "below100":
                result = 200;
                break;
            case "100to150":
                result = 200 + (callNumberSum - 100) * 0.6;
                break;
            case "150to200":
                result = 200 + 50 * 0.6 + (callNumberSum - 150) * 0.5;
                break;
            case "beyond200":
                result = 200 + 50 * 0.6 + 50 * 0.5 + (callNumberSum - 200) * 0.4;
        }
        return result;
    }

    private String callCategory(int callNumber) {
        if (callNumber <= 100) {
            return "below100";
        } else if (callNumber > 100 && callNumber <= 150) {
            return "100to150";
        } else if (callNumber > 150 && callNumber <= 200) {
            return "150to200";
        } else {
            return "beyond200";
        }
    }
}
