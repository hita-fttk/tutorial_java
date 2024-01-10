package ObjectOrientation;

public class Equipment {
    String weaponLowName;
    String weaponMidName;
    String weaponHiName;

    int weaponLowAttack;
    int weaponMidAttack;
    int weaponHiAttack;
    int strength;

    String equipment = null;

    Equipment(String weaponLowName, String weaponMidName, String weaponHiName, int weaponLowAttack, int weaponMidAttack,
            int weaponHiAttack,int strength) {
        this.weaponLowName = weaponLowName;
        this.weaponMidName = weaponMidName;
        this.weaponHiName = weaponHiName;
        this.weaponLowAttack = weaponLowAttack;
        this.weaponMidAttack = weaponMidAttack;
        this.weaponHiAttack = weaponHiAttack;
        this.strength = strength;
    }

    public void showItems() {
        System.out.println("どうぐ：");
        System.out.println(this.weaponLowName);
        System.out.println(this.weaponMidName);
        System.out.println(this.weaponHiName);
    }

    public int calcAttack() {
        if(this.equipment != null){
            if (this.equipment.equals(this.weaponLowName)) {
                return this.strength + this.weaponLowAttack;
            } else if (this.equipment.equals(this.weaponMidName)) {
                return this.strength + this.weaponMidAttack;
            } else if (this.equipment.equals(this.weaponHiName)) {
                return this.strength + this.weaponHiAttack;
            } else{
                return this.strength;
            }
        }else{
            return this.strength;
        }
    }

    public void showStatus(){
        if(this.equipment != null){
            if(this.equipment.equals(this.weaponLowName)){
                System.out.println("こうげき力 "+(this.strength+this.weaponLowAttack));
            }else if(this.equipment.equals(this.weaponMidName)){
                System.out.println("こうげき力 "+(this.strength+this.weaponMidAttack));
            }else if(this.equipment.equals(this.weaponHiName)){
                System.out.println("こうげき力 "+(this.strength+this.weaponHiAttack));
            }
        }else{
            System.out.println("こうげき力 "+this.strength);
        }
    }

    public void equip(String weapon) {
            if (weapon.equals(this.weaponLowName) || weapon.equals(this.weaponMidName)
                    || weapon.equals(this.weaponHiName)) {
                int nowAttack = this.calcAttack();
                this.equipment = weapon;
                System.out.println(weapon + "を装備した");
                System.out.println("こうげき" + nowAttack + " → " + calcAttack());
            }
        }
}
