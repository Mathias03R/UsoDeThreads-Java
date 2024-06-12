package usothreads;

public class Hilo extends Thread{

    public Hilo(String name) {
        super(name);
    }
    
    @Override
    public void run(){
        System.out.println("-------------------------------");
        System.out.println("Hilo principal iniciado");
        System.out.println("El nombre del hilo es "+getName());
        System.out.println("La prioridad del hilo es "+getPriority());
        System.out.println("Hilo principal terminado");
        System.out.println("-------------------------------");
    }
    
    public void cambiarNombre(String nombre){
        setName(nombre);
        System.out.println("El nuevo nombre del hilo es "+nombre);
    }
    
    public void establecerPrioridad(int entero){
        setPriority(entero);
        System.out.println("Prioridad establecida en "+entero);
    }
}
