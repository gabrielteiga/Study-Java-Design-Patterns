import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {
    
    // classe responsavel apenas por receber as informacoes. Quem executa eh o handler.
    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeItens;

    // injecao de dependencias: PedidoRespository, EmailService,... que executam as logicas.
    public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeItens){
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;
    }

    public String getCliente() {
        return cliente;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }
}
