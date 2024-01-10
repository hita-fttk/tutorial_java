package ObjectOrientation;

public class Ex13 {
    public static void main(String[] args) {
        Ex13VendingMachine machine = new Ex13VendingMachine();
        machine.buyItem();
        machine.refillStock(3);
        machine.buyItem();
        machine.putMoney(500);
        machine.buyItem();
        machine.buyItem();
        machine.buyItem();
        machine.refillStock(3);
        machine.buyItem();
        machine.buyItem();
        machine.buyItem();
    }
}
