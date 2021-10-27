package com.bridgelabz;

import java.util.Random;
public class Gambler {
	public static void main(String[] args) {
			System.out.println("Welcome Gambler");
			Random rd = new Random();
			int bet = rd.nextInt(2);
			int EVERY_DAY_STACK =100;
			int BEAT_EVERY_GAME =1;
			System.out.println(EVERY_DAY_STACK);
			System.out.println( BEAT_EVERY_GAME);
			
			if(bet==1){
				System.out.println("Bet Win");
			}
			else{
				System.out.println("Bet Loss");
			}
			
			
		}
}
