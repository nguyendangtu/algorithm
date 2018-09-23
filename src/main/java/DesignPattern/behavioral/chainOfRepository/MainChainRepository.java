package DesignPattern.behavioral.chainOfRepository;

public class MainChainRepository {
    public AbstractLogger getChainLogger() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.DEBUG);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(consoleLogger);
        consoleLogger.setNextLogger(fileLogger);
        return errorLogger;
    }

    public static void main(String args[]) {
        MainChainRepository mainChainRepository = new MainChainRepository();
        AbstractLogger errorLogger = mainChainRepository.getChainLogger();
        errorLogger.logMessage(AbstractLogger.INFO, "this is a information");
        errorLogger.logMessage(AbstractLogger.DEBUG, "this is an error");
        errorLogger.logMessage(AbstractLogger.ERROR, "this is a debug");
    }
}
