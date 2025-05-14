public class SimpleLinearRegression {
    private double beta0, beta1;
    private int[] advertising;
    private int[] sales;


    public SimpleLinearRegression(int[] advertising, int[] sales){
        this.advertising = advertising;
        this.sales = sales;
    }

    public void calcularValores(){
        /*tamaño del dataset e inicializacion de nuestras variables necesarias*/
    int tamanio = advertising.length;
    int sumatoriaX=0, sumatoriaY=0, sumatoriaXY=0, sumatoriaX2=0;

    for(int i = 0; i < tamanio; i++){
        sumatoriaX += advertising[i];
        sumatoriaY += sales[i];
        sumatoriaXY += advertising[i] * sales[i];
        sumatoriaX2 += advertising[i] * advertising[i];
    }
    beta0 = (sumatoriaX2 * sumatoriaY - sumatoriaX * sumatoriaXY) / (double) (tamanio * sumatoriaX2 - sumatoriaX * sumatoriaX);
    beta1 = (tamanio * sumatoriaXY - sumatoriaX * sumatoriaY) / (double) (tamanio * sumatoriaX2  - sumatoriaX * sumatoriaX);

    }

    public double predecirVentas(int x){
        return  beta0 + beta1 * x;

    }
    public void imprimirEcuacion(){
        System.out.println("Ecuacion de Regresion: ŷ = " + beta0 + " + " + beta1 + " * X");


    }



}

