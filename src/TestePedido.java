import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestePedido {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("600"), 4);
        String cliente = "Gabriel Teste";
        LocalDateTime data = LocalDateTime.now();

        Pedido pedido = new Pedido(cliente, data, orcamento);
        
        System.out.println("Salvar pedido no Banco de Dados");
        System.out.println("Enviar email com os dados do novo pedido");
    }
}
