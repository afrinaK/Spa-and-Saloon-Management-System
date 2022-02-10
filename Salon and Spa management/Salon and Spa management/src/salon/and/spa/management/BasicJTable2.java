
package salon.and.spa.management;

import javax.swing.table.DefaultTableModel; 
import javax.swing.JTable; 
import javax.swing.JFrame; 
import javax.swing.JPanel; 
import javax.swing.JScrollPane; 
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent; 
import java.awt.BorderLayout; 
import java.awt.Dimension; 
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
public class BasicJTable2 extends JFrame implements ActionListener { 
   private Object[][] data; 
   private String[] columnNames = {"Name","Day","Month","Time","Phone number","Email","ID"}; 
   private DefaultTableModel tableModel; 
   private JTable table; 
   private SimpleBookList2 myList;
  public BasicJTable2(String title) { 
      super(title); 
      setBounds(100,100,900,1000); 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myList = new SimpleBookList2();
      myList.readFromCSV("sample.csv");
      data = myList.convert2Data();
      tableModel = new DefaultTableModel(data, columnNames); 
      table = new JTable(tableModel); 
      table.setAutoCreateRowSorter(true);
      JScrollPane scrollPane = new JScrollPane(table); 
      scrollPane.setPreferredSize(new Dimension(880,880)); 
      JPanel panel = new JPanel(); 
      panel.add(scrollPane); 
      add(panel,BorderLayout.CENTER);
    
   } 
  public void actionPerformed(ActionEvent ae) { 
  } 
   public static void main(String[] args) { 
      BasicJTable2 myApp = new BasicJTable2("Basic JTable"); 
      myApp.setVisible(true); 
   } 

    
}
