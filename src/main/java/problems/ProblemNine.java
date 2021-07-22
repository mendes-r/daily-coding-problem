package problems;

import java.util.ArrayList;

public class ProblemNine {

    /**
     * The power set of a set is the set of all its subsets. 
     * Write a function that, given a set, generates its power set.
     * For example, given the set {1, 2, 3}, 
     * it should return {{}, {1}, {2}, {3}, {1, 2}, {1, 3}, {2, 3}, {1, 2, 3}}
     * 
     * In mathematics, the power set of a set S is the set of all subsets of S, 
     * including the empty set and S itself
     * 
     * @return
     */
    public ArrayList<ArrayList<Integer>> answer(int[] set){
        ArrayList<ArrayList<Integer>> powerSet = new ArrayList<>();
        ArrayList<Integer> subSet = new ArrayList<>();
        powerSet.add(subSet);
        return getPowerSet(set, powerSet, subSet, 0);;
    }

    private ArrayList<ArrayList<Integer>> getPowerSet(int[] set, ArrayList<ArrayList<Integer>> powerSet, ArrayList<Integer> subSet, int index){

        for (int i = index; i < set.length; i++){
            subSet.add(set[i]);
            //Add a clone of the subSet to the powerSet
            powerSet.add((ArrayList<Integer>)subSet.clone());
            getPowerSet(set, powerSet, subSet, i + 1);
            //After the branching the last added element must be remove
            //so the next iteration can start from scratch
            subSet.remove(subSet.size() - 1);
        }
        return powerSet;
    }
    
}
