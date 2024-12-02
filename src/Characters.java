public interface Characters {
    String getName();
    Stats stats();
    int getLevel();
    void levelUp();
    void printStats();
    void EquipWeapon(Weapon weapon);
    void unEquipWeapon(Weapon weapon);

    void updateWeaponBonus();
}
