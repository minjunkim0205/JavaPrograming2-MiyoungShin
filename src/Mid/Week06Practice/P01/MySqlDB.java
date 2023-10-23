package Mid.Week06Practice.P01;

public class MySqlDB implements DataAccessObject{
    /*Private*/
    private String name;
    /*Static*/
    /*Constructor*/
    MySqlDB(final String name){
        this.name = name;
    }
    /*Abstract*/
    public void select(){
        System.out.print(this.name+"에서 검색\n");
    }
    public void insert(){
        System.out.print(this.name+"에 삽입\n");
    }
    public void update(){
        System.out.print(this.name+"를 수정\n");
    }
    public void delete(){
        System.out.print(this.name+"에서 삭제\n");
    }
    /*Public*/
    /*ToString*/
}
