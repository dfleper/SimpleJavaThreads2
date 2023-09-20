package SimpleJavaThreads2;

public class SimpleJavaThreads2 {

    public static void main(String[] args) {
        Ciclo Hilo1 = new Ciclo();
        Ciclo Hilo2 = new Ciclo();
        Ciclo Hilo3 = new Ciclo();
        Hilo1.start();
        Hilo2.start();
        Hilo3.start();
    }
}
