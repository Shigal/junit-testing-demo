package debug;/*
 *
 * @author Lawshiga
 *
 */

public class Cat {

    String name;
    int age;
    String litterPreference;

    Cat(String name) {
       name = this.name;
    }

    public String getLitterPreference() {
        return litterPreference;
    }

    public void setLitterPreference(String litterPreference) {
        this.litterPreference = litterPreference;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
