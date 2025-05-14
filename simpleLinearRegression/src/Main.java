public class Main {
    public static void main(String[] args) {
        int[] advertising = {23,26,30,34,43,48,52,57,58};
        int[] sales = {651,762,856,1063,1190,1298,1421,1440,1518};

        SimpleLinearRegression modeloPredictivo = new SimpleLinearRegression(advertising, sales);
        modeloPredictivo.calcularValores();
        modeloPredictivo.imprimirEcuacion();

        int [] valoresOptimos = {20,35,45,50,65};

        for(int i = 0; i < valoresOptimos.length; i++){
            int x = valoresOptimos[i];
            System.out.println("Advertising = " + x + ", prediccion Sales = " + modeloPredictivo.predecirVentas(x));
        }

    }
}