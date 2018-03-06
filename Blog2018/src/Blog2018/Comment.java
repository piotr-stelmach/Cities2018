
package Blog2018;

import java.time.LocalDate;
import java.util.Date;

public class Comment {
    private String content;
    private String author;
    private LocalDate date;

    public Comment(String author, String content) {
        this.content = content;
        this.author = author;
        this.date=LocalDate.now();
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Comment{" + "content=" + content + ", author=" + author + ", date=" + date + '}';
    }
    
    
    
    
    
}
