package com.java;

public class VelocityTest {
	public String validateVelocity(String road, int velocity) {
		int velHighway = 100;
		int velSchool = 30;
		int velStreet = 80;
		String toReturn="Velocidad dentro de la permitida";
		if(road == "Carretera" && velocity >velHighway) {
			toReturn="Su velocidad en carretera supera el l�mite "+velHighway;
		}else if (road == "ZonaEscolar" && velocity >velSchool){
			toReturn="Su velocidad en zona escolar supera el l�mite "+velSchool;
		}else if (road == "CalleNormal" && velocity >velStreet) {
			toReturn="Su velocidad en calle normal supera el l�mite "+velStreet;
		}
		return toReturn;
	}

}
