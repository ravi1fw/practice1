package javaprogram1;

import java.util.Scanner;

public class program26 {

	public enum weeks{
		sunday(0),monday(1),tueday(2),wednesday(3),thrusday(4),friday(5),sarurday(6);
		final int week;
		weeks(int i) {
			this.week=i;
		}
		int getdays() {
			return this.week;
		}
	}
	public enum size{
		small("size is small"),
		medium("size is medium"),
		large("size is large");
		final String s;
		size(String j) {
			this.s=j;
		}
		String getSize() {
			return this.s;
		}
	}
	public static void main(String[] args) {
		weeks days = weeks.tueday;
		size s = size.medium;
		System.out.println(days.getdays());
		System.out.println(s.getSize());
		
		}

}
