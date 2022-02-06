package com.java;

public class VelocityTest {
	public String validateVelocity(String road, int velocity) {
		int velHighway = 100;
		int velSchool = 30;
		int velStreet = 80;
		String toReturn="Velocidad dentro de la permitida";
		if(road == "Carretera" && velocity >velHighway) {
			toReturn="Su velocidad en carretera supera el límite "+velHighway;
		}else if (road == "ZonaEscolar" && velocity >velSchool){
			toReturn="Su velocidad en zona escolar supera el límite "+velSchool;
		}else if (road == "CalleNormal" && velocity >velStreet) {
			toReturn="Su velocidad en calle normal supera el límite "+velStreet;
		}
		return toReturn;
	}

}
