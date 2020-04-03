package test;

/**
 * @author jxk
 * @create 2020-02-03 11:56
 * @desc
 **/
public class Cat {
    public Cat(String name, int age, double weight) {
        this.name = name;
        Age = age;
        this.weight = weight;
    }

    String name;
    int Age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    double weight;

    public Cat() {
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", Age=" + Age +
                ", weight=" + weight +
                '}';
    }
}
