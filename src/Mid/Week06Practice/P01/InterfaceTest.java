package Mid.Week06Practice.P01;

public class InterfaceTest {
    public static void dbWork(DataAccessObject dao) {
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }
    public static void main(String[] args) {
        dbWork(new OracleDB("Oracle DB"));
        dbWork(new MySqlDB("MySql DB"));
    }
}
