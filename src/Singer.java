public class Singer extends PERSON {
    private String bandName;

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName=bandName;
    }

    @Override
    public void learn() {
        System.out.println("Singer learn");
    }

    @Override
    public void walk() {
        System.out.println("Singer wail");
    }

    @Override
    public void eat() {
        System.out.println("Singer eat");
    }
    public void singing(){
        System.out.println("Singer singer");
    }
    public void playGitar(){
        System.out.println("Singer playGitar");
    }
}
