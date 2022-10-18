import java.util.Scanner; 
class Main {
  public static int maior (int a, int b){
  if (a>b){
    return (a);
  }
    else{
      return(b);
    }}
  public static void main(String[] args) {
    
  Scanner entrada = new Scanner (System.in);
  System.out.println ("digite um numero:");
int a = entrada.nextInt();
System.out.println("digite outro numero:");
int b =entrada .nextInt();

System.out.println ("o maior numero é:" + maior(a,b));
  }
}