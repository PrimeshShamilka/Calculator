package company.v2;


import company.v2.arguments.Arguments;
import company.v2.arguments.CmdLineArguments;
import company.v2.operation.Operation;
import company.v2.operation.OperationException;
import company.v2.operation.OperationFactory;
import company.v2.repository.FileNumberRepository;
import company.v2.repository.NumberRepository;
import company.v2.repository.NumberRepositoryException;
import company.v2.ui.Ui;
import company.v2.ui.consoleUi;

import java.util.List;

//Orchestration class - Main
public class Main {
    public static void main(String[] args) {

        CmdLineArguments arguments = new CmdLineArguments(args);
        NumberRepository repository = new FileNumberRepository();

        String operator= arguments.getOperation();
        List<Double> numbers = null;
        try {
            numbers = repository.getNumbers();
        } catch (NumberRepositoryException e) {
            System.out.println("An error occured while reading the numbers.");
            System.out.println(e);// use a logger here instead of using sout, use a logger framework like log4j
            // you should terminate the program here because you can't continue with a null number list
            return;
        }

        OperationFactory factory = new OperationFactory();
        Operation operation = factory.getInstance(operator,numbers);
        double result = 0;
        try {
            result = operation.perform();
        } catch (OperationException e) {
            e.printStackTrace();//use a logger instead of using sout
            System.out.println("Could not perform the operation");
            return;
        }
        Ui ui = new consoleUi();
        ui.showMessage("The result is :"+result);


    }
}
