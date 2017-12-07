package Parkhaus;

public class Auto implements Autoif{

	String str= "";
	@Override
	public void setKennzeichen(String str) {
		this.str = str;
		
	}

	@Override
	public String getKennzeichen() {
		// TODO Auto-generated method stub
		return str;
	}

}
