
/**
 * Write a description of class Matriz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Matriz
{
    private int[][]datos;
    public Matriz(int n){
        datos= new int [n][n];
        //llenar();
    }
    private void llenar(){
        int dato=0;
        for(int i=0;i<datos.length;i++){
            for(int j=0;j<datos[0].length;j++){
                datos[i][j]=dato;
                //dato++;
            }
        }
    }
    public String recorridoCaracol(){
        int dato=1;
        int b=datos.length-1;
        int a=0;
        for(int i=0;i<datos.length;i++){
            for(int j=a;j<=b;j++){
                datos[a][j]=dato;
                dato++;
            }
            for(int j=a+1;j<=b;j++){
                datos[j][b]=dato;
                dato++; 
            }
            for(int j=b-1;j>=a;j--){
                datos[b][j]=dato;
                dato++; 
            }
            for(int j=b-1 ;j>=a+1;j--){
                datos[j][a]=dato;
                dato++; 
            }
            a++;
            b--;
        }
        
        return mostrar();
    }
    public String recorridoPrincipaSecundario(){
        int dato=1;
        int pj=0;
        int sj=datos[0].length-1;
        for(int pi=0;pi<datos.length;pi++){
            datos[pi][pj]=dato;
            pj++;
        }
        for(int si=0;si<datos.length && sj>=0;si++){
            datos[si][sj]=dato;
            sj--;
        }
        return mostrar();
    }
    private String mostrar(){
        String reporte;
        reporte="";
        for(int fil=0;fil<datos.length;fil++){
            for(int col=0;col<datos[0].length; col++){
                reporte=reporte+datos[fil][col]+"\t";
            }
            reporte=reporte+"\n";
        }
        return reporte;
    }
}
