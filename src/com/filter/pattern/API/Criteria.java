package com.filter.pattern.API;

import com.filter.pattern.Model.Person;
import java.util.List;

/**
 * Create by yangshunfan
 * 2018/1/24 14:13
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
