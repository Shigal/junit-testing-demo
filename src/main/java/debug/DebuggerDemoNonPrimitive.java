package debug;

public class DebuggerDemoNonPrimitive {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Vicky");
        cat1.setLitterPreference("TidyCats");
        cat1.setAge(2);

        Cat cat2 = new Cat("Poosa");
        cat2.setLitterPreference("Fresh step");
        cat2.getLitterPreference();
        System.out.println(cat2.getAge());

        Cat[] cats = new Cat[2];

        cats[0] = cat1;
        cats[1] = cat2;
    }
}
