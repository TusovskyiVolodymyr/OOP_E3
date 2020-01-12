public class Main {
    public static void main(String[] args) {
        Warrior champion = new Champion("ch", 10, 70);
        Warrior monst = new Monster("mo", 8, 70);
        champion.fight(monst);
        System.out.println(monst.getHitpoints());
        monst.fight(champion);
    }
}
