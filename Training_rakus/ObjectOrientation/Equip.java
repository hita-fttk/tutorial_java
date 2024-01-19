package ObjectOrientation;

public class Equip {
    public static void main(String[] args) {
        Equipment equip = new Equipment("ひのきのぼう","どうのつるぎ","レイピア",7,12,24,5);
        equip.showItems();
        equip.showStatus();
        equip.equip("ひのきのぼう");
        equip.showStatus();
        equip.equip("どうのつるぎ");
        equip.showStatus();
        equip.equip("レイピア");
        equip.showStatus();
        equip.equip("どうのつるぎ");
        equip.showStatus();

    }
}
