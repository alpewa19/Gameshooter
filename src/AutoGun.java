public class AutoGun extends Weapon {
    @Override
    public void shot() {
        super.shot();
        System.out.println("Тра-та-та-та");
    }
}