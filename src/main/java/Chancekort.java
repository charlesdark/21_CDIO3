 public class Chancekort {
    private String description;
    private String action;
    private int value;

    Chancekort(String description, String action, int value){
        this.description = description;
        this.action = action;
        this.value = value;
    }

     public Chancekort() {
     }

     public int getValue(){return this.value;}
     public String getDescription(){return this.description;}
     public String getAction(){return this.action;}

}

