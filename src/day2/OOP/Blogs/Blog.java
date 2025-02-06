package day2.OOP.Blogs;

import java.util.ArrayList;
import java.util.List;

/*ENKAPSULASI : cara untuk membatasi dan melindungi data/method dari access langsung
* untuk meningkatkan keamanan dari perubahan data yang tidak disengaja/sengaja*/
public class Blog {
    // disini enkapsulasinya
    private String title;
    private String content;
    /*List : interface yang menandakan bahwavariabel ini adalah sebuah list/daftar/array
    * kenapa pakai list suapa bisa menggunakan ArrayList*/
    private List<Comment> comments; // kumpulan komentar

    public Blog(String blogTitle, String blogContent){
        title = blogTitle;
        content = blogContent;
        comments = new ArrayList<>();
    }

    // getter blog
    public String getTitle(){return title;}
    public void setTitle(String newTitle){title = newTitle;}
    public String getContent(){return content;}
    public void setContent(String newContent){content = newContent;}

    //method blog
    public void displayInfo(){
        System.out.println("Title : "+ title);
        System.out.println("Content : "+ content);
    }

    public class Comment{
        private String author;
        private String text;

        public Comment(String name, String comment){
            author = name;
            text = comment;
        }

        //getter
        public String getAuthor(){return author;}
        public String getText(){return text;}
    }

    public void addComment (String author, String text){
        Comment newComment = new Comment(author, text);
        comments.add(newComment);
    }

    public void displayComments(){
        System.out.println("Comment : ");
        for (Comment comment : comments){
            System.out.println("Author : " + comment.getAuthor());
            System.out.println("Text : " + comment.getText());
        }
    }
}
