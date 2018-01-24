package com.filter.pattern.API.impl;

import com.filter.pattern.API.Criteria;
import com.filter.pattern.Model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by yangshunfan
 * 2018/1/24 14:22
 */
public class CriteriaFemale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
