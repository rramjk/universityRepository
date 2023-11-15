package university.lesson2;

abstract class Bird {
    private String name, color;
    private int age;

    public Bird(String name, String color, int age) {
        if(name.isEmpty() || color.isEmpty() || age < 0) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }
    abstract void sing();
}
