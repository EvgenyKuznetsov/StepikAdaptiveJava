package org.stepik.cources;

import java.util.List;
import java.util.function.IntPredicate;

/*
* 3.45 Composing predicates.
 */

public class ComposingPredicates {
    public static void main(String[] args){
        
    }
    
    public static IntPredicate disjunctAll(List<IntPredicate> predicates) {
        return predicates.stream().reduce(IntPredicate::or).orElse(x -> false);
    }
}