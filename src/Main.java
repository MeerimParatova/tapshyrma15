public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Nurperi", "Strong", "Peaksoft");
        System.out.println(programmer);
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();

        Dancer dancer = new Dancer("Jumagul", "Strong", "Azem");
        System.out.println(dancer);
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();

        Singer singer = new Singer("Timurlan", "Strong", "Bitls");
        System.out.println(singer);
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playGitar();

    }
}