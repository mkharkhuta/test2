package taco.q13.exampletransient;

import java.io.Serializable;
import lombok.Data;

@Data
public class Book implements Serializable {

    private static final long serialVersionUID = -2936687026040726549L;

    private String bookName;
    private transient String description;
    private transient int copies;
    private final transient String bookCategory = "Fiction";

    private final transient String bookCategoryNewOperator = "Fiction with new Operator";
}