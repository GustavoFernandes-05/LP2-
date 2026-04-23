public class Aplicativo
{
    private String nome;
    private String objetivo;
    private float tamanhoMB;
    private float precoMensal;
    private Empresa dev;

    public Aplicativo(String nome, String objetivo, float tamanhoMB, float precoMensal, Empresa dev)
    {
        this.nome=nome;
        this.objetivo=objetivo;
        this.tamanhoMB=tamanhoMB;
        this.precoMensal=precoMensal;
        this.dev=dev;
    }
    public String getObjetivo() 
    { 
        return objetivo; 
    
    }
    public float getPrecoMensal() 
    { 
        return precoMensal; 
    }
    public boolean podeSubstituir (Aplicativo outroAplicativo)
    {
        return this.objetivo.equalsIgnoreCase(outroAplicativo.getObjetivo()) && this.precoMensal <= outroAplicativo.getPrecoMensal(); 
    }
    public void imprimirDados()
    {     
        System.out.println("<--------------------------->");
        System.out.println("Dados do Aplicativo da AppleStore");
        System.out.println("Nome do app--> " + this.nome);
        System.out.println("Tamanho do app--> " + this.tamanhoMB + "MB");
        System.out.println("O que o app apresenta--> " + this.objetivo);
        System.out.println("Empresa desenvolvedora--> " + this.dev.getNome());
        System.out.println("Preco da assinatura--> " + this.precoMensal);
        System.out.println("<--------------------------->");
    }
}
