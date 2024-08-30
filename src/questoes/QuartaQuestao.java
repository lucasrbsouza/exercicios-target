package questoes;
//4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
//• SP – R$67.836,43
//• RJ – R$36.678,66
//• MG – R$29.229,88
//• ES – R$27.165,48
//• Outros – R$19.849,53
//
//Escreva um programa na linguagem que desejar onde calcule o percentual de representação
// que cada estado teve dentro do valor total mensal da distribuidora.
public class QuartaQuestao {

    public static void main(String[] args) {

        double faturamentoSP = 67836.43;
        double faturamentoRJ = 36678.66;
        double faturamentoMG = 29229.88;
        double faturamentoES = 27165.48;
        double faturamentoOutros = 19849.53;


        double totalFaturamento = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamentoOutros;


        double percentualSP = (faturamentoSP / totalFaturamento) * 100;
        double percentualRJ = (faturamentoRJ / totalFaturamento) * 100;
        double percentualMG = (faturamentoMG / totalFaturamento) * 100;
        double percentualES = (faturamentoES / totalFaturamento) * 100;
        double percentualOutros = (faturamentoOutros / totalFaturamento) * 100;


        System.out.printf("Percentual de representação de SP: %.2f%%\n", percentualSP);
        System.out.printf("Percentual de representação de RJ: %.2f%%\n", percentualRJ);
        System.out.printf("Percentual de representação de MG: %.2f%%\n", percentualMG);
        System.out.printf("Percentual de representação de ES: %.2f%%\n", percentualES);
        System.out.printf("Percentual de representação de Outros: %.2f%%\n", percentualOutros);
    }

}
