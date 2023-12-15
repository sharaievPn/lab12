package main.java.org.example.ftask;

public class ATM {
    private Handler firstHandler;

    public ATM() {
        firstHandler = new HandlerFiveHundred();
        Handler handlerFifty = new HandlerFifty();
        firstHandler.setNext(handlerFifty);
        handlerFifty.setNext(new HandlerFive());
    }

    public void process(int amount) {
        firstHandler.process(amount);
    }
}
