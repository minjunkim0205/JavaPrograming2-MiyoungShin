package Final.Week10Theory.Ex01;

public class Member {
    /*Field*/
    private String id;
    /*Constructor*/
    Member(final String id){
        this.id = id;
    }
    /*Method*/
    public String getId(){
        return (this.id);
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Member){
            Member member = (Member)obj;
            if(this.id.equals(member.getId())){
                return (true);
            }
        }
        return (false);
    }
    /*ToString*/
}
