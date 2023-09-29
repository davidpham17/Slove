package controller;

import common.Library;
import java.util.List;
import model.EquationModel;

import view.Menu;

public class SloveEquation extends Menu<String>{
    static String[] mc = {"Calculate Superlative Equation", "Calculate Quadratic Equation","Exit"};
    
    private final Library library;
    private final EquationModel equationModel;

    public SloveEquation(EquationModel equationModel) {
        super("========= Equation Program =========", mc);
        library = new Library();
        this.equationModel = equationModel;
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1 -> {
                sloveSuperlative();
            }
            case 2 -> {
                sloveQuadratic();
            }
            case 3 -> {
                System.out.println("Exit the program successfully!");
                System.exit(0);
            }
        }
    }       
    
    public void sloveSuperlative(){
        System.out.println("Enter a:");
        float a = library.inputFloat();
        System.out.println("Enter b:");
        float b = library.inputFloat();
        List<Float> results = equationModel.calculateSuperlative(a, b);
        displayResults(results);
    }
    
    public void sloveQuadratic(){
        System.out.println("Enter a:");
        float a = library.inputFloat();
        System.out.println("Enter b:");
        float b = library.inputFloat();
        System.out.println("Enter c:");
        float c = library.inputFloat();
        List<Float> results = equationModel.calculateQuadratic(a, b, c);
        displayResults(results);
    }
    
    public void displayResults(List<Float> results) {
        if (results.isEmpty()) {
            System.out.println("The equation has no solution!");
        } else {
            System.out.println("Solution:");
            for (Float result : results) {
                if (result != null) {
                    System.out.println("x = " + result);
                }
            }
            System.out.print("Number is Odd:");
            for (Float result : results) {
                if (result % 2 != 0) {
                    System.out.print(" " + result);
                }
            }
            System.out.println();

            System.out.print("Number is Even:");
            for (Float result : results) {
                if (result != null && result % 2 == 0) {
                    System.out.print(" " + result);
                }
            }
            System.out.println();

            System.out.print("Number is Perfect Square:");
            for (Float result : results) {
                if (result != null && isPerfectSquare(result)) {
                    System.out.print(" " + result);
                }
            }
            System.out.println();
        }
    }

    private boolean isPerfectSquare(float number) {
        float sqrt = (float) Math.sqrt(number);
        return (sqrt - Math.floor(sqrt)) == 0;
    }
    
    
}
