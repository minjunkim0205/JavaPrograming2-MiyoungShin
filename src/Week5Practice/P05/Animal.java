package Week5Practice.P05;

abstract class Animal {
    /*Private*/
    private String name;
    /*Static*/
    /*Constructor*/
    Animal(){
        this.name = "Anonymous";
    }
    Animal(final String name){
        this.name = name;
    }
    /*Abstract*/
    abstract void sound();
    /*Public*/
    public String getName(){
        return (this.name);
    }
    public String reaction(final Animal ani){
        if(ani instanceof Cat){
            return ("꼬리내리고 ");
        } else if(ani instanceof Dog){
            return ("꼬리올리고 ");
        } else {
            return ("Err");
        }
    }
    /*ToString*/
}