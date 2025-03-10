
public class CT3 {

    public static void main(String[] args) {
        float[] inputFloats = {499.00f, 1000.50f, 2100.95f, 2600.99f};
        printTaxWithholding(inputFloats);
    }

    public static void printTaxWithholding(float[] inputValues) {
        float withholding = 0.00f;
        for (float income : inputValues){
			if (income < 500){
				withholding = income * 0.10f;
				System.out.printf("A weekly income of $%.2f would fall into the less than $500 tax bracket.%n", income );
                System.out.printf("Their tax withholding would be $%.2f%n", withholding);
                }
            else if (income < 1500){
                withholding = income * 0.15f;
                System.out.printf("A weekly income of  $%.2f would fall into the less than $1500 tax bracket.%n", income );
                System.out.printf("Their tax withholding would be $%.2f%n", withholding);
                }
            else if (income < 2500){
                withholding = income * 0.20f;
                System.out.printf("A weekly income of  $%.2f would fall into the less than $2500 tax bracket.%n", income );
                System.out.printf("Their tax withholding would be $%.2f%n", withholding);
                }
            else{
                withholding = income * 0.30f;
                System.out.printf("A weekly income of  $%.2f would fall into the more than $2500 tax bracket.%n", income );
                System.out.printf("Their tax withholding would be $%.2f%n", withholding);
                }
			}
    }
}
