package com.bl.day4;

public class SnakeLadder {
	
	final static byte OPTION_NO_PLAY = 0;
	final static byte OPTION_SNAKE = 1;
	final static byte OPTION_LADDER = 2;

	public static void main(String[] args) {
		
		byte position = 0;
		System.out.println("The starting position of the player is :" +position);
		
		byte dieRollNum = (byte)((Math.random() *10) % 6 + 1);
		System.out.println("the die show " +dieRollNum);
		
		byte playOption = (byte)((Math.random() * 10) % 3);
		
		switch (playOption) {
		case OPTION_NO_PLAY : 
			System.out.println("The player. not playing at " + position +"\n");
			break;
			
		case OPTION_SNAKE :
			position -= dieRollNum;
			if(position < 0) position = 0;
			System.out.println("stepped on snake. going back to " + position + " :\n");
			break;
		
		case OPTION_LADDER : 
			
			position += dieRollNum;
			System.out.println("Ladder. off we go to position "+ position + " :\n");
			break;
		}
	}
}
