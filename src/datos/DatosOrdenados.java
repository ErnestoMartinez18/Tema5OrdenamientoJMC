
package datos;


public class DatosOrdenados {
    private int [] valores; 

    public DatosOrdenados(int[] valores) {
        this.valores = valores;
    }
    
    public int getSize(){
        return valores.length; 
    }
    
    @Override
    public String toString(){
        String cad = "Datos ordenados: ";
        for (int x : valores){
            cad += x + ", ";
        }
        return cad;
    }
    
}
