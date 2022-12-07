package DesignPattern.behavioral.chainOfRepository;

/***
 * chain-of-responsibility pattern is a behavioral design pattern consisting of a source of command objects
 * and a series of processing objects.[1] Each processing object contains logic that defines the types of command
 * objects that it can handle; the rest are passed to the next processing object in the chain.
 * A mechanism also exists for adding new processing objects to the end of this chain.
 */
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
