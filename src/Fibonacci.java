public class Fibonacci {
    int termino;

    public Fibonacci(int termino){
        this.termino = termino;
    }

    public String getResult(){
        int num1 = 0, num2 = 1, suma = 0;
        String result = "";
        for(int i = 0; i<termino; i++){
            if(result == ""){
                result = String.valueOf(suma);
            }
            else{
                result = result + "," + suma;

            }
            suma = num1 + num2;
            num2 = num1;
            num1 = suma;
        }
        
        return result;
    }
    
}
