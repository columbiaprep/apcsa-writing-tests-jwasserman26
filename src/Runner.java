import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Hello");
    }

    @Test
    public void test() {
       Helmet h = new Helmet("Gold");
       assertEquals(1.5, h.getWeight(), .1);

       BodyArmor b = new BodyArmor("Chain");
       assertEquals(true, b.test());

        Boots boots = new Boots(true, "Leather", false);
        boots.setRevisedStrength(12);
        assertEquals(boots.getStrMod(), 1);

        Gauntlets gauntlets = new Gauntlets(0);
        gauntlets.replaceGauntlets(1);
        assertEquals( gauntlets.getEquipmentID(), 1);

        Gloves gloves = new Gloves("Common", "None", false, 0, 0, 0);
        assertEquals( gloves.getRarity(),  "Common");

        MeleeWeapon weapon = new MeleeWeapon("Sword", 10, 15, 30.5, 2.5, 7);
        assertEquals( weapon.getType(), "Sword");

        Origin origin = new Origin("Forest", "Sanskrit", "Wizard", "Lawful", "Wisdom", "Constitution");
        assertEquals(origin.getPlace(), "Forest");

        Philosophy philosophy = new Philosophy("Stoicism");
        assertEquals(philosophy.getKnowledge(), 15);

        RangeWeapons w = new RangeWeapons(60, 10, 5, 5, 1, 12.0);
        assertEquals(w.getRange(),  60);

        Shield steelShield = new Shield("steel");
        assertEquals(steelShield.getWeight(), 20, 0.01);

        Species elf = new Species("Elf");
        assertEquals(elf.getSize(),  "Medium");




    }
}
