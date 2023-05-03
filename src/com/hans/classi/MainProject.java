package com.hans.classi;

public class MainProject {

	public static void main(String[] args) {
		RettangoloClass R1=new RettangoloClass(4, 10);
		RettangoloClass R2=new RettangoloClass(10, 20);
		R1.stampaRettangolo();
		RettangoloClass.stampaDueRettangoli(R1, R2);
		int[] numeriChiamati={};

		OperatoreTelefonico T1=new OperatoreTelefonico(347565332, 3.4, numeriChiamati);
		T1.stampaDatiSim();
	}

}
