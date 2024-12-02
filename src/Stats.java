public class Stats {
    private int hp;
    private int mana;
    private int defense;
    private int speed;
    private int attack ;
    public Stats(int hp ,int mana ,int attack,int defense,int speed) {
        this.hp = hp;
        this.mana = mana;
        this.defense = defense;
        this.speed = speed;
        this.attack = attack;

    }
    public Stats(Stats other) {
        this.hp = other.hp;
        this.mana = other.mana;
        this.defense = other.defense;
        this.speed = other.speed;
        this.attack = other.attack;

    }
    public void addStats(Stats other) {
        this.hp += other.hp;
        this.mana += other.mana;
        this.defense += other.defense;
        this.speed += other.speed;
        this.attack += other.attack;

    }
    @Override
    public String toString() {
        return "HP : " + hp + " , Mana : " +mana + ", Attack : " +attack + ", Defense : "+ defense + " , Speed : " + speed  ;
    }
    public int getHp() {return hp;}
    public int getMana() {return mana;}
    public int getDefense() {return defense;}
    public int getSpeed() {return speed;}

    public int getAttack() {return attack;}

}
