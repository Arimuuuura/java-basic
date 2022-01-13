import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Monster {
    private String name;
    private String attribute;
    private int hp = 100;
    private int level = 1;
    private List<String> skills = new ArrayList<>();

    Scanner scan = new Scanner(System.in);

    Monster () {
        System.out.println("ポケモンの名前は何ですか？");
        String pokeName = scan.next();
        this.name = pokeName;

        System.out.println("ポケモンの属性は何ですか？");
        String pokeAttr = scan.next();
        this.attribute = pokeAttr;

        System.out.println("技を2種類登録してください:");
        this.setSkills();
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setAttribute (String attribute) {
        this.attribute = attribute;
    }

    public String getName () {
        return this.name;
    }

    public void setSkills () {
        for (int i = 1; i <=2; i++) {
            System.out.println(i + "番目の技は？");
            String skill = scan.next();
            this.skills.add(skill);
        }
    }

    public void printData () {
        System.out.println("[ポケモン情報]");
        System.out.println("名前 : " + this.name + ", 属性 : " + this.attribute + ", 技 : " + skills + ", HP : " + this.hp + ", Level : " + this.level);
//        System.out.println("技 : " + skills);
//        System.out.println("HP : " + this.hp);
    }
}