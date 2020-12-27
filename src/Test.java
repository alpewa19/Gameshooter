import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount());
        while (true) {
            int slot = scanner.nextInt();
            if (slot == -1) {
                System.out.println("Game over!");
            }
            player.shotWithWeapon(slot);
        }
    }
}