package com.hairuo.design.patterns.type.behavior.iterator;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.behavior.iterator
 * @Date: create in 2022-10-31
 */
public class HeroRepository implements Container{
    public String heros[] ={"MasterYi", "Yasuo", "EZ"};
    int index;

    @Override
    public Iteraror getIterator() {
        return new HeroIterator();
    }

    public class HeroIterator implements Iteraror{



        @Override
        public boolean hasNext() {
            if(index < heros.length){
                return true;
            }else {
                return false;
            }
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                String hero = heros[index];
                index++;
                return hero;
            }
            return null;
        }
    }
}
