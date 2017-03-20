import java.util.ArrayList;
import java.util.List;

//题意：实现在一个随机序列中增加、删除的功能，以及获取随机数的功能，序列中不能有重复的数字

//用list存储元素，不重复即可添加，有即可删除
//获取随机数：（1）定义：java.util.Random rand = new java.util.Random(); （2）return list.get(rand.nextInt(list.size()));
public class RandomizedSet {
    /** Initialize your data structure here. */
    List<Integer> list;
    java.util.Random rand = new java.util.Random();
    public RandomizedSet() {
        list = new ArrayList<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(list.contains(val))
            return false;
        else{
            list.add(val);
            return true;
        }
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!list.contains(val))
            return false;
        else{
            list.remove(list.indexOf(val));
            return true;
        }
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */