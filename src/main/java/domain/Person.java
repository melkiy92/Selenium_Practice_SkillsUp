package domain;

public class Person {
    public String name;
    public String position;

    public Person(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString() {
        return "domain.Person{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        return position != null ? position.equals(person.position) : person.position == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }

}
