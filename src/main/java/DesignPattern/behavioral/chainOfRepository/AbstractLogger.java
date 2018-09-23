package DesignPattern.behavioral.chainOfRepository;

public abstract class AbstractLogger {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    protected int level;

    protected AbstractLogger nextLogger;

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }

        if (null != nextLogger) {
            nextLogger.logMessage(level, message);
        }
    }

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    abstract void write(String message);

}
