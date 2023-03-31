package Ejerciocios;

public class Prize {
    private String name;
    private int weight;
    private int difficulty;

    public Prize(String name, int weight, int difficulty) {
        this.name = name;
        this.weight = weight;
        this.difficulty = difficulty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }


}
