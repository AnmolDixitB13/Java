
// basic CRUD operations on maps

import java.util.HashMap ;
import java.util.Map ;

class Main {
    public static void main(String[] args) {
        
        HashMap<Integer, String> students = new HashMap<>() ;
        
        students.put(1, "abc") ;
        students.put(2, "def") ;
        
        // students.computeIfPresent(1, (k, v) -> { return v = "www"; }) ;
        
        // students.computeIfPresent(1, (k, v) ->  v = "www") ;
        
        // students.put(2, "bbb") ;
        
        // students.replace(1, "qqq") ;
        
        // students.replace(1, "abc", "yyy") ;
        
        // students.merge(2, "uvw", (old, neww) -> { return neww ; }) ;
    
        // all work well, updates the value
        
        
        
        
        // students.putIfAbsent(3, "ghi") ;
        // students.computeIfAbsent(10, v -> "ddd") ;
        
        // works well, adds a new reocrd
        
        
        
        
        // students.computeIfPresent(1, (k, v) -> "ddd") ;
        // this method does not add a new record into the map because it assumes that the record is already present. It can update value, as it does here. If record is absent, it does nothing
        
        
        
        
        // students.remove(2) ;
        // works well, removes the respective record
        
        
        
        
        // students.clear() ;
        // removesa all the records from the map
        
        
        System.out.println(students);
    }
}

/*
one might get confused as to how many parameters to pass in general ?

if the method deals with a record which is already present in the map, say computeIfPresent(), we will
have to pass 2 parameters into its function, key & val. Otherwise, 1 parameter is sufficient, as in 
computeIfAbsent().
*/
