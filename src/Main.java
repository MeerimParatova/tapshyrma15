public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Nurperi", "Strong", "Peaksoft");
        System.out.println(programmer.getName());
        System.out.println(programmer.getDesignation());
        System.out.println(programmer.getCompanyName());
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();

        Dancer dancer = new Dancer("Jumagul", "Strong", "Azem");
        System.out.println(dancer.getName());
        System.out.println(dancer.getDesignation());
        System.out.println(dancer.getGroupName());
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();

        Singer singer = new Singer("Timurlan", "Strong", "Bitls");
        System.out.println(singer.getName());
        System.out.println(singer.getDesignation());
        System.out.println(singer.getBandName());
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playGitar();

    }
}