package main;

import controller.SloveEquation;
import model.EquationModel;

public class Main {
    public static void main(String[] args) {
        EquationModel equationModel = new EquationModel();
        
        new SloveEquation(equationModel).run();
    }
    
}
