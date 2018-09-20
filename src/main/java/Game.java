import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) throws FileNotFoundException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader inputreader = new BufferedReader(is);
		
		String type = null;
		System.out.println("[c]onsole or [f]ile?");
		try {
			type = inputreader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(type.equals("c")) {
			int finalplayervalue = 0;
			int dealerhandvalue = 0;
			Deck deck = new Deck();
			Hand playerhand = new Hand();
			Hand dealerhand = new Hand();
			deck.shuffle();
			deck.deal(playerhand);
			System.out.println("Player hand:");
			playerhand.printHand();
			System.out.println("Dealer Hand");
			deck.deal(dealerhand);
			dealerhandvalue = dealerhand.getHandValue();
			dealerhand.printDealerHand();
			
			if(dealerhand.checkBlackjack() == true) {
				System.out.println("Dealer wins");
				dealerhand.printHand();
				return;
			}
			if(playerhand.checkBlackjack() == true) {
				System.out.println("Player wins");
				System.out.println("Dealers hand:");
				dealerhand.printHand();
				return;
			}
			
			while(true) {
				if(playerhand.checkBlackjack() == true) {
					System.out.println("Player wins");
					break;
				}
				else {
					System.out.println("[h]it or [s]tand?");
					String choice = null;
					try {
						choice = inputreader.readLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(choice.equals("h")) {
						deck.hit(playerhand);
						playerhand.printHand();
						if(playerhand.checkBust() == true) {
							System.out.println("Player busts, dealer wins");
							return;
						}
					}else if(choice.equals("s")) {
						finalplayervalue = playerhand.stand();
						System.out.println("Final hand value of: "+ finalplayervalue);
						break;
					}else {
						break;
					}
				}
			}
			while(true) {
				if (dealerhandvalue <= 16) {
					deck.hit(dealerhand);
					dealerhandvalue = dealerhand.getHandValue();
					dealerhand.printHand();
				}else if (dealerhandvalue == 17) {
					if (dealerhand.soft17() == true) {
						deck.hit(dealerhand);
						dealerhandvalue = dealerhand.getHandValue();
						dealerhand.printHand();
					}else {
						dealerhand.stand();
						dealerhand.printHand();
						if (dealerhandvalue >= finalplayervalue) {
							System.out.println("Dealer Wins");
							break;
						}else {
							System.out.println("Player Wins");
							break;
						}
					}
				}else if (dealerhandvalue >=18 && dealerhandvalue <22) {
					dealerhand.stand();
					dealerhand.printHand();
					if (dealerhandvalue >= finalplayervalue) {
						System.out.println("Dealer Wins");
						break;
					}else {
						System.out.println("Player Wins");
						break;
					}
				}else {
					System.out.println("Dealer Busts, Player wins");
					break;
				}
					
			}
		}else{ 
			    File file = 
			    new File("src/main/java/fileinput.txt"); 
			    Scanner sc = new Scanner(file); 
			  
			    while (sc.hasNextLine()) 
			      System.out.println(sc.nextLine()); 
			  } 
			} 
		
}


