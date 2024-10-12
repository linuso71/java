package enumExample;

public class EnumBasic {

    // these are enum constants
    enum Week {
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
        // these are enum constants
        // public ,static, and final
        // since its final can't create child enums
        // type is week
    }

    void Week(){
        System.out.println("constructor called " + this);
    }

    public static void main(String[] args) {
//        EnumBasic obj = new EnumBasic();
        Week week;
        week = Week.Monday;
        System.out.println(week);
    }
}

