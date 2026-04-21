
/**
 * Escreva uma descrição da classe ComandaCliente aqui.
 * 
 * @author (Gustavo) 
 * @version (V.01)
 */
import java.util.Scanner;

public class ComandaCliente
{
    private float pesoprato;
    private int bebida;
    private float pesosbrmesa;
    private float total;
    private float clientb;
    private float clientp;
    private float clientsbr;
    
    
    public void pesagemCliente( )
    {
        System.out.println("Valor do prato o quiilo\n--> R$40.00\n Valor da sobremesa a quilo\n-->R$ 50.00");
        System.out.println("Valor da bebida por unidade\n-->R$2.00");
        pesoprato=0;
        pesosbrmesa=0;
        bebida=0;
        total=0;
        float vlpesoprato=0.04f;
        int vlbebida=2;
        float vlpesosbrmesa=0.05f;
    
        if(pesoprato==0){
              Scanner leitor= new Scanner(System.in);
        System.out.print("Digite qual o peso da comida\n-->");
        this.pesoprato=leitor.nextFloat();
        }
        if(pesosbrmesa==0){
               Scanner leitor= new Scanner(System.in);
        System.out.print("Digite qual o peso da sobremesa\n-->");
        this.pesosbrmesa=leitor.nextFloat();
            
        }
        if(bebida==0){
              Scanner leitor= new Scanner(System.in);
        System.out.print("Digite quantas Bebidas voce pegou\n-->");
        this.bebida=leitor.nextInt();
            
        }
        clientb=(this.bebida * vlbebida);
        clientp=(this.pesoprato * vlpesoprato);
        clientsbr=(this.pesosbrmesa * vlpesosbrmesa);
        total=clientb + clientp + clientsbr;

    }       
public void ConsultaChama()
{
    System.out.println("--------- EXTRATO DA COMANDA ---------");
    System.out.printf("Valor da bebida:    R$ %.2f\n", clientb);
    System.out.printf("Valor do almoço:    R$ %.2f\n", clientp);
    System.out.printf("Valor da sobremesa: R$ %.2f\n", clientsbr);
    System.out.println("--------------------------------------");
    System.out.printf("TOTAL A PAGAR:      R$ %.2f\n", total);
    System.out.println("--------------------------------------");
}
}