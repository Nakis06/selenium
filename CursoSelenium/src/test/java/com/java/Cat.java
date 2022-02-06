package com.java;

public class Cat {
	public boolean isCatPlaying(boolean verano, int temperatura) {
		if(verano && temperatura >=25 && temperatura <=45) {
			return true;
		}
		if(!verano && temperatura >=25 && temperatura <=35) {
			return true;
		}
		return false;
	}

}
