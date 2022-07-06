public class coche {
    private int puertas;

    public coche(int puertas){
        this.puertas=puertas;

    }
    public void añadirPuertas(int puertas){
        this.puertas+=puertas;
    }
    public void numPuertas(){
        System.out.println("Numero de puertas:" + puertas);
    }

}
