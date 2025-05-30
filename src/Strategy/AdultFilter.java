package Strategy;

class AdultFilter implements PersonFilter {
    public boolean apply(Person person) {
        return person.getAge() >= 18;
    }
}