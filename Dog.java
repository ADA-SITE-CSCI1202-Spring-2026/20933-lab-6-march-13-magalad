public class Dog extends Animal {

    private String breed;

    // Constructor
    public Dog(String animalName, String ownerName, int age, String breed) {
        super(animalName, ownerName, age);
        this.breed = breed;
    }

    // Getter
    public String getBreed() {
        return breed;
    }

    // Setter
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // toString
    @Override
    public String toString() {
        return "Dog[name=" + getAnimalName() +
               ", ownerName=" + getOwnerName() +
               ", age=" + getAge() +
               ", breed=" + breed + "]";
    }

    // equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Dog)) {
            return false;
        }

        Dog other = (Dog) obj;

        return super.equals(other) &&
               this.breed.equals(other.breed);
    }
}