package Strategy;

import java.util.*;

class PeopleCounter {
    private PersonFilter filter;
    private List<Person> people;

    public void setFilter(PersonFilter filter) {
        this.filter = filter;
    }

    public int count(List<Person> people) {
        int cnt = 0;
        for(Person p : people) {
            cnt += filter.apply(p)==true?1:0;
        }
        return cnt;
    }
}