import java.math.BigDecimal;

public class TesteDescontos {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);

        CalculadoraDeDescontos calculadoraDesconto = new CalculadoraDeDescontos();
        System.out.println(calculadoraDesconto.calcular(primeiro));
        System.out.println(calculadoraDesconto.calcular(segundo));
    }
}
