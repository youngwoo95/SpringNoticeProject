import java.awt.*;
import java.sql.*;

public class Main {
    /* 진입점 */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1. load driver
        /*
        * 외부 라이브러리
        *   -> Gradle:com.mysql:mysql-connector-j:9.3.0
        *       -> mysql-connector-j-9.3.0.jar
        *           -> comm.mysql
        *               -> jdbc
        *                   -> Driver
        * */
        Class.forName("com.mysql.cj.jdbc.Driver"); // 로딩할 데이터베이스 클래스 이름

        // 2. get connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","rladyddn!!95");

        /************************************************ 쿼리 **************************************************************/

        // [기본]
        //PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM member"); // 실행할 쿼리

        // [조건문]
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM member WHERE id > ?");
        preparedStatement.setLong(1, 2L); // 인덱스, 값

        ResultSet resultSet = preparedStatement.executeQuery(); // 쿼리 실행후 결과반환.

        while (resultSet.next()){
            var member = new Member(
             resultSet.getLong("id"), // id 컬럼을 가져온다.
             resultSet.getString("name"), // name 컬럼을 가져온다.
             resultSet.getString("email"), // email 컬럼을 가져온다.
             resultSet.getInt("age")); // age 컬럼을 가져온다.

            System.out.println("회원 = " + member);
        }

        System.out.println(" ------------------------------------ ");

        preparedStatement.setLong(1, 3L); // 인덱스, 값
        resultSet = preparedStatement.executeQuery(); // 쿼리 실행후 결과반환.

        while (resultSet.next()){
            var member = new Member(
                    resultSet.getLong("id"), // id 컬럼을 가져온다.
                    resultSet.getString("name"), // name 컬럼을 가져온다.
                    resultSet.getString("email"), // email 컬럼을 가져온다.
                    resultSet.getInt("age")); // age 컬럼을 가져온다.

            System.out.println("회원 = " + member);
        }

        /************************************************ 쿼리 **************************************************************/

        // close
        connection.close();

    }
}
