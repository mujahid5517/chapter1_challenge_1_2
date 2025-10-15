
public class LotteryAnalyzer {

    public static void main(String[] args) {
        // 1. Initialize the array with the winning lottery numbers
        String[] winningNumbers = {"12-34-56-78-90", "33-44-11-66-22", "01-02-03-04-05"};

        // 2. Variables to track the highest average found so far
        double highestAverage = 0.0;
        String winningNumberTicket = "";

        // 3. Process each winning number using a for-each loop
        for (String currentTicket : winningNumbers) {
            System.out.println("Analyzing: " + currentTicket);

            // 4. Remove the dashes to form one continuous string
            String digitString = currentTicket.replace("-", "");

            // 5. Convert the continuous string to a character array
            char[] digits = digitString.toCharArray();

            int digitSum = 0;
            // The total number of digits is the length of the character array
            int digitCount = digits.length; 

            // 6. Calculate the sum of the digits using a standard for loop
            // We use a standard for loop to explicitly show iteration over the index
            for (int i = 0; i < digitCount; i++) {
                // Character.getNumericValue converts the character ('1' to the integer 1)
                digitSum += Character.getNumericValue(digits[i]);
            }

            // 7. Calculate the average of the digits
            // We cast digitCount to double to ensure floating-point division
            double digitAverage = (double) digitSum / digitCount;

            // 8. Output analysis for the current ticket
            // We use String.format to ensure the average is displayed with one decimal place
            System.out.println(String.format("Digit Sum: %d, Digit Average: %.1f", digitSum, digitAverage));

            // 9. Check if the current average is the highest found
            if (digitAverage > highestAverage) {
                highestAverage = digitAverage;
                winningNumberTicket = currentTicket;
            }
        }

        System.out.println("\n-----------------------------------------------------");
        // 10. Final output: Announce the winning number with the highest average
        System.out.println(String.format("The winning number with the highest average is: %s with an average of %.1f", 
                                          winningNumberTicket, highestAverage));
        System.out.println("-----------------------------------------------------");
    }
}
