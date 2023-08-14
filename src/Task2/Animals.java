package Task2;

public enum Animals {
    LION(1, "Lion"),
    ELEPHANT(2, "ELEPHANT"),
    TIGER(3, "TIGER"),
    GIRAFFE(4, "GIRAFFE"),
    PANDA(5, "Lion");

    int old;
    String name;

    Animals(int old, String lion) {
        this.old = old;
        this.name = name();
    }

    @Override
    public String toString() {
        return "name = " + name + '\n' +
                "old = " + old;
    }
}

