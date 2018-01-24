package com.filter.pattern.API.impl;

import com.filter.pattern.API.Criteria;
import com.filter.pattern.Model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by yangshunfan
 * 2018/1/24 14:25
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person :
                persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
