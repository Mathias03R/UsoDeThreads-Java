package usothreads;

public class UsoThreads {

    public static void main(String[] args) {
        Hilo hiloPrincipal = new Hilo("Hilo Principal");
        
        hiloPrincipal.run();
        
        hiloPrincipal.cambiarNombre("Main Thread");
        hiloPrincipal.establecerPrioridad(10);
        
        hiloPrincipal.start();
    } 
}
