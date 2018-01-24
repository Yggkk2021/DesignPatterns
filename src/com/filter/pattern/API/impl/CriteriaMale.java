package com.filter.pattern.API.impl;

import com.filter.pattern.API.Criteria;
import com.filter.pattern.Model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by yangshunfan
 * 2018/1/24 14:17
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();

        for (Person person :
                malePersons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
