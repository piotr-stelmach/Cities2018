
package Blog2018;

public class Main {
    public static void main(String[] args){
        Blog b=new Blog("Programista na uczelni");
        Note n=new Note("Pierwszy wpis","Pierwszy tekst");
        Note n2=new Note("kolekcje","Kolekcje java");
        Note n3=new Note("Generyki","Generyki w javie");
        Comment c=new Comment("Piotr","Nawet dobry ten wpis");
        b.add(n);
        b.add(n2);
        b.add(n3);
        n.add(c);
        Comment c1=new Comment("Kamil","Ale łatwe");
        n.add(c1);
        Comment c2=new Comment("Szymon","Troche nie do konca o to co mi chodzilo");
        n.add(c2);
        
        System.out.println(b);
    }
}
