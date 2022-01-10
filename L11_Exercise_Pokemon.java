import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class L11_Exercise_Pokemon {
    private String name;
    private String attribute;
    private List<Skill> skillLists;
    private int hp;
    private int exp = 0;

    L11_Exercise_Pokemon(String name, String attribute, int hp, List<Skill> skillLists) {
        this.name = name;
        this.attribute = attribute;
        this.skillLists = skillLists;
        this.hp = hp;
    }

    public void getPokemon() {
        System.out.println(
                "なまえ:" + this.name + ", タイプ:" + this.attribute + ", 体力:" + this.hp + ", 経験値:" + this.exp
        );

        for (int i = 0; i < this.skillLists.size(); i++) {
            this.skillLists.get(i).getSkill();
        }
    }

    public void setName(String name) { this.name = name; }
    public void setAttribute(String attribute) { this.attribute = attribute; }
    public void setHp(int hp) { this.hp = hp; }
    public void setExp(int exp) { this.exp = exp; }
    public void getName() { System.out.println(this.name); }
    public void getAttribute() { System.out.println(this.attribute); }
    public void getHp() { System.out.println(this.hp); }
    public void getExp() { System.out.println(this.exp); }
}

class Skill {
    private String name;
    private int damage;

    Skill(String name, int damage)
    {
        this.name = name;
        this.damage = damage;
    }

    public void getSkill()
    {
        System.out.println("技名:" + this.name + ", ダメージ:" + this.damage);
    }

    public void setSkillName(String name) { this.name = name; }
    public void setSkillDamage(int damage) { this.damage = damage; }
    public void getSkillName() { System.out.println(this.name); }
    public void getSkillDamage() { System.out.println(this.damage); }
}

class UseL11_Exercise_Pokemon {
    public static void main(String[] args) {
        List<Skill> pikatyuSkills = new ArrayList<Skill>();
        pikatyuSkills.add(new Skill("電光石火", 10));
        pikatyuSkills.add(new Skill("かみなり", 50));

        List<Skill> hitokageSkills = new ArrayList<Skill>();
        hitokageSkills.add(new Skill("切り裂く", 10));
        hitokageSkills.add(new Skill("火炎放射", 50));

        List<Skill> zenigameSkills = new ArrayList<Skill>();
        zenigameSkills.add(new Skill("噛みつく", 10));
        zenigameSkills.add(new Skill("水鉄砲", 50));

//        L11_Exercise_Pokemon[] array = {
//            new L11_Exercise_Pokemon("ピカチュウ", "でんき", 200, pikatyuSkills),
//            new L11_Exercise_Pokemon("ヒトカゲ", "ほのお", 200, hitokageSkills),
//            new L11_Exercise_Pokemon("ゼニガメ", "みず", 200, zenigameSkills),
//        };
//
//        for (L11_Exercise_Pokemon obj: array) {
//            obj.getPokemon();
//        }

        L11_Exercise_Pokemon pikatyu = new L11_Exercise_Pokemon("ピカチュウ", "でんき", 200, pikatyuSkills);
        L11_Exercise_Pokemon hitokage = new L11_Exercise_Pokemon("ヒトカゲ", "ほのお", 200, hitokageSkills);
        L11_Exercise_Pokemon zenigame = new L11_Exercise_Pokemon("ゼニガメ", "みず", 200, zenigameSkills);

        pikatyu.getPokemon();
        hitokage.getPokemon();
        zenigame.getPokemon();
    }
}
