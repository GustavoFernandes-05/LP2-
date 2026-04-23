public class Passagem {
    public String identificador;
    public String origem;
    public String destino;
    public String dataHoraPartida;
    public String tipoPassagem;
    public String cpfPassageiro;
    public int numeroAssento;
    public double precoBase;

    public Passagem(String identificador, String origem, String destino, String dataHoraPartida, String tipoPassagem, double precoBase) {
        this.identificador = identificador;
        this.origem = origem;
        this.destino = destino;
        this.dataHoraPartida = dataHoraPartida;
        this.tipoPassagem = tipoPassagem;
        this.precoBase = precoBase;
        this.cpfPassageiro = "";
        this.numeroAssento = 0;
    }
    public Passagem(String identificador, String origem, String destino, String dataHoraPartida, String tipoPassagem, double precoBase, String cpfPassageiro) {
        this(identificador, origem, destino, dataHoraPartida, tipoPassagem, precoBase);
        this.cpfPassageiro = cpfPassageiro;
    }
    public void escolherAssento(int numeroAssento) {
        this.numeroAssento = numeroAssento;
    }
    public void cancelarPassagem() {
        this.cpfPassageiro = "";
        this.numeroAssento = 0;
    }
    public double calcularPreco() {
        double acrescimo = 0.0;

        switch (this.tipoPassagem) {
            case "economica":
                acrescimo = 0.10;
                break;
            case "executiva":
                acrescimo = 0.50;
                break;
            case "primeira classe":
                acrescimo = 0.90;
                break;
            default:
                acrescimo = 0.0;
                break;
        }
        return this.precoBase + (this.precoBase * acrescimo);
    }
    public double calcularPreco(double percentualManual) {
        return this.precoBase + (this.precoBase * (percentualManual / 100));
    }
}