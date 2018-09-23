package DesignPattern.chainOfRepository;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println("Error::Logger:" + message);
    }
}
