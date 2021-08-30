package tictactoe;

import java.util.Scanner;

public class Tac {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[][] value = new String[3][3]; //for visual
		int[] r=new int[2]; //coords
		boolean loop=true; //repeat the while
		String p1="X";
		String p2="O";
		String playerP=p1;
		boolean play=false, vic = false;
		int d1 = 0, d2 = 0;//checking victory in diagonals
		int h1 = 0,h2 = 0;//checking victory in horizontals
		int v1=0,v2=0;//checking verticals
		int tie=1;
		
		//setting value to a empty space
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				value[i][j]=" ";
			}
		}
		
		System.out.printf("---------\n");
		System.out.printf("| %s %s %s |\n", value[0][0],value[0][1],value[0][2]);
		System.out.printf("| %s %s %s |\n", value[1][0],value[1][1],value[1][2]);
		System.out.printf("| %s %s %s |\n", value[2][0],value[2][1],value[2][2]);
		System.out.printf("---------\n");
		
		while(loop) {
			System.out.printf("Enter the coordenates: "); //ask coords
			for(int i=0;i<2;i++) {
				r[i]=scan.nextInt() - 1;
			}
			
			//allow play boolean
			if(value[r[0]][r[1]]==" ") {
				play=true;
			}else {
				System.out.printf("\n--> Try again.\n\n");
			}
			
			value[r[0]][r[1]] = playerP;
			if(playerP==p1) {
				playerP=p2;
				tie++;
			}else {
				playerP=p1;
				tie++;
			}
			
			
			
			
			
			
			
			
			
			
		//DIAGONAL
			if(r[0]==r[1] && value[r[0]][r[1]]=="X") {
				d1++;
			}
			
			if(r[0]==r[1] && value[r[0]][r[1]]=="O") {
				d2++;
			}
		//OTHER DIAGONAL
			if(value[0][2]=="X" && value[2][1]=="X" && value[2][0]=="X") {
				d1=3;
				vic=true;
			}else if(value[0][2]=="O" && value[1][1]=="O" && value[2][0]=="O") {
				d2=3;
				vic=true;
			}else {
				d1=0;
				d2=0;
			}
			
		//HORIZONTAL
			//top
			if(value[0][0]=="X" && value[0][1]=="X" && value[0][2]=="X") {
				h1=3;
				vic=true;
			}else if(value[0][0]=="O" && value[0][1]=="O" && value[0][2]=="O") {
				h2=3;
				vic=true;
			}else {
				h1=0;
				h2=0;
			}
			
			//mid
			if(value[1][0]=="X" && value[1][1]=="X" && value[1][2]=="X") {
				h1=3;
				vic=true;
			}else if(value[1][0]=="O" && value[1][1]=="O" && value[1][2]=="O") {
				h2=3;
				vic=true;
			}else {
				h1=0;
				h2=0;
			}
			
			//bottom
			if(value[2][0]=="X" && value[2][1]=="X" && value[2][2]=="X") {
				h1=3;
				vic=true;
			}else if(value[2][0]=="O" && value[2][1]=="O" && value[2][2]=="O") {
				h2=3;
				vic=true;
			}else {
				h1=0;
				h2=0;
			}
			
		//VERTICAL
			//first
			if(value[0][0]=="X" && value[1][0]=="X" && value[2][0]=="X") {
				v1=3;
				vic=true;
			}else if(value[0][0]=="O" && value[1][0]=="O" && value[2][0]=="O") {
				v2=3;
				vic=true;
			}else {
				v1=0;
				v2=0;
			}
			
			//second
			if(value[0][1]=="X" && value[1][1]=="X" && value[2][1]=="X") {
				v1=3;
				vic=true;
			}else if(value[0][1]=="O" && value[1][1]=="O" && value[2][1]=="O") {
				v2=3;
				vic=true;
			}else {
				v1=0;
				v2=0;
			}
			
			//third
			if(value[0][2]=="X" && value[1][2]=="X" && value[2][2]=="X") {
				v1=3;
				vic=true;
			}else if(value[0][2]=="O" && value[1][2]=="O" && value[2][2]=="O") {
				v2=3;
				vic=true;
			}else {
				v1=0;
				v2=0;
			}
			
			//play
			while(play) {
				
				System.out.printf("%d %d %d - %d %d %d \n", d1, h1, v1, d2, h2, v2);
				System.out.printf("---------\n");
				System.out.printf("| %s %s %s |\n", value[0][0],value[0][1],value[0][2]);
				System.out.printf("| %s %s %s |\n", value[1][0],value[1][1],value[1][2]);
				System.out.printf("| %s %s %s |\n", value[2][0],value[2][1],value[2][2]);
				System.out.printf("---------\n");
				
				play=false;
			}
				
		//finishing
			String player = "";
			if(d1>=3 || h1>=3 || v1>=3) {

				player = "Player 1";
				System.out.println(""+player+" won!");
				vic=true;
				loop=false;
			}
			else if(d2>=3 || h2>=3 || v2>=3) {

				player = "Player 2";
				System.out.println(""+player+" won!");
				vic=true;
				loop=false;
			}/*else if(tie>8){
				System.out.println("\nTIE!");
				loop=false;
			}*/
			 //or break;
			
			
			
		}
		
	}

}
