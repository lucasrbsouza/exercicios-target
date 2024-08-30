package questoes.terceira_questao;

import org.json.JSONArray;
import org.json.JSONObject;

public class TerceiraQuestao {
    public static void main(String[] args) {
        String dataJson = """
        {
            "faturamento": [
                {"dia": 1, "valor": 200},
                {"dia": 2, "valor": 0},
                {"dia": 3, "valor": 300},
                {"dia": 4, "valor": 0},
                {"dia": 5, "valor": 500}
            ]
        }
        """;

        JSONObject jsonObject = new JSONObject(dataJson);
        JSONArray faturamentoArray = jsonObject.getJSONArray("faturamento");


        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0;
        int diasComFaturamento = 0;


        for (int i = 0; i < faturamentoArray.length(); i++) {
            JSONObject dia = faturamentoArray.getJSONObject(i);
            double valor = dia.getDouble("valor");
            if (valor > 0) {
                if (valor < menorFaturamento) {
                    menorFaturamento = valor;
                }
                if (valor > maiorFaturamento) {
                    maiorFaturamento = valor;
                }
                somaFaturamento += valor;
                diasComFaturamento++;
            }
        }


        double mediaMensal = diasComFaturamento > 0 ? somaFaturamento / diasComFaturamento : 0;


        int diasAcimaMedia = 0;
        for (int i = 0; i < faturamentoArray.length(); i++) {
            double valor = faturamentoArray.getJSONObject(i).getDouble("valor");
            if (valor > mediaMensal) {
                diasAcimaMedia++;
            }
        }


        System.out.println("Menor faturamento: " + menorFaturamento);
        System.out.println("Maior faturamento: " + maiorFaturamento);
        System.out.println("Número de dias acima da média: " + diasAcimaMedia);
    }
}

