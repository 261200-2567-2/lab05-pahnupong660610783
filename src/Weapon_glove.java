public class Weapon_glove implements Weapon {
    private int level;
    private Stats weaponStats;
    private String name;
    private Characters character;

    public void setCharacter(Characters character) {
        this.character = character;
    }

    public void removeCharacter() {
        this.character = null;
    }

    public Weapon_glove(String name , int level, Stats stats) {
        this.level = level;
        this.weaponStats = stats;
        this.name = name;
    }



    @Override
    public Stats getStats() {
        return weaponStats;
    }

    @Override
    public void levelUp() {
        level++;
        System.out.println(name+" Level up to " + level);
        weaponStats.addStats(new Stats(10,10,10,3,1));
        if (character != null) { // character เป็นตัวละครที่ติดตั้งอาวุธ
            character.updateWeaponBonus();
        }
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public String getName() {
        return name ;
    }


}
