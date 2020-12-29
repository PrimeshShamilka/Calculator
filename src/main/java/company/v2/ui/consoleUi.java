package company.v2.ui;

public class consoleUi implements Ui {
    @Override
    public void showMessage(String message) {
        System.out.println(message);

    }
}
