package org.stepik.cources;

/*
* 3.76 WildCards
 */


public class WildCards {
    
}
class Food {}
class Bakery extends Food {}
class Cake extends Bakery {}
class Pie extends Bakery {}
class Tart extends Bakery {}
interface Box<T> {
    public void put(T item);
    public T get();
}
/**
    This packer has too much freedom and could repackage stuff in wrong direction.
    Fix method types in signature and add implementation. 
*/
class Packer {

    public void repackage(Box<? super Bakery> to, Box<? extends Bakery> from) {
        // Implement repackaging
        to.put(from.get());
    }

}