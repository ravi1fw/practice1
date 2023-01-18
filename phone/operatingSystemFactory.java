package phone;

public class operatingSystemFactory {
	public os getInstance(String str) {
		if(str.equals("open")) {
			return new android();
		}else if(str.equals("closed")) {
			return new Ios();
		}else {
			return new windows();
		}
		
	}
}
