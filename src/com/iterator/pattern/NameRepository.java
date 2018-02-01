package com.iterator.pattern;

/**
 * Create by yangshunfan
 * 2018/2/1 13:40
 * 姓名仓库
 * 实现了Container接口，该类有实现了 Iterator 接口的内部类 NameIterator。
 */
public class NameRepository implements Container{

    public String names[] = {"yangshunfan","Jack","Niko","Marry"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if(index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
