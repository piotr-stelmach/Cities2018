
package Blog2018;

import java.util.ArrayList;
import java.util.List;

public class Note {
    private String title,content;
    private List<Comment> comments=new ArrayList();

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void add(Comment comment){
        comments.add(comment);
    }

    @Override
    public String toString() {
        return "Note{" + "title=" + title + ", content=" + content + ", comments=" + comments + '}';
    }
    
    
}
