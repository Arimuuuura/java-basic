import java.util.Scanner;

class PokeMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Monster インスタンス生成
        System.out.println("バトルするポケモンを2匹登録してください");

        Monster [] monsters = new Monster[2];
        for (int i = 0; i < 2; i++) {
            System.out.println((i + 1) + "匹目のポケモンを登録します");
            monsters[i] = new Monster();
            monsters[i].printData();
        }

        System.out.println(monsters[0].getName() + " vs " + monsters[1].getName() + " 実施しますか？(yes / no)");
        String isBattle = scan.next();
        if (isBattle.equals("yes")) {
            System.out.println("バトル開始");
        } else if (isBattle.equals("no")) {
            System.out.println("バトルをやめました");
        } else {
            System.out.println("(yes / no)を入力してください");
        }
    }
}
