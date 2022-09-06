package com.atguigu.generic;

import java.util.*;

public class Dao<T> {
    private Map<String,T> map = new HashMap<>();

    public void add(String key,T value){
        map.put(key,value);
    }

    public T get(String id){
        return map.get(id);
    }

    public void update(String key,T value){
        if (map.containsKey(key)){
            map.put(key,value);
        }
    }

    public List<T> list(){
        ArrayList<T> list = new ArrayList<>();
        Collection<T> values = map.values();
        for (T value : values){
            list.add(value);
        }
        return list;
    }


    public void delete(String id){
        map.remove(id);
    }


}


class DaoTest{
    public static void main(String[] args) {
        Dao<Person> dao = new Dao<>();
        dao.add("1",new Person<String,Integer>("大司马",99));
        dao.add("2",new Person<String,Integer>("白鹿",29));
        List<Person> list = dao.list();
        for (Person p : list){
            System.out.println(p);
        }

        System.out.println(dao.get("2"));

        dao.update("1",new Person<>("大司马",33));

        dao.delete("2");

        System.out.println("*************");

        List<Person> list1 = dao.list();
        list1.forEach(System.out::println);

    }
}


class Person<T,E>{
    private T name;
    private E age;

    public Person(){}

    public Person(T name, E age) {
        this.name = name;
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public E getAge() {
        return age;
    }

    public void setAge(E age) {
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person<?, ?> person = (Person<?, ?>) o;

        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        return age != null ? age.equals(person.age) : person.age == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}