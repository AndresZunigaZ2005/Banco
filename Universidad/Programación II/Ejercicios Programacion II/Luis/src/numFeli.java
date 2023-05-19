import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class numFeli {
 
    public static void main(String[] args) throws IOException {
 
       Scanner a= new Scanner(System.in);
       int N= a.nextInt();
       
       int cant1=0;
       int cant2=0;
       
       for(int i=0; i<N; i++){
           String problem= a.next();
            for(int j=0; j<problem.length();j++){
                
                if(problem.charAt(j)==('<')){
                    cant1++;
                }
                else if(problem.charAt(j)=='>'){
                    cant2++;
                }
            }
            if(cant1>cant2){
                System.out.println(cant2);
            }
            else{
                System.out.println(cant1);
            }
       }
       
       
       
 
    }
 
}