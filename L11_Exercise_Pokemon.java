public class L11_Exercise_Pokemon {
    private String name;
    private String attribute;
    private int hp;

    public void getPokemon() {
        System.out.println("なまえ:" + this.name + ", タイプ:" + this.attribute + ", 体力:" + this.hp);
    }

    L11_Exercise_Pokemon(String name, String attribute, int hp) {
        this.name = name;
        this.attribute = attribute;
        this.hp = hp;
    }
}

class UseL11_Exercise_Pokemon {
    public static void main(String[] args) {
        L11_Exercise_Pokemon[] array = {
            new L11_Exercise_Pokemon("ピカチュウ", "でんき", 200),
            new L11_Exercise_Pokemon("ヒトカゲ", "ほのお", 200),
            new L11_Exercise_Pokemon("ゼニガメ", "みず", 200),
        };

        for (L11_Exercise_Pokemon obj: array) {
            obj.getPokemon();
        }
    }
}
