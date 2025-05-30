package Strategy;

class MarriedFilter implements PersonFilter {
    public boolean apply(Person person) {
        return person.isMarried();
    }
}