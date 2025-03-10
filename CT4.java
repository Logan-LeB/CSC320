import java.util.Scanner;

public class CT4 {

    public static void main(String[] args) {
        printData(getInputFloatValues());
    }

    public static void printData(Float[] inputValues) {
        boolean validInput = true;
        for (Float value : inputValues){
            if (value == null){
                validInput = false;
                }
            }
        if (validInput){
            Float totalValue = getTotal(inputValues);
            Float avgValue = getAvg(inputValues);
            Float maxValue = getMax(inputValues);
            Float minValue = getMin(inputValues);
            Float interestValue = getInterest(inputValues, 0.20f);
            System.out.println("Total: " + totalValue);
            System.out.println("Average: " + avgValue);
            System.out.println("Max: " + maxValue);
            System.out.println("Min: " + minValue);
            System.out.println("Interest on total at 20%: " + interestValue);
            } 
        else {
                System.out.println("The program did not run successfully. Please try again.");
            }
    }

    public static Float[] getInputFloatValues() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please begin your values and press enter after each line. \n Entering an invalid value three times will cancel this.");
        int counter = 0;
        int badInputCounter = 0;
        Float[] outputFloatArray = new Float[5];
        while (counter < 5) {
            try {
                System.out.println("Enter value. Value " + (counter + 1) + " of 5.");
                String input = scanner.nextLine();
                Float inputValue = Float.parseFloat(input);
                outputFloatArray[counter] = inputValue;
                counter++;

            } catch (NumberFormatException e) {
                System.out.println("Incorrect format, attempt " + (badInputCounter + 1) + " of 3.");
                badInputCounter++;
                if (badInputCounter > 2){
                    break;
                    }
                }

            }
        scanner.close();
        return outputFloatArray;
    }

    public static Float getTotal(Float[] inputValues){
        
        float total = 0.0f;
        for (int counter = 0; counter < inputValues.length; counter++){
            total += inputValues[counter];
            }
        return total;
        }
    
    public static Float getAvg(Float[] inputValues){
        float avg = getTotal(inputValues) / 5;
        return avg;
        }

    public static Float getMax(Float[] inputValues){
        float max = Float.NEGATIVE_INFINITY;
        for (Float value : inputValues){
            if (value > max) {
                max = value;
                }
            }
        return max;
        }

    public static Float getMin(Float[] inputValues){
        float min = Float.POSITIVE_INFINITY;
        for (Float value : inputValues){
            if (value < min) {
                min = value;
                }
            }
        return min;
        }
    
    public static Float getInterest(Float[] inputValues, float interestAmount){
        return getTotal(inputValues) * interestAmount;
    }
}