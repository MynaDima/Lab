package view;


public class View {

    private static volatile View instance;

    private View() {
    }

    public static View getInstance() {
        if (instance == null) {
            synchronized (View.class) {
                if (instance == null) {
                    instance = new View();
                }
            }
        }
        return instance;
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessageWithValue(String message, int value) {
        System.out.println(message + value);
    }
}
