package ZAD1;

public class MainZAD1 {
    public static void main(String[] args) {
        Character player1 = new Knight(new Sword());
        player1.Attack();
        player1.setWeaponBehaviour(new Bow());
        player1.Attack();
    }


}
