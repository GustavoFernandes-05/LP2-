public class Encomenda {
    private String codigo, remetente, destinatario, endereco, cep;
    private boolean internacional;
    private double peso;
    public Encomenda(String codigo, String remetente, String destinatario, String endereco, String cep, boolean internacional, double peso) {
        this.codigo = codigo;
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.endereco = endereco;
        this.cep = cep;
        this.internacional = internacional;
        this.peso = peso;
    }
    public Encomenda(String codigo, String remetente, String destinatario,String endereco, String cep, double peso) {
        this(codigo, remetente, destinatario, endereco, cep, false, peso);
    }
    public double postar() {
        double valor;
        
        if (this.peso <= 100) {
            valor = 2.50;
        } 
        else if (this.peso <= 400) {
            valor = 12.00;
        } 
        else {
            double excesso = this.peso - 400;
            int blocosDe100g = (int) (excesso / 100); 
        
            if (excesso % 100 > 0) {
                blocosDe100g = blocosDe100g + 1;
            }

            valor = 12.00 + (blocosDe100g * 1.00);
        }
        if (this.internacional) {
            valor = valor + (valor * 0.15);
        }

        return valor;
    }
}
