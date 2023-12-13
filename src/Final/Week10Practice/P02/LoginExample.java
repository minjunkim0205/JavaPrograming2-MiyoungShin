package Final.Week10Practice.P02;

public class LoginExample {
    public static void main(String[] args) {
        try {
            login("white", 12345);
        } catch(Exception e) {
            System.out.print(e.getMessage()+"\n"); // e.printStackTrace();
        }
        try {
            login("blue", 54321);
        } catch(Exception e) {
            System.out.print(e.getMessage()+"\n"); // e.printStackTrace();
        }
    }
    public static void login(final String id, final int password) throws WrongPasswordException, NotExistIDException{
        //id가 blue가 아니라면 NotExistIDException 발생시킴
        if(!(id.equals("blue"))) {
            throw (new NotExistIDException("id가 틀렸습니다."));// throw (new NotExistIDException());
        }
        //password가 12345가 아니라면 WrongPasswordException 발생시킴
        if(!(password == 12345)) {
            throw (new WrongPasswordException("password가 틀렸습니다."));// throw (new WrongPasswordException());
        }
    }
}
