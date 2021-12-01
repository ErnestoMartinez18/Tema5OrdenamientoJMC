package datos;

public class DatosDesordenados {

    int i, j, temporal, pasadas;

    public DatosDesordenados() {
        this.i = 0;
        this.j = 0;
        this.temporal = 0;
    }

    //Metodo burbuja version 1
    public String burbuja(int[] arreglo) {
        pasadas = 0;
        for (i = 0; i < arreglo.length; i++) {
            for (j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    temporal = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temporal;
                }
                pasadas++;
            }
        }
        System.out.println("Termino en " + pasadas + " Pasadas");
        return mostrarArreglo(arreglo);
    }

    //Metodo burbuja version 2
    public void burbija2(int[] arreglo) {
        pasadas = 0;
        for (i = 1; i < arreglo.length; i++) {
            for (j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                }
                pasadas++;
            }
        }
        System.out.println("Termino en " + pasadas + " Pasadas");
    }
    
    public String burbujaDesendente(int[] arreglo){
        pasadas=0;
        for(i=1;i<arreglo.length;i++){
            for(j=0;j<arreglo.length-1;j++){
                if(arreglo[j]<arreglo[j+1]){
                    temporal=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=temporal;
                }
                pasadas++;
            }
        }
        System.out.println("Termino en "+pasadas+" Pasadas");
        return mostrarArreglo(arreglo);
}

    //Metodo Radix
   
    
     public String quick(int[] arreglo, int primero,int ultimo){
      
        int i,j,pivote,auxiliar;
        
        i=primero;
        j=ultimo;
        
        pivote=arreglo[(primero+ultimo)/2];
        System.out.println("El pivote es: "+pivote);
        
        do{
            while(arreglo[i]<pivote){
                i++;
            }
            while(arreglo[j]>pivote){
                j--;
            }
            //Aqui hacemos el intercambio
            if(i<=j){
                auxiliar=arreglo[i];
                arreglo[i]=arreglo[j];
                arreglo[j]=auxiliar;
                i++;
                j--;
            } 
        }while(i<=j);
        if(primero<j){
            quick(arreglo,primero,j);
        }
        if(i<ultimo){
            quick(arreglo,i,ultimo);
        }
        return mostrarArreglo(arreglo);
    }
     
     public String quickDesendente(int[] arreglo, int primero,int ultimo){
      
        int i,j,pivote,auxiliar;
        
        i=primero;
        j=ultimo;
        
        pivote=arreglo[(primero+ultimo)/2];
        System.out.println("El pivote es: "+pivote);
        
        do{
            while(arreglo[i]>pivote){
                i++;
            }
            while(arreglo[j]<pivote){
                j--;
            }
            //Aqui hacemos el intercambio
            if(i<=j){
                auxiliar=arreglo[i];
                arreglo[i]=arreglo[j];
                arreglo[j]=auxiliar;
                i++;
                j--;
            } 
        }while(i<=j);
        if(primero<j){
            quickDesendente(arreglo,primero,j);
        }
        if(i<ultimo){
            quickDesendente(arreglo,i,ultimo);
        }
        return mostrarArreglo(arreglo);
    }

     
    
    //Metodo para Insersion
    public void insersion(int[] arreglo, int n){
        int i,j,auxiliar;
        for(i=1;i<n;i++){
            auxiliar=arreglo[i];
            j=i-1;
            while(j>=0 && arreglo[j]>auxiliar){
                arreglo[j+1]=arreglo[j];
                j=j-1;
            }
            arreglo[j+1]=auxiliar;
        }
        System.out.println("Arreglo Ordenado por Insercion");
        mostrarArreglo(arreglo);
    }
    
    //Metodo para Shell
   
    

    public String mostrarArreglo(int[] arreglo) {
        int k;
        String cadena = "";
        for (k = 0; k < arreglo.length; k++) {
            System.out.print("[" + arreglo[k] + "]" + "\n");
            cadena = cadena + (k + 1) + "----->" + "[" + arreglo[k] + "]" + "\n";
        }
        System.out.println("");
        return cadena;
    }

}
