package Strategy;

class SeniorFilter implements PersonFilter {
    public boolean apply(Person person) {
        return person.getAge() >= 65;
    }
}