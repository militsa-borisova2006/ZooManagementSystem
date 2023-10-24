package bg.smg;

import java.util.ArrayList;
import java.util.List;
public class Document {
    private  List<String>authors;
    Document(){
        authors = new ArrayList<>();
    }
    Document (List<String> authors){
        this.authors=authors;
    }

}
