
public class RunnableDemo {
    public static void main(String[] args) {

        // !! - Write an anonymous Runnable class here
        //It can just print out "Anonymous run" or similar
//      Dear Casey, This is a a concrete class not an anonymous class. Your Friend, Java
//        class Runnable {
//            public void run() {
//                System.out.println("Running, version 1.");
//            }
//        }


        Runnable anonRun = new Runnable() {
            @Override
            public void run() {
                System.out.println("Override run with anon class.");
            }
        };

        anonRun.run();

        // !! - Write a lambda function here
        //It can also print out something like "Lambda run"
        Runnable lambda = ()->{
            System.out.println("stuff");
        };

        lambda.run();

    }
}
