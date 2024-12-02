public class Main {
    public static void main(String[] args) {
        Characters monk = new Class_monk("Tamma",1);
        Characters mage = new Class_mage("Wadof",1);
        Characters druid = new Class_druid("Smurf",1);
        Characters knight = new Class_knight("Arther",1);

        Weapon DragonSpear = new Weapon_Spear("DragonSpear",1, new Stats(10,10,30,10,-1));
        Weapon Holylife  = new Weapon_staff("Holylife",1,new Stats(10,40,20,5,-1));
        Weapon Starlight = new Weapon_staff("Starlight",1,new Stats(10,35,25,5,-1));
        Weapon Woodsword = new Weapon_sword("Woodsword",1,new Stats(5,5,5,5,0));
        Weapon ThunderGlove = new Weapon_glove("ThunderGlove",1,new Stats(5,20,15,8,3));

        System.out.println("Display stats");
        monk.printStats();
        knight.printStats();


        System.out.println("\nEquip weapon to character\n");
        monk.EquipWeapon(DragonSpear);
        knight.EquipWeapon(Woodsword);


        System.out.println("\nDisplay stats after equipped weapon");
        monk.printStats();
        knight.printStats();

        System.out.println("\n");
        monk.levelUp();
        knight.levelUp();
        System.out.println("\nDisplay stats after level up");
        monk.printStats();
        knight.printStats();
        DragonSpear.levelUp();
        Woodsword.levelUp();
        Woodsword.levelUp();
        monk.printStats();
        knight.printStats();


    }
}