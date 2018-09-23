package DesignPattern.behavioral.chainOfRepository;

public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println("File::Logger:" + message);
    }
}
