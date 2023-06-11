import java.sql.*;

public class Uzytkownik {


    String url = "jdbc:mysql://localhost:3306/RejestracjaUzytkownikow";
    String user = "root";
    String pass = "";
    Statement stmt;
    Connection polaczenie;

    public void polaczenie(String imie, String haslo){
        try {
            String dodaj = "INSERT INTO Uzytkownicy(login, haslo) VALUES(?,?)";
            polaczenie = DriverManager.getConnection(url,user,pass);
            stmt = polaczenie.createStatement();
            PreparedStatement pstmt = polaczenie.prepareStatement(dodaj);
            pstmt.setString(1,imie);
            pstmt.setString(2,haslo);

            //ResultSet rs = stmt.executeQuery(dodaj);
            pstmt.executeUpdate();
            polaczenie.close();
            System.out.println("dodano nowego uzytkownika");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String polaczenieWynik(String zapytanie){
        try {
            String wynik = "";
            String dodaj = zapytanie;
            polaczenie = DriverManager.getConnection(url,user,pass);
            stmt = polaczenie.createStatement();
            //PreparedStatement pstmt = polaczenie.prepareStatement(dodaj);
            //pstmt.setString(1,imie);
            //pstmt.setString(2,haslo);

            ResultSet rs = stmt.executeQuery(dodaj);

            while(rs.next()){
                wynik += rs.getString(1) + rs.getString(2) + rs.getString(3) + "\n";
            }
            //pstmt.executeUpdate();
            polaczenie.close();
            return wynik;
            //System.out.println("dodano nowego uzytkownika");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


}
