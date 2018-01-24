package com.filter.pattern.API.impl;

import com.filter.pattern.API.Criteria;
import com.filter.pattern.Model.Person;

import java.util.List;

/**
 * Create by yangshunfan
 * 2018/1/24 14:37
 */
public class AndCriteria implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPerson = criteria.meetCriteria(persons);
        return firstCriteriaPerson;
    }
}
