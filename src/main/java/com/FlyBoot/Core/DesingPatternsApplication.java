package com.FlyBoot.Core;

import com.FlyBoot.Core.singleton.Credenciales;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesingPatternsApplication {

	public static void main(String[] args) {
		/*
		System.out.println("INICIO HILO UNICO");
		Credenciales credenciales = Credenciales.getInstance("IMENDOZA", "ADMIN");
		Credenciales credenciales2 = Credenciales.getInstance("JMOLANO", "SUPREMO");
		System.out.println(credenciales.toString());
		System.out.println(credenciales2);
		System.out.println("FIN HILO UNICO");
		 */
		System.out.println("------------------");
		System.out.println("INICIO MULTIHILO");
		Thread hilo1 = new Thread(new CredencialesIvan());
		Thread hilo2 = new Thread(new CredencialesMolano());
		hilo1.start();
		hilo2.start();
		System.out.println("FIN MULTIHILO");
	}

	/**
	 * Creacion de multihilos para notar el fallo en el patron
	 * singleton cuando no se tiene control en los hilos
	 */
	static class CredencialesIvan implements Runnable{

		@Override
		public void run() {
			Credenciales credenciales = Credenciales.getInstance("IMENDOZA", "ADMIN");
			System.out.println(credenciales);
		}
	}

	static class CredencialesMolano implements Runnable{

		@Override
		public void run() {
			Credenciales credenciales = Credenciales.getInstance("JMOLANO", "SUPREMO");
			System.out.println(credenciales);
		}
	}


}
