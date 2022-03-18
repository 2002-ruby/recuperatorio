public class Scan {

    public String mostrarSerie(int numero){
        int suma = 0;
        String resultado = "";
        for (int i=1; i <=numero *2; i+=2){
            suma +=i;
            if(i==1){
                resultado = String.valueOf(i);
            }
            else{
                resultado = resultado + "+" + i;
            }
        }
        return resultado + " = " +suma;
        
    }
}
