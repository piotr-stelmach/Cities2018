
package Blog2018;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    private List<Note> notes=new ArrayList();
    private String title;

    public Blog(String title) {
        this.title = title;
    }
    
    
    public void add(Note note){
        notes.add(note);
    }

    @Override
    public String toString() {
        
      
    }
    
    
}
