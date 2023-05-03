package com.hans.classi;

public class RettangoloClass {

    public int base;
    public int altezza;

    public RettangoloClass(int base, int altezza){
        this.base=base;
        this.altezza=altezza;
    }


    public void stampaRettangolo(){
        int area=(this.altezza*this.base)/2;
        int perimetro=(this.altezza+this.base)*2;
        System.out.println("L'area del rettangolo vale: "+area + ", il perimetro vale: "+ perimetro);
    }

    public static void stampaDueRettangoli(RettangoloClass R1,RettangoloClass R2){
        int area1=(R1.altezza*R1.base)/2;
        int area2=(R2.altezza*R2.base)/2;
        int perimetro1=(R1.altezza+R1.base)*2;
        int perimetro2=(R2.altezza+R2.base)*2;
        System.out.println("L'area del primo rettangolo vale: "+area1 + ", il perimetro vale: "+ perimetro1);
        System.out.println("L'area del secondo rettangolo vale: "+area2 + ", il perimetro vale: "+ perimetro2);
        System.out.println("La somma delle aree vale: "+(area2+area1)+ ", e la somma dei perimetri: "+ (perimetro2+perimetro1));
    }
}
