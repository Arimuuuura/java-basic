import java.util.Scanner;

public class L10_Exercise_1 {
	int height;
	int width;
	static String info = "四角形の辺の数は4です";

	int getArea() {
		return height * width;
	}

	void setData(int h, int w) {
		height = h;
		width = w;
	}

	void setData(int len) {
		height = len;
		width = len;
	}
}

class L10_Exercise_1_Instance {
	public static void main(String[] args) {
		L10_Exercise_1 s1 = new L10_Exercise_1();
		L10_Exercise_1 s2 = new L10_Exercise_1();

//		s1.height = 15;
//		s1.width = 7;
		s2.height = 8;
		s2.width = 9;

		// 問題4
//		s1.setData(15, 7);
		s1.setData(3);

		System.out.println(s1.info);
		System.out.println("高さ:" + s1.height + ", 幅:" + s1.width + ", 面積:" + s1.getArea());
		System.out.println("高さ:" + s2.height + ", 幅:" + s2.width + ", 面積:" + s2.getArea());
	}
}
