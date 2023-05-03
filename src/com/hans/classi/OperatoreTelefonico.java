package com.hans.classi;

public class OperatoreTelefonico {
    public int numeroTelefonico;
    public double creditoDisponibile;
    public static double creditoUtilizzato=0;
    public int[] ultimeCinqueChiamate;

    public OperatoreTelefonico(int numeroTelefonico, double creditoDisponibile, int[] ultimeCinqueChiamate) {
        this.numeroTelefonico = numeroTelefonico;
        this.creditoDisponibile = 0;
        this.ultimeCinqueChiamate = 0;
    }

    public void stampaDatiSim(){
        System.out.println("Il dati della SIM sono i seguenti: \n Numero di telefono: "+this.numeroTelefonico+"\n Credito disponibile: "+this.creditoDisponibile +"\n Ultimi 5 numeri chiamati: "+this.ultimeCinqueChiamate);
    }


}
