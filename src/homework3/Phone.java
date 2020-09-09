package homework3;

public  class Phone {
    public static String number = "8800";
    public static String model = "nokia";
    public static String weight = "100";

    public static void receiveCall(String name, String model, String number) {
            System.out.println("Звонит " + name + " " + model + " " + number + " " + weight);
        model = "LG";
        number = "6060";
        getNumber(model, number);
    }

    public static void getNumber(String model,String number) {
        System.out.println("Номер определен " + model + " " + number);
    }

    Phone(){
        this.model = "iphone";
        this.number = "999";
        System.out.println("Номер определен " + model + " " + number);
    }

    public static void receiveCall(String name) {
        System.out.println("Звонит " + name + " " + model + " " + number + " " + weight);
    }

    public static void receiveCall(String name,String number) {
        System.out.println("Звонит " + name + " " + number);
    }

    public static void sendMessage(String...args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Данным номерам будет отправлено сообщение:  " + args[i]);
        }
    }
}
