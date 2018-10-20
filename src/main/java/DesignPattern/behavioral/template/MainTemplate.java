package DesignPattern.behavioral.template;

public class MainTemplate {
    public static void main(String args[]) {
        EventTemplate dbsEvent = new DBSEvent();
        EventTemplate hadoopEvent = new HadoopEvent();
        dbsEvent.populateEvent();
        hadoopEvent.populateEvent();
    }

}
