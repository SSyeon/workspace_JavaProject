import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class ColorGUI extends JFrame implements ActionListener {
Connection conn=null;
PreparedStatement pstmt = null;
JMenuBar menuBar;
JMenu menu1;
JMenu menu2;
JMenuItem exit;
JButton signUp,signIn;
JTextField ID,PW;


ColorGUI() {
	try {

		Class.forName("org.gjt.mm.mysql.Driver").newInstance();
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javap2", "root", "mirim2");
		System.out.println("DB 연결 완료");
		String sql = "select * from colorank";
		pstmt= conn.prepareStatement(sql);
		ResultSet srs = pstmt.executeQuery();
		while(srs.next()){
			System.out.print(srs.getString("id")+" |");
			System.out.print(srs.getString("pw"));
			System.out.println();
			}
			}catch(SQLException ex) {
			System.out.println("SQLException:" + ex);
			}catch(Exception ex) {
			System.out.println("Exception:" + ex);
			}finally{
			if(conn != null)
			try{ conn.close();
			}catch(SQLException sqle){}
			if(pstmt != null)
			try{ pstmt.close();
			}catch(SQLException sqle){}
			}

setTitle("ColorGAME");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

Container c = getContentPane();
menuBar = new JMenuBar(); // JMenuBar 컴포넌트를 생성
menu2 = new JMenu("종료");
menuBar.add(menu2); 
setJMenuBar(menuBar);
exit = new JMenuItem("나가기");
exit.addActionListener(this); // exit 메뉴에 대한 이벤트 리스너를 등록
menu2.add(exit); // 메뉴 아이템을 메뉴에 붙인다
menuBar.add(menu2); // 메뉴를 메뉴바에 붙인다
setJMenuBar(menuBar); // 메뉴바를 프레임에 붙인다
c.setLayout(new FlowLayout());
c.add(new JLabel("ID : "));
c.add(ID=new JTextField(10));
c.add(new JLabel("PW : "));
c.add(PW=new JPasswordField(10));
signUp=new JButton("회원가입");
signUp.addActionListener(this);
c.add(signUp);
c.add(signIn=new JButton("로그인"));


setSize(350,500);
setVisible(true);

}
private static void handleError(String string) {
System.out.println(string);
System.exit(1);
}
private void insertMember(String n1, String n2) {
try{ 
String sql = "insert into colorank(id, pass) VALUES (?, ?)";
PreparedStatement pre = conn.prepareStatement(sql);
pre.setString(1,n1);
pre.setString(2,n2);

pre.executeUpdate();
ID.setText("");
PW.setText("");
pre.close(); 
}catch (Exception e){
handleError(e.getMessage());
}
}
@Override
public void actionPerformed(ActionEvent e) {
if (e.getSource() == exit) { // 종료
System.exit(0);
}
else if(e.getSource() == signUp) {
	String id = ID.getText();
	System.out.println(id);
	String pw = PW.getText();
	System.out.println(pw);
	insertMember(id, pw);
	
}
else if(e.getSource()==signIn) {
	//아이디 맞는지 확인하고
	//패널ㅇ이 바뀌는 win.change("ㅇㅇ");
}
}


public static void main(String ar[]) {
	new ColorGUI();
}
}