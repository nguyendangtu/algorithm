package john_java8.annotation.example;

@RunAtStartup(priority = 10,method = "initial")
public class StartupClass1 {
    public void run() {
        System.out.println("Class 1 initialized!" );
        RunAtStartup runAtStartup = StartupClass1.class.getAnnotation(RunAtStartup.class);
        System.out.println(runAtStartup.priority());
        System.out.println(runAtStartup.method());

    }
    public static void main(String [] args){
        StartupClass1 startupClass1 = new StartupClass1();
        startupClass1.run();
    }
}
