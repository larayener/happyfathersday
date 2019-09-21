import java.util.Scanner;

public class BabiskomIcin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bir berber bir berbere, \"Gel beraber bir berber berberhanesi acalim,\" demis. \n[Bu berber kimmis?]");
		boolean olurMuKi;
		Scanner s = new Scanner(System.in);
		String berberito = s.next();
		if (berberito.contentEquals("Babisko")) {
			olurMuKi = true;
		}
		else {
			olurMuKi = false;
		}
		
		if (olurMuKi) { // Birinci berberimiz a.k.a. berberito duzgun insansa
			System.out.println("Diger berber de berbere, \"Birader biz beraber bir berber berberhanesi baslatalim,\" demis.");
		}
		else { // berberito kil insanin tekiyse
			System.out.println("Diger berber de berbere, \"Bildirki hurmalar gotumu tirmalar.\" demis.");
		}
	}

}
