package FactoryDesignPattern;

import phone.android;
import phone.operatingSystemFactory;
import phone.os;

public class mainclass {

	public static void main(String[] args) {
		operatingSystemFactory osf = new operatingSystemFactory();
		os obj = osf.getInstance("open");
		obj.spec();

	}

}
