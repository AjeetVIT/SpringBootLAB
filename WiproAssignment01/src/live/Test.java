package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veena a=new Veena();
		a.play();
		Playable d=new Veena();
		d.play();
		Saxophone b=new Saxophone();
		b.play();
		Playable c=new Saxophone() ;
			c.play();
	
}}
