package Task1;
public class Phone {
    String number;
    String model;
    double weight;
    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public String getNumber() {
        return number;
    }
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone() {

    }
    public void receiveCall(String name, String number) {
    }
    public void sendMessage(Phone[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].number);
        }
    }

    public void toString1() {
        System.out.println("Номер: " + number);
        System.out.println("Модель: " + model);
        System.out.println("Вес: " + weight);
    }

}