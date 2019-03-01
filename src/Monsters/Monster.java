package Monsters;

import Abilities.Attack;

import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

public abstract class Monster {
    private Integer hp;
    private Integer xp = 10;
    Integer agi = 5;
    Integer def = 5;
    Integer str = 5;
    Attack attack;
    private Integer maxHP;
    private HashMap<String, Integer> items;

    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

    public Integer attackTarget(Monster target) {
        return this.attack.attack(target);
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getXp() {
        return xp;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    public Integer getMaxHP() {
        return maxHP;
    }

    public Integer getAgi() {
        return agi;
    }

    public Integer getDef() {
        return def;
    }

    public Integer getStr() {
        return str;
    }

    //Returns random number between min and max
    public Integer getAttribute(Integer min, Integer max){
        Random rand = new Random();

        if(min > max) {
            Integer temp = min;
            min = max;
            max = temp;
        }

        return rand.nextInt(max - min) + min;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monster monster = (Monster) o;
        return Objects.equals(hp, monster.hp) &&
                Objects.equals(xp, monster.xp) &&
                Objects.equals(agi, monster.agi) &&
                Objects.equals(def, monster.def) &&
                Objects.equals(str, monster.str) &&
                Objects.equals(attack, monster.attack) &&
                Objects.equals(maxHP, monster.maxHP) &&
                Objects.equals(items, monster.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hp, xp, agi, def, str, attack, maxHP, items);
    }

    @Override
    public String toString() {
        return "hp=" + hp + '/' + maxHP;
    }
}
