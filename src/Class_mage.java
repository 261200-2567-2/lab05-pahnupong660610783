import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
public class Class_mage implements Characters {
    private  String name;
    private  Stats classStats;
    private List<Weapon> equipWeapon;
    private  Stats weaponBonus;
    private int level;

    public Class_mage(String name , int level) {
        this.name = name;
        this.classStats = new Stats(60,100,40,10,7);
        this.weaponBonus = new Stats(0,0,0,0,0);
        this.equipWeapon = new ArrayList<>();
        this.level = level;


    }
    ;

    @Override
    public String getName() {
        return name ;
    }

    @Override
    public Stats stats() {
        Stats finalStats = new Stats(classStats);
        finalStats.addStats(weaponBonus);
        return finalStats;


    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void levelUp() {
        level++;
        System.out.println(name +" Level up");
        classStats.addStats(new Stats(20,100,5,1,0));

    }

    @Override
    public void printStats() {
        Stats stats = stats();
        System.out.println("\n" +  name +"'s Stats : ");
        System.out.println(stats);
        System.out.println("Level : " + level);
        if(equipWeapon.isEmpty()) {
            System.out.println("equipped weapon : None");
        }
        else {
            System.out.print("Equipped weapon : ");
            for (Weapon weapon : equipWeapon){
                System.out.println(weapon.getName()+ " Level : " + weapon.getLevel());

            }
        }


    }

    @Override
    public void EquipWeapon(Weapon weapon) {
        if (equipWeapon.size() < 2) {
            equipWeapon.add(weapon);
            System.out.println(name + " equipped " + weapon.getName());
            this.weaponBonus.addStats(weapon.getStats());
            if (weapon instanceof Weapon_Spear) {
                ((Weapon_Spear) weapon).setCharacter(this);
            }
        } else {
            System.out.println(name + " cannot equip more than 2 weapons");
        }
    }

    @Override
    public void unEquipWeapon(Weapon weapon) {
        if (equipWeapon.contains(weapon)) {
            equipWeapon.remove(weapon);
            System.out.println(name + " unequipped " + weapon.getName());
            this.weaponBonus.addStats(new Stats(
                    -weapon.getStats().getHp(),
                    -weapon.getStats().getAttack(),
                    -weapon.getStats().getDefense(),
                    -weapon.getStats().getMana(),
                    -weapon.getStats().getSpeed()
            ));
            if (weapon instanceof Weapon_Spear) {
                ((Weapon_Spear) weapon).removeCharacter();
            }
        } else {
            System.out.println(name + " doesn't have " + weapon.getName() + " equipped.");
        }
    }
    public void updateWeaponBonus() {
        // รีเซ็ต weaponBonus
        this.weaponBonus = new Stats(0, 0, 0, 0, 0);
        for (Weapon weapon : equipWeapon) {
            this.weaponBonus.addStats(weapon.getStats());
        }
    }
}
