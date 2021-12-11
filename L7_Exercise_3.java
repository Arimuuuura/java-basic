public class L7_Exercise_3 {
	public static void main(String[] args) {
		if (args.length == 2) {
			Integer arg1 = Integer.parseInt(args[0]);
			Integer arg2 = Integer.parseInt(args[1]);
			Integer area = arg1 * arg2;
			System.out.println(area);
		} else {
			System.out.println("引数を２つ入力してください");
		}
	}
}
