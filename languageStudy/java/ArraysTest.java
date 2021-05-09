// Arrays.sort Comparator 연습

import java.util.Arrays;
import java.util.Comparator;

class ArraysTest {
    public static void main(String [] args) {
        Person p1 = new Person("김청준", 27, true);
        Person p2 = new Person("김남자", 24, true);
        Person p3 = new Person("김남자", 25, true);
        Person p4 = new Person("김남자", 29, false);
        Person p5 = new Person("오여자", 21, false);
        Person [] pl = {p1, p2, p3 ,p4 ,p5};

        // Comparator 객체 사용 : 간단한 정렬 식(나이 순 오름차순 정렬)
        Arrays.sort(pl, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        for(Person p : pl) {
            System.out.println(p.getName() + " " + p.getAge());
        }

//        // 람다 Comparator 사용 : 간단한 정렬 식(나이 순 오름차순 정렬)
//        Arrays.sort(pl, (Person a, Person b) -> a.getAge() - b.getAge());
//        for(Person p : pl) {
//            System.out.println(p.getName() + " " + p.getAge());
//        }

//        // 람다 Comparator 사용 : 이름 순으로 오름차순 정렬하되, 같은 이름은 나이 내림차순 정렬
//        Arrays.sort(pl, (Person a, Person b) -> {
//            if (a.getName() == b.getName()) {
//                return -(a.getAge() - b.getAge());
//            }
//            return a.getName().compareTo(b.getName());
//        });
//        for(Person p : pl) {
//            System.out.println(p.getName() + " " + p.getAge());
    }
}


class Person {
    private String name;
    private int age;
    private boolean MSC;

    Person(String name, int age, boolean MSC) {
        this.name = name;
        this.age = age;
        this.MSC = MSC;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    boolean getMSC() {
        return this.MSC;
    }
}