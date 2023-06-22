import java.math.BigDecimal;
import java.util.Arrays;

public class TestePedido {
    public static void main(String[] args) {
        String cliente = "Gabriel Teste";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadeItens = Integer.parseInt("2");

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
            // Criando nova lista com as dependencias que queremos executar.
            Arrays.asList(new SalvarPedidoNoBancoDeDados(),
             new EnviarEmailPedido()
            ));
        handler.execute(gerador);
    }
}
